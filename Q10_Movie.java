class Movie {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    void display() {
        String details = "Name: " + name + ", Genre: " + genre
                + ", Rating: " + rating + ", Industry: " + industry;
        System.out.println(details);
    }

    public static void main(String[] args) {
        Movie m = new Movie("Dangal", "Drama", 8.3);
        m.display();
    }
}
