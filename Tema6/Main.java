package Tema6;
// use the 'private' access modifier and rely on getters/setters to retrieve/alter the object's data
// try to use multiple types of constructors and set the field's data in different manners (constructor or setter)
// use debugger to identify the changes



public class Main {

    public static void main(String[] args) {

        System.out.println("1. A class called Employee, which models an employee with an ID, name and salary. " +
                "The method raiseSalary(percent) increases the salary by the given percentage. Write the Employee class.");

        Employee john = new Employee(101, "John", 10000);
        System.out.println("Initial salary of " + john.getId() + ":" + john.getSalary());
        john.raiseSalary(12);
        System.out.println("New salary for " + john.getId() + ": " + john.getSalary());

        System.out.println();

        System.out.println("2. A class called InvoiceItem, which models an item of an invoice, with ID, description, " +
                "quantity and unit price.Write the InvoiceItem class. This class should contain a method called getTotal() " +
                "based on quantity and price.");

        InvoiceItem item1 = new InvoiceItem();
        item1.setId(1);
        item1.setDescription("birou alb");

        item1.getTotal(4, 400);

        System.out.println();

        System.out.println("3. A class called Date, which models a calendar date. Write the Date class. This class must" +
                " contain a field for day, one for month and one for year. This class must contain a method to print " +
                "the date with this template \"day/month/year\".");

        Date date = new Date(20, 11, 2023);
        date.printDate();

        System.out.println("4. A class called Account, which models a bank account of a customer. " +
                "The methods credit(amount) and debit(amount) add or subtract the given amount to the balance." +
                "The method transferTo(anotherAccount, amount) " +
                "transfers the given amount from this Account to the given anotherAccount. Write the Account class.");

        Account account = new Account(1, 800);
        System.out.println("Initial balance of: " + account.getId() + ": " + account.getBalance());
        account.credit(100);
        System.out.println("Updated balance of: " + account.getId() + ": " + account.getBalance());
        account.debit(250);
        System.out.println("Updated balance after withdraw for " + account.getId() + ": " + account.getBalance());

        Account account2 = new Account(3, 700);

        Account account1 = new Account(2, 950);
        System.out.println("Initial balance of: " + account1.getId() + ": " + account1.getBalance());
        account.transferTo(account1, 100);
        System.out.println("Updated balance of: " + account.getId() + ": " + account.getBalance());
        System.out.println("Updated balance of: " + account1.getId() + ": " + account1.getBalance());

        account2.transferTo(account, 200);
        System.out.println("Updated balance of: " + account2.getId() + ": " + account2.getBalance());
        System.out.println("Updated balance of: " + account.getId() + ": " + account.getBalance());


    }
}
