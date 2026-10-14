class StringReverse {
    static int totalReversals = 0;

    String reverse(String text) {
        totalReversals++;
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--)
            reversed += text.charAt(i);
        return reversed;
    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();
        System.out.println("Reversed: " + s.reverse("Java"));
        System.out.println("Total reversals: " + totalReversals);
    }
}
