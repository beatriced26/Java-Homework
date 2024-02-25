package Tema6;

public class Account {

    private int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public void credit (int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Account credited with " + amount + " to " + id);
        } else {
            System.out.println("No changes have been made to the account balance.");
        }
    }

    public void debit (int amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Account debited from " + id + ": " + amount);
        }else {
            System.out.println("No changes have been made to the account balance.");
        }
    }

    public void transferTo (Account anotherAccount, int amount) {
        if (amount > 0 && amount <= balance) {
            debit(amount);
            anotherAccount.credit(amount);
            System.out.println("Amount transfered from " + id + " to " + anotherAccount.id+ ": " + amount);
        }else {
            System.out.println("Transfer could not be completed due to invalid amount. ");
        }
    }

}
