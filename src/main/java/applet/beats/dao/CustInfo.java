package applet.beats.dao;
import applet.beats.bean.QBean;
import java.sql.*;
import java.util.*;
 





public class CustInfo {
	
String sql = "select * from info"; 	


public ArrayList<QBean> getCustList() {
	
	ArrayList<QBean> cust_list = new ArrayList<QBean>();
	

	
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
			
			qbean.setFName(result.getString("f_name"));
			qbean.setLName(result.getString("l_name"));
			qbean.setAddress(result.getString("address"));
			qbean.setPhone(result.getInt("phone"));
			qbean.setEmail(result.getString("email"));
			qbean.setCity(result.getString("city"));
			qbean.setState(result.getString("state"));
			qbean.setZip (result.getInt("zip"));
			qbean.setCardInfo(result.getInt("card_info"));
	
			cust_list.add(qbean);
			
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
		

	
	return cust_list; 
     }
		
}


	
	 
	 




	
	
