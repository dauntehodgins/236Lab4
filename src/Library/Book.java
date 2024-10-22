//Information Expert: Assign responsibilities to the class that has the needed information to perform them.
package Library;
 
public class Book {
	private String title;
	private String author;
	private boolean isAvailable;


	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	public boolean setAvailablity() {
		this.isAvailable = !isAvailable;
		return isAvailable;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public String toString() {
		return "Title: " + title + ",by Author: " + author + ", is currently " + (isAvailable ? "available" : "not available");
	}
	
	// TODO: implement Book functionality 
	
}
