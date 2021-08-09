package Banking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class customer_details {
	
	String sql;
	Scanner sc=new Scanner(System.in);
	
	void createDB(Connection con, Statement stmnt) throws SQLException{
		sql="create database banking";
		stmnt.executeUpdate(sql);
		System.out.println("Database created successfully!");
	}

	void createCustomer_Details(Connection con1, Statement st) throws SQLException {
		sql="use banking";
		st.executeUpdate(sql);
		sql = "create table customer_details (id int auto_increment primary key, name varchar(50) not null, age int not null)";
		st.executeUpdate(sql);
		System.out.println("Table created successfully!");
	}	
	
	void insertCustomer_Details(Connection con1, Statement st) throws SQLException {
		sql="use banking";
		st.executeUpdate(sql);
		System.out.println("Inserting customer details: \n");
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		sql="insert into customer_details (name,age) values ('"+name+"','"+age+"')";
		st.executeUpdate(sql);
		System.out.println("Insertion succesfull!  ");
		
	}
		
	void selectCustomer_Details(Connection con1, Statement st) throws SQLException {
		sql="use banking";
		st.executeUpdate(sql);
		ResultSet rs=st.executeQuery("select * from customer_details");
		System.out.println("\nCustomer Details:");
		while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
		
	}

	
}
