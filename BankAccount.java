// BankAccount Class
class BankAccount {

    // Private field
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Invalid amount. Enter a positive value."
            );
        }
        else if (amount > balance) {
            System.out.println(
                    "Insufficient balance."
            );
        }
        else {
            balance -= amount;

            System.out.println(
                    "Withdraw successful."
            );
            System.out.println(
                    "Remaining Balance: " + balance
            );
        }
    }
}

