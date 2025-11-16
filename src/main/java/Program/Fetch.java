package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fetch {
	static Scanner sc = new Scanner(System.in);

	public static void FetchData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Root@123");
		PreparedStatement p = c.prepareStatement("select * from Students where stdid = ?");
		
		System.out.println("enter the student id to fetch data : ");
		int sid = sc.nextInt();
		p.setInt(1, sid);
		
		ResultSet r = p.executeQuery();
		r.next();
		
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getInt(4)+" "+r.getInt(5));
		System.out.println("Student data fetched successfull...");

	}

}
