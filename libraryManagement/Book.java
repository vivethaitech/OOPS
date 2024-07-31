package libraryManagement;

public class Book {
	private String title;
    private String author;
    private String ISBN;
    
    public Book(String title, String author, String ISBN) {
    	this.title=title;
    	this.author=author;
    	this.ISBN=ISBN;
    }

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}
    
	public void displayBookDetails() {
		System.out.println(" BOOK :" +getTitle());
		System.out.println(" Author :" +getAuthor());
		System.out.println(" ISBN :" +getISBN());
	}
}
