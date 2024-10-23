//Creator: Designate a class to handle the creation of objects, promoting clear ownership.
//Controller: Use a class to manage the flow of control in the system, acting as a mediator.
//Creator: Designate a class to handle the creation of objects, promoting clear ownership.


//	Manage the catalog of books and members.
//	Track which books are borrowed and available
package Library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	private ArrayList<Book> catalog;
    private HashMap<String , Member> members = new HashMap<>();
    private int ID = 0;
    //private ArrayList<Book> borrowedBooks;

	// TODO: implement functionality of Library class

    /**
     *
     * @param title - title of the book
     * @param author - author of the book
     */
    public void createBook(String title, String author){
        Book book = new Book(title, author);
        catalog.add(book);
        //TODO: Handle cases where a book with the same title is already in the system
        //Book.available() maybe? keep track of how many of the same books are available
    }
    
    /**
     * 
     * @param title - title of the book we are looking for
     * @return true if book is found.
     */
    public boolean findBook(String title) {
    	for(Book b : catalog) {
    		if(b.getTitle().contains(title)) {
    			System.out.println("Found " + b.toString());
    			return true;
    		}
    	}
    	return false;
    }

    /**
     *
     * @param name - the name of the member being created
     *
     *             ID will auto-increment when creating a member
     *
     *             A hashmap is used to store members,
     *             Key - member name
     *             Value - member object
     */
    public void createMember(String name){
        Member member = new Member(name, ID++);
        members.put(name, member);
        System.out.println("Member:" + member.getName() + " With ID: " + member.getMemberID() + ". Created.");
    }
    
    public void printCatalog() {
    	for(Book b : catalog) {
    		System.out.println(b.toString());
    	}
    }
    
    public boolean lookUpMember(String memberName){
    	
    if(members.containsKey(memberName)==true) {
    	
    	System.out.println(members.get(memberName).toString());
    	return true;
    	
    }	
    	return false;
    }
    
    

}
