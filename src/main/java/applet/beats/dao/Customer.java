package applet.beats.dao;
import applet.beats.bean.QBean;
import java.sql.*;



public class Customer {
	
public int customerInfo (QBean customer) throws ClassNotFoundException {
	
	
String sql = "INSERT INTO info (F_NAME, L_NAME, ADDRESS, PHONE, EMAIL, CITY, STATE, ZIP, CARD_INFO) VALUES (?,?,?,?,?,?,?,?,?)"; 

int result = 0;

Class.forName("com.mysql.cj.jdbc.Driver");

try {
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quest", "root", "root");

PreparedStatement preparedStmt = conn.prepareStatement(sql);

preparedStmt.setString(1, customer.getFName());
preparedStmt.setString(2, customer.getLName());
preparedStmt.setString(3, customer.getAddress());
preparedStmt.setInt(4, customer.getPhone());
preparedStmt.setString(5, customer.getEmail());
preparedStmt.setString(6, customer.getCity());
preparedStmt.setString(7, customer.getState());
preparedStmt.setInt(8, customer.getZip());
preparedStmt.setInt(9, customer.getCardInfo());


result = preparedStmt.executeUpdate();

System.out.println("Connection was success");
	
}

catch (SQLException e) {
	
	System.out.println("Connection was a failure");
	e.printStackTrace();
	
}


return result; 

  }
}


	
	 
	 




	
	
