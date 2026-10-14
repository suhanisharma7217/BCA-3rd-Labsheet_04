class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    Laptop(String brand, int RAM) {
        this.brand = brand;
        this.RAM = RAM;
    }

    void display() {
        String details = "Brand: " + brand + ", RAM: " + RAM
                + " GB, OS: " + os;
        System.out.println(details);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 8);
        l.display();
    }
}
