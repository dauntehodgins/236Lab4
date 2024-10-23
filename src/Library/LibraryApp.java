package Library;

public class LibraryApp {
    public static void main(String[] args) {
        //Instantiate Creator
        Library lib = new Library();

        //Members
        lib.createMember("Alex");
        lib.createMember("Daunte");
        lib.createMember("Gursheen");
        Member alex = lib.getMember("Alex");
        Member daunte = lib.getMember("Daunte");
        Member gursheen = lib.getMember("Gursheen");

        lib.printMembers();

        //Books
        lib.createBook("Dune", "Frank Herbert");
        lib.createBook("Moby Dick", "Herman Melville");
        lib.createBook("1984", "George Orwell");
        Book dune = lib.getBook("Dune");
        Book mobyDickoby = lib.getBook("Moby Dick");
        Book nineteen = lib.getBook("1984");

        lib.printCatalog();

        //borrowing and returning
        LibrarianController libc = new LibrarianController();
        libc.borrowBook(alex, dune);
        lib.printCatalog();
        libc.returnBook(alex, dune);
        lib.printCatalog();

        //Test - two people try to borrow the same book
        libc.borrowBook(daunte, dune);
        libc.borrowBook(gursheen, dune);
    }
}
