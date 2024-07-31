package libraryManagement;

public class Library {
	
      private Book[] books; // Array to store Book objects
      private int count;  // To keep track of the number of books in the library
      
      public Library(int capacity) {
    	  books=new Book[capacity]; // Initialize the books array with the given capacity
    	  count=0;  // Initialize count to 0, as there are no books initially
      }
      
   // Add book to library
      public void addBook(Book book) {
          if (count < books.length) { // If library has space
              books[count] = book;    // we are adding new book in count position
              count++;                // after added book count will increase
              System.out.println("Book successfully added");
          } else {
              System.out.println("Library is full, cannot add more books."); 
          }
      }
   // Remove book from library using ISBN
      public void removeBook(String ISBN) {
          for (int i = 0; i < count; i++) { // Loop through all the books in the library
              if (books[i].getISBN().equals(ISBN)) { // Check if the current book's ISBN matches the given ISBN
                  books[i] = books[count - 1]; // Replace the book to be removed with the last book in the array
                  books[count - 1] = null;     // Remove the last book by setting its position to null
                  count--;                     // Decrease the count as one book is removed
                  System.out.println("Book removed successfully."); // Confirm removal
                  return; // Exit the method after removing the book
              }
          }
          System.out.println("Book not found."); // If no book with the given ISBN is found, print a message
      }

   // Display all books in the library
      public void displayBooks() {
          if (count == 0) { //If library empty
              System.out.println("No books in the library."); 
              return; // we are stopping the method
          }
          for (int i = 0; i < count; i++) { // will display all books
              books[i].displayBookDetails(); // will display each books details in Book class
              System.out.println(); // single line print for readability
          }
      }
}
