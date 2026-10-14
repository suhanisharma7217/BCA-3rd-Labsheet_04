class PrimeChecker {
    static int totalPrimeChecks = 0;

    boolean isPrime(int number) {
        totalPrimeChecks++;
        if (number < 2) return false;
        for (int i = 2; i <= number / i; i++)
            if (number % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        int number = 29;
        System.out.println(number + " is prime: " + p.isPrime(number));
        System.out.println("Checks: " + totalPrimeChecks);
    }
}
