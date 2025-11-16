package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	static Scanner sc = new Scanner(System.in);

	public static void DeleteData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Root@123");
		PreparedStatement p = c.prepareStatement("delete from Students where stdid = ?");
		
		System.out.println("Enter Student id to delete : ");
		int sid = sc.nextInt();
		p.setInt(1, sid);
		p.execute();
		System.out.println("Student data delete successfull...");
		
	}

}
