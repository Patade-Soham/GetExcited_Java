interface Printable {
    void print();
}

class Document implements Printable {
    String title;

    Document(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing Document: " + title);
    }
}

class Book extends Document {
    String author;

    Book(String title, String author) {
        super(title);
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

public class PrintTest {
    public static void main(String[] args) {
        Printable doc = new Document("Report");
        doc.print();

        Book b = new Book("Java Programming", "James Gosling");
        b.print();          // from Document
        b.displayInfo();    // from Book
    }
}
