class BankAccount {
    long accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double depositAmount = amount;
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Balance: "
                + balance + ", Bank: " + bankName);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount(123456789L, 2000);
        a.deposit(500);
        a.display();
    }
}
