class Factorial {
    static int totalCalls = 0;

    long calculate(int number) {
        totalCalls++;
        if (number < 0 || number > 20) {
            System.out.println("Enter a number from 0 to 20.");
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= number; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial: " + f.calculate(5));
        System.out.println("Total calls: " + totalCalls);
    }
}
