// Bank.java
public class Bank {
    public static void main(String[] args) {
        // Create two accounts
        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("789012", 500.0);

        // Display initial balances
        System.out.println("Initial Balances:");
        displayBalances(account1, account2);

        // Perform transactions
        account1.deposit(200.0);
        account2.withdraw(100.0);
        Transaction.transfer(account1, account2, 300.0);

        // Display final balances
        System.out.println("\nFinal Balances:");
        displayBalances(account1, account2);
    }

    private static void displayBalances(Account account1, Account account2) {
        System.out.println("Account " + account1.getAccountNumber() + ": $" + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + ": $" + account2.getBalance());
    }
}
