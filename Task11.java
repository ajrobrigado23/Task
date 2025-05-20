public class Task11 {

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        System.out.println(book1);
    }
}

class Book {

    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return """
                Title: %s
                Author: %s
                Year Published: %d
                Price: $%.2f""".formatted(this.title, this.author, this.yearPublished, this.price);
    }
}
