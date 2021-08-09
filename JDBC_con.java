package Banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_con {
	
	public static void main(String[] args) {
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost","root","root");
			Statement stmnt=con.createStatement();
						
			customer_details obj=new customer_details();
			
			obj.createDB(con, stmnt);
			obj.createCustomer_Details(con, stmnt);
			obj.insertCustomer_Details(con, stmnt);
			obj.selectCustomer_Details(con, stmnt);
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
