package Library;

public class LibraryApp {
    public static void main(String[] args) {
    	LibrarianController controller = new LibrarianController();
    	Library lib = new Library();
    	
    	//Add members
    	lib.createMember("Alex");
    	lib.createMember("Daunte");
    	lib.createMember("Gursheen");
    }
}
