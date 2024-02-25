package TemaS3;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Write a program to print numbers from 1 to 10.");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("2. Write a program to calculate the sum of first 10 natural number.");

        int sum = 0;

        for (int i = 0; i <=10; i++) {
            sum += i;
        }

        System.out.println("Sum of first 10 natural numbers: " + sum);

        System.out.println("3. Write a program to find the factorial value of any number entered through the keyboard.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        System.out.println("4. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.");


        System.out.println("Please enter integers: ");
        int x = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                sumOdd =+ i;
            }else {
                sumEven =+ i;
            }
        }
        System.out.println("Sum of odd number: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);

        System.out.println("5. Write a program that prompts the user to input a positive integer. " +
                "It should then print the multiplication table of that number.");


        System.out.println("Please enter a positive integer: ");
        int positiveInteger = scanner.nextInt();

        if (positiveInteger <= 0) {
            System.out.println("Invalid input. Please enter a positive integer: ");
        }else {
                System.out.println("Multiplication table for " + positiveInteger + ": ");
            for (int i = 1; i <= 10; i++) {
                int multiplication = positiveInteger * i;
                System.out.println(positiveInteger + " * " + i + " = " + (positiveInteger * i));
                System.out.println(positiveInteger + " * " + i + " = " + multiplication);
            }
        }

        System.out.println("6. Two numbers are entered through the keyboard. Write a program to find the value " +
                "of one number raised to the power of another.");


        System.out.println("Please enter a numbers: ");
        double number1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        double number2 = scanner.nextDouble();

        if (number2 < 0) {
            System.out.println("Second number should be bigger than 0. ");
        } else {
            double result = 1;
            for (int i = 1; i <= number2; i++) {
                result *= number1;
            }
            System.out.println(number1 + "raised to the power of " + number2 + " is: " + result);
        }

        System.out.println("7. Write a program to display a pattern like a right angle triangle with a number.");


        System.out.println("Enter the number of rows for triangle: ");
        int numberOfRows = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++){
            System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Write a program that prints the product of the first n odd natural numbers.");


        System.out.println("Please enter a value: ");
        int value = scanner.nextInt();

        int product = 1;

        if (value < 0) {
            System.out.println("Value provided is not valid.");
        } else {
            for (int i = 1; i <= value; i++) {
                int oddNumbers = 2 * i - 1;
                product *= oddNumbers;
            }
            System.out.println("The product of the first " + value + " odd numbers " + " is " + product);
        }

        System.out.println("9. Write a program to make such a pattern like a right angle triangle with a number " +
                "which will repeat a number in a row.");


        System.out.println("Please enter the number of rows: ");
        int numberOfRows2 = scanner.nextInt();

        for (int i = 1; i <= numberOfRows2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("10. Write a program that displays the first n square numbers and their sum.");


        System.out.println("Please enter a value: ");
        int n = scanner.nextInt();

        int sum1 = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            sum1 += square;
            System.out.println("The sqaure of " + i + " is: " + square);
        }

        System.out.println("Sum of first " + n + " square numbers is: " + sum1);

        System.out.println("11. Write a program to check whether a given number is a 'Perfect' number or not.\n" +
                "The sum of its divisors is equal to the number itself excluding the number.");


        System.out.println("Please enter a number: ");
        int y = scanner.nextInt();

        int sum2 = 0;

        for (int i = 1; i <= y / 2 ; i++) {
            if (y % i == 0){
                sum2 += i;
            }
        }

        boolean isPerfectNumber = sum2 == number1;

        if (isPerfectNumber) {
            System.out.println(y + " is a perfect number.");
        }else {
            System.out.println(y + " is not a perfect number.");
        }

        System.out.println("12. Write a program to find the 'Perfect' numbers within a given number of ranges.");


        System.out.println("Please enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.println("Please enter the end on the range: ");
        int end = scanner.nextInt();


        System.out.println("Perfect numbers whithin range: " + start + " and " + end + ": ");


        for (int i = start; i <= end; i++) {
            int sum3 = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                   sum3 += j;
                }
            }

            if (sum3 == i) {
                System.out.print(i + ", ");

            }
        }

        System.out.println("Write a program to print Fibonacci series of n terms where n is input by user:");

        System.out.println("Please enter a value: ");
        int nTerms = scanner.nextInt();

        System.out.println("Display Fibonacci series up to " + x + " terms: ");

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= nTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }



    }
}
