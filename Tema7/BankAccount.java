package Tema7;

public class BankAccount {

    private int accountNumber;
    private double balance;


    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
       if(amount > 0){
           balance += amount;
       }
    }

    public void withdraw(double amount) {
        if (balance > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}
