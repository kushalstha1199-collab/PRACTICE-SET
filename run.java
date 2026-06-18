public class run {
    public static void main(String[] args) {

        Searchable b1 = new EBook();
        Searchable b2 = new PhysicalBook();

        b1.search("Java");
        b2.search("C++");
    }
}