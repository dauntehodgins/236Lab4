package Library;

public class LibraryApp {
    public static void main(String[] args) {
        //Instantiate Creator
        Library lib = new Library();

        //Members
        System.out.println();
        System.out.println("---Creating members---");
        System.out.println();
        lib.createMember("Alex");
        lib.createMember("Daunte");
        lib.createMember("Gursheen");
        //getting references to member objects
        Member alex = lib.getMember("Alex");
        Member daunte = lib.getMember("Daunte");
        Member gursheen = lib.getMember("Gursheen");

        System.out.println();
        System.out.println("---Printing all members---");
        System.out.println();
        lib.printMembers();

        //Books
        lib.createBook("Dune", "Frank Herbert");
        lib.createBook("Moby Dick", "Herman Melville");
        lib.createBook("1984", "George Orwell");
        //getting references to book objects
        Book dune = lib.getBook("Dune");
        Book mobyDick = lib.getBook("Moby Dick");
        Book nineteen = lib.getBook("1984");
        System.out.println();
        System.out.println("---Printing all books---");
        System.out.println();
        lib.printCatalog();

        //borrowing and returning
        LibrarianController libc = new LibrarianController();
        System.out.println();
        System.out.println("---Borrowing and returning books---");
        System.out.println();
        libc.borrowBook(alex, dune);
        lib.printCatalog();
        System.out.println();
        libc.returnBook(alex, dune);
        lib.printCatalog();

        //Test - two people try to borrow the same book
        System.out.println();
        System.out.println("---TEST: Two members borrow the same book---");
        System.out.println();
        libc.borrowBook(daunte, mobyDick);
        libc.borrowBook(gursheen, mobyDick);

        //Test: print available books
        System.out.println();
        System.out.println("---Printing all available books---");
        System.out.println();
        lib.getAvailableBooks();
    }
}
