package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	static Scanner sc= new Scanner(System.in);

	public static void UpdateData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Root@123");
		
		PreparedStatement p = c.prepareStatement("update Students set name = ?, sub1=?, sub2=?, sub3=? where stdid = ?");
		System.out.println("enter student id to update : ");
		int sid = sc.nextInt();
		p.setInt(5, sid);
		
		System.out.println("enter updated name : ");
		String name = sc.next();
		p.setString(1, name);
		
		System.out.println("enter updated Subject 1 Marks : ");
		int sub1 = sc.nextInt();
		p.setInt(2, sub1);
		
		System.out.println("enter updated Subject 2 Marks : ");
		int sub2 = sc.nextInt();
		p.setInt(3, sub2);
		
		System.out.println("enter updated Subject 3 Marks : ");
		int sub3 = sc.nextInt();
		p.setInt(4, sub3);
		
		p.execute();
		System.out.println("Student data updated successfull...");
	}

}
