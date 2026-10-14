class Pen {
    String color, type;
    static String manufacturer = "Cello";

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void display() {
        String details = "Color: " + color + ", Type: " + type
                + ", Manufacturer: " + manufacturer;
        System.out.println(details);
    }

    public static void main(String[] args) {
        Pen p = new Pen("Blue", "Ballpoint");
        p.display();
    }
}
