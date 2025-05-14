import java.util.ArrayList;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String title) {
        books.removeIf(b -> b.title.equals(title));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class RazaulBookSelf   {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Adventures of Tom Sawyer", "Mark Twain"));
        lib.addBook(new Book("Ben Hur", "Lewis Wallace"));
        lib.addBook(new Book("Time Machine", "H.G. Wells"));
        lib.addBook(new Book("Anna Karenina", "Leo Tolstoy"));

        System.out.println("Books in the library:");
        lib.displayBooks();

        lib.removeBook("Ben Hur");
        System.out.println("\nBooks in the library after removing Ben Hur:");
        lib.displayBooks();
    }
}
