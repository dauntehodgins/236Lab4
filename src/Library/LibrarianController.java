//Creator: Designate a class to handle the creation of objects, promoting clear ownership.
package Library;

public class LibrarianController {
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of LibrarianController class
    public void borrowBook(Member m, Book b){
        if(b.isAvailable()){
            b.setAvailablity();
            m.BorrowBook(b);
        }else{
            System.out.println("Book " + b.getTitle() + " is not available");
        }
    }
    public void returnBook(Member m, Book b){
        m.returnBook(b);
        b.setAvailablity();
        //this will ensure the book is available (isAvailable == True) when it's returned
        if(b.isAvailable()){
            System.out.println("Book " + b.getTitle() + " is returned");
        }else{
            b.setAvailablity();
        }
    }

}
