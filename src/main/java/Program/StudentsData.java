package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentsData {

	public static void ViewData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Root@123");
		PreparedStatement p = c.prepareStatement("select * from Students");
		
		ResultSet r = p.executeQuery();
		while(r.next()) {
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getInt(4)+" "+r.getInt(5));
		

	}
		p.execute();
	}
}
