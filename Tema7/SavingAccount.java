package Tema7;

public class SavingAccount extends BankAccount {

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() <= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawl not allowed due to balance below 100.");
        }
    }
}
