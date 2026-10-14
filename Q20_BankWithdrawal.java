class BankAccount {
    double balance;
    static String bankCode = "SBIN";

    BankAccount(double balance) { this.balance = balance; }

    void withdraw(double amount) {
        double withdrawalAmount = amount;
        if (withdrawalAmount <= 0) System.out.println("Invalid amount.");
        else if (withdrawalAmount > balance) System.out.println("Insufficient balance.");
        else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount(5000);
        a.withdraw(1500);
        System.out.println("Bank code: " + bankCode);
    }
}
