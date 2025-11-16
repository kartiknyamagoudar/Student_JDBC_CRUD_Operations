package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	static Scanner sc = new Scanner(System.in);

	public static void InsertData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Root@123");
		PreparedStatement p = c.prepareStatement("insert into Students values(?,?,?,?,?)");
		
		System.out.println("enter student id : ");
		int sid = sc.nextInt();
		p.setInt(1, sid);
		
		System.out.println("enter student Name : ");
		String name = sc.next();
		p.setString(2, name);
		
		System.out.println("enter Subject 1 Marks : ");
		int sub1 = sc.nextInt();
		p.setInt(3, sub1);
		
		System.out.println("enter Subject 2 Marks : ");
		int sub2 = sc.nextInt();
		p.setInt(4, sub2);
		
		System.out.println("enter Subject 3 Marks : ");
		int sub3 = sc.nextInt();
		p.setInt(5, sub3);
		
		p.execute();
		System.out.println("Student Data Inserted Successfull...");
	}

}
