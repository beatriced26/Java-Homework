package Tema7;

/*





8. Design a class hierarchy for geometric shapes. Create a base class Shape with methods to calculate area and perimeter. Then, create subclasses for specific shapes like Circle, Rectangle, and Triangle. Override the area and perimeter calculation methods for each shape.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Write a Java program to create a class called Rectangle with private instance variables " +
                "length and width. Provide public getter and setter methods to access and modify these variables.");

        Rectangle rectangle = new Rectangle(7, 9);
        System.out.println("Width: " + rectangle.getWidth() + " and " + "Length: " + rectangle.getLength());

        rectangle.setLength(11);
        rectangle.setWidth(5);
        System.out.println("Width: " + rectangle.getWidth() + " and " + "Length: " + rectangle.getLength());

        System.out.println();
        System.out.println("2. Write a Java program to create a class called Circle with a private instance variable " +
                "radius. Provide public getter and setter methods to access and modify the radius variable. " +
                "However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated" +
                " area and perimeter based on the current radius value. // you can use Math.PI for the area and perimeter.");

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println();
        System.out.println("3. Write a Java program to create a class called Animal with a method called makeSound()." +
                " Create a subclass called Dog that overrides the makeSound() method to bark.");

        Dog dog = new Dog();
        dog.makeSound();

        Animal animal = new Animal();
        animal.makeSound();

        System.out.println();
        System.out.println("4. Write a Java program to create a class called Vehicle with a method called drive(). " +
                "Create a subclass called Car that overrides the drive() method to print \"Driving a car\".");

        Car car = new Car();
        car.drive();

        System.out.println();

        System.out.println("5. Write a Java program to create a class known as \"BankAccount\" with methods called " +
                "deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method " +
                "to prevent withdrawals if the account balance falls below one hundred.");

        //not finished yet

        BankAccount bankAccount1 = new BankAccount(001, 850);
        System.out.println("Initial balance for " + bankAccount1.getAccountNumber() + " is: " + bankAccount1.getBalance());
        bankAccount1.deposit(200);
        System.out.println("Updated balance after deposit for " + bankAccount1.getAccountNumber() + " is: " + bankAccount1.getBalance());

        bankAccount1.withdraw(100);
        System.out.println("Updated balance after withdraw for " + bankAccount1.getAccountNumber() + " is: " + bankAccount1.getBalance());

        System.out.println();

        System.out.println("7. Write a Java program to create a class known as Person with methods called getFirstName()" +
                " and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() " +
                "and overrides the getLastName() method to include the employee's job title.");

        //not finished yet

        Person person = new Person("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());
        Employee employee = new Employee("Jane", "Doe", 1248, "HR");



    }

}
