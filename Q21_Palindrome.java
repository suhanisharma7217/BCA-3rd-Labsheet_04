class Palindrome {
    static int countChecks = 0;

    boolean isPalindrome(int number) {
        countChecks++;
        int original = number, reversed = 0, remainder;
        int n = number;
        while (n > 0) {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        return original >= 0 && original == reversed;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        int number = 121;
        System.out.println(number + " is palindrome: " + p.isPalindrome(number));
        System.out.println("Checks: " + countChecks);
    }
}
