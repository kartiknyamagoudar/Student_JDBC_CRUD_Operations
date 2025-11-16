package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "Root@123");
		Statement s1 = c.createStatement();
		s1.execute("create table Students(stdid int primary key not null, name varchar(20) not null,sub1 int not null, sub2 int not null,sub3 int not null)");
		System.out.println("Table created successfull...");
		s1.close();

	}

}
