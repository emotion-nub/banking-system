// Transaction.java
public class Transaction {
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " from account " + fromAccount.getAccountNumber() +
                    " to account " + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds in account " + fromAccount.getAccountNumber() +
                    " to perform the transfer");
        }
    }
}
