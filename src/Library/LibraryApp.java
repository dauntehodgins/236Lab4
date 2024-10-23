package Library;

public class LibraryApp {
    public static void main(String[] args) {
        //Instantiate Creator
        Library lib = new LibraryApp();
        Lib.createMember("Alex");
        Lib.createMember("Daunte");
        Lib.createMember("Gursheen");

        lib.printMembers();
    }
}
