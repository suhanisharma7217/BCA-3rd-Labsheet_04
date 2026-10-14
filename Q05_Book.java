class Book {
    String title, author;
    double price;
    static String publisher = "Sunrise Publications";

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        String details = "Title: " + title + ", Author: " + author
                + ", Price: " + price + ", Publisher: " + publisher;
        System.out.println(details);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James", 450);
        b.display();
    }
}
