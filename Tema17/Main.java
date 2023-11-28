package Tema17;

/*

        9. Using streams, find the total number of characters across a list of strings excluding whitespace characters.

        10. Given a list of employee objects with attributes: name, department, and salary; find the department with the highest total salary.
        11. Given a list of products with attributes: name, category, and price; find the category with the highest average price.
*/

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Given a list of integers, create a new list that contains only the even numbers. " +
                "Use streams to achieve this.");

        List<Integer> list = List.of(1,2,3,4,5,6);

        List<Integer> collect = list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("2. Using a list of strings, find and print the longest string using Java streams.");

        List<String> itemList = List.of("masa", "dulap", "pat");

        Optional<String> longestString = itemList.stream()
                .max(Comparator.comparingInt(String::length));

      longestString.ifPresent(System.out::println);

        System.out.println("3. Create a stream of numbers from 1 to 100 and use the filter operation to retain" +
                " only those numbers which are prime.");

        System.out.println("4. Given a list of strings, use streams to create a single string which is a concatenation" +
                " of all strings separated by a comma.");

        List<String> initialList = List.of ("carte1", "carte2", "carte3");

        String concatenatedList = initialList.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Initial list: " + initialList);
        System.out.println("Updated list: " + concatenatedList);

        System.out.println("5. Given a list of people (a class) with attributes: first name, last name, and age; " +
                "use streams to find all people who are older than 18 years.");

        List<People> peopleList = Arrays.asList(
                new People("Ana", "Muresan", 20),
                new People("Andrei", "Pop", 17),
                new People("Mihai", "Dumitrescu", 34)
        );

        List<People> peopleOver18 = peopleList.stream()
                .filter(person -> person.getAge() > 18)
                .toList();

        System.out.println(peopleOver18);

        System.out.println("6. Create a stream of integers from an array and find the sum of all integers " +
                "using the reduce method.");

        int [] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers)
                .reduce(0, (x, y) -> x + y);

        System.out.println("Sum of integeres: " + sum);

        System.out.println("7. Use streams to transform a list of strings into a list of their respective lengths.");

        List<String> listRandomObjects = List.of("caiet", "masa", "carte", "tabla");
        List<Integer> listToLength = listRandomObjects.stream()
                .map(String::length)
                .toList();
        System.out.println("List of string lengths: "+ listToLength);

        System.out.println("8. Given a string, use streams to count the number of vowels in it.");

        String str = "perpendicular";

        long vowelCount = str.chars()
                .filter(s -> "aeiou".indexOf(s) != -1)
                .count();


        System.out.println("Number of vowels: " + vowelCount);


    }
}
 class People {

    private String firstName;
    private String lastName;
    private int age;

     public People(String firstName, String lastName, int age) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     @Override
     public String toString() {
         return "People{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

