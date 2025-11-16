package Program;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("===== Student DataBase Management =====");
			System.out.println("1.Insert Student Data ");
			System.out.println("2. Update Student Data ");
			System.out.println("3. Fetch Student Data ");
			System.out.println("4. Delete Student Data ");
			System.out.println("5. View All Students Data ");
			System.out.println("6. Exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Insert.InsertData();
				break;
			case 2:
				Update.UpdateData();
				break;
			case 3:
				Fetch.FetchData();
				break;
			case 4:
				Delete.DeleteData();
				break;
			case 5:
				StudentsData.ViewData();
				break;
			case 6:
				System.out.println("Exiting... Goodbye!");
                break;
			default:
				System.out.println("Invalid choice. Try again!");
			}
		} while (choice != 6);
		
		sc.close();
			
			}
		

	}


