// Main Class
public class ATMSimulation {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(5000);

        account.withdraw(1500);
        account.withdraw(6000);
        account.withdraw(-200);
    }
}