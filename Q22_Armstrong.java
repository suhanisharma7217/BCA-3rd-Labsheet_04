class Armstrong {
    static int totalChecks = 0;

    boolean isArmstrong(int number) {
        totalChecks++;
        if (number < 0) return false;
        int original = number, n = number, digits = 0, sum = 0;
        do { digits++; n /= 10; } while (n != 0);
        n = number;
        while (n > 0) {
            int digit = n % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) power *= digit;
            sum += power;
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        int number = 153;
        System.out.println(number + " is Armstrong: " + a.isArmstrong(number));
        System.out.println("Checks: " + totalChecks);
    }
}
