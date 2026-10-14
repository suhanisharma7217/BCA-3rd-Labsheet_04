class Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double result = a + b; operationsCount++;
        System.out.println("Addition: " + result);
    }
    void subtract(double a, double b) {
        double result = a - b; operationsCount++;
        System.out.println("Subtraction: " + result);
    }
    void multiply(double a, double b) {
        double result = a * b; operationsCount++;
        System.out.println("Multiplication: " + result);
    }
    void divide(double a, double b) {
        operationsCount++;
        if (b == 0) System.out.println("Cannot divide by zero.");
        else {
            double result = a / b;
            System.out.println("Division: " + result);
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(12, 4); c.subtract(12, 4);
        c.multiply(12, 4); c.divide(12, 4);
        System.out.println("Operations performed: " + operationsCount);
    }
}
