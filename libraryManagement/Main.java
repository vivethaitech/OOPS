package libraryManagement;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library(5);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println();
			System.out.println("Welcome to Library Management System Created by Vivetha Baskaran");
			System.out.println();
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Display Books");
			System.out.println("4. Exit");
			System.out.println("Kindly Enter Your Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the title of the book");
				String title = sc.nextLine();
				System.out.println("Enter the author of the book");
				String author = sc.nextLine();
				System.out.println("Enter the ISBN of the book");
				String ISBN = sc.nextLine();
				Book book = new Book(title,author,ISBN);
				library.addBook(book);
				break;
				
			case 2:
				System.out.println("Enter the ISBN of the book");
				String removeISBN = sc.next();
				library.removeBook(removeISBN);
				break;
				
			case 3:
				library.displayBooks();
				break;
				
			case 4:
				System.out.println("Exiting....");
				sc.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice! Please try again");
			}
		}

	}

}
