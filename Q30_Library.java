class Library {
    int booksAvailable;
    static String libraryName = "City Library";

    Library(int booksAvailable) { this.booksAvailable = booksAvailable; }

    void issueBook() {
        int issueCount = 1;
        if (booksAvailable >= issueCount) {
            booksAvailable -= issueCount;
            System.out.println("Book issued.");
        } else System.out.println("No books available.");
    }

    void returnBook() {
        int returnCount = 1;
        booksAvailable += returnCount;
        System.out.println("Book returned.");
    }

    public static void main(String[] args) {
        Library l = new Library(10);
        l.issueBook();
        l.returnBook();
        System.out.println(libraryName + " books available: " + l.booksAvailable);
    }
}
