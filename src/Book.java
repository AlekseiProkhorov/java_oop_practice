public class Book {
    String name;
    int number_of_pages;

    public Book(String name, int number_of_pages) {
        this.name = name;
        this.number_of_pages = number_of_pages;
    }

    public String toString() {
        return "Book name: " + this.name + "\n" + "Number of pages: " + this.number_of_pages;
    }
}
