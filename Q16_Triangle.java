class Triangle {
    double a, b, c;
    static String type = "Scalene/Isosceles/Equilateral";

    Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    void check() {
        boolean valid = a > 0 && b > 0 && c > 0
                && a + b > c && a + c > b && b + c > a;
        if (!valid) {
            System.out.println("Invalid triangle.");
            return;
        }
        String triangleType;
        if (a == b && b == c) triangleType = "Equilateral";
        else if (a == b || b == c || a == c) triangleType = "Isosceles";
        else triangleType = "Scalene";
        System.out.println("Valid " + triangleType + " triangle (" + type + ").");
    }

    public static void main(String[] args) {
        new Triangle(5, 5, 6).check();
    }
}
