package applet.beats.dao;
import applet.beats.bean.QBean;  
import java.sql.*;
import java.util.*;





public class SelectBooks {
	
	String sql = "SELECT * FROM books";
	
	
	//Get getBookInv is also used in the servlet
	public ArrayList<QBean> getBookInv() {
		
		ArrayList<QBean> book_inv = new ArrayList<QBean>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		     System.out.println("Driver registered");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The Driver is not found");
			e.printStackTrace();
		}
		
		
		

		try {
			
			
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quest", "root", "root");
			
			PreparedStatement preparedStmt = conn.prepareStatement(sql);
			
			
			ResultSet result = preparedStmt.executeQuery();
			
			while (result.next()) {
				
				
				QBean qbean = new QBean();
				
				
				qbean.setSku(result.getString("q_sku"));
				qbean.setTitle(result.getString("q_title"));
				qbean.setDesc(result.getString("q_desc"));
				qbean.setPrice(Double.parseDouble((result.getString("q_price"))));
				qbean.setImage(result.getString("q_image"));
				
				book_inv.add(qbean);
				
				System.out.println("Connection was successful");
			
				//preparedStmt.close();
				//conn.close();
			}
		
		}
			catch (SQLException e) {
				
				{   
					
					e.printStackTrace(); 
		            System.out.println("Unable to connect to database");   
		        }   
		
		
		
			}
			
	
		
		return book_inv; 
	     }
			
	}
		
	