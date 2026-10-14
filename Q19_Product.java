class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10.0;

    Product(int id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }

    void displayFinalPrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Final price after " + discountRate + "% discount: Rs. " + finalPrice);
    }

    public static void main(String[] args) {
        new Product(1, "Bag", 1200).displayFinalPrice();
    }
}
