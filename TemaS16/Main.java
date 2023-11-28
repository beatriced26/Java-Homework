package TemaS16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

7. Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string. If n is larger than the length of the string, it should return the full string.
8. Try to rethink the above exercises and use already existing standard functional interfaces provided by Java (if possible).
*/
public class Main {
    public static void main(String[] args) {

        System.out.println("1. Create a functional interface that takes a list of integers and returns a list of integers. " +
                "Use a lambda expression to implement this interface, such that it returns a list containing only the odd " +
                "numbers from the original list.");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        OddNumberFilter oddNumberFilter = list -> {
            List<Integer> oddNumbers = new ArrayList<>();
            for(Integer num : list) {
                if(num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }
            return oddNumbers;
        };

        List<Integer> oddNumbers = oddNumberFilter.filterOddNumbers(numbers);
        System.out.println("First list: " + numbers);
        System.out.println("Odd numbers list: " + oddNumbers);

        System.out.println("2. Create a functional interface with a method that takes a List<String> representing " +
                "first names and returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.");

        List<String> firstNames = List.of("Ana", "Andrei", "Cosmin");

        NameFormater formatter = names -> {
            List<String> formattedNames = new ArrayList<>();
            for (String name : names) {
                formattedNames.add(name.toUpperCase());
            }
            return formattedNames;
        };

        List<String> formattedNames = formatter.formatName(firstNames);
        System.out.println("Initial list: " + firstNames);
        System.out.println("Updated to uppercase list: " + formattedNames);

        System.out.println("3. Create a functional interface that is generic and takes a list of generic items " +
                "and a single generic item, returning a boolean indicating whether the item is in the list. " +
                "Implement this interface using a lambda expression.");

        List<String> foodList = List.of("apples", "bananas", "cheese", "milk");
        String itemToFind = "bread";

        GenericInterface<String> listChecker = ((list, item) -> list.contains(item));
        boolean result = listChecker.contains(foodList, itemToFind);
        System.out.println("Food list contains " + itemToFind + ":" + result
        );

        System.out.println("4. Create a functional interface that takes a single double as a parameter and returns " +
                "a double. Implement it using a lambda expression to create a utility that returns the square root of the input value.");

        double givenValue = 24.0;

        SquareRootCalculator squareCalculator = value -> Math.sqrt(value);

        double result1 = squareCalculator.calculateSquareRoot(givenValue);

        System.out.println("square root of " + givenValue + " is " + result1);

        System.out.println("5. Create a functional interface with a method that takes two strings and returns a string. " +
                "Implement this interface using a lambda expression to create a utility that joins two strings with a space in between.");

        JoinTwoStrings test = (x, y) -> x + " " + y;
        System.out.println(test.joinElements("Casa", "albastra"));

        System.out.println("6. Create a functional interface with a method that takes two strings as input and " +
                "returns an integer. Implement this interface using a lambda expression to create a custom comparator " +
                "that compares strings based on their length (not lexicographically).");


    }
}

@FunctionalInterface
interface OddNumberFilter {
    List<Integer> filterOddNumbers(List<Integer> numbers);
}

@FunctionalInterface
interface NameFormater {
    List<String> formatName(List<String> names);
}

@FunctionalInterface
interface GenericInterface<T> {
    boolean contains (List<T> list, T item);
}

@FunctionalInterface
interface SquareRootCalculator {
    double calculateSquareRoot (double value);
}

interface JoinTwoStrings {
    String joinElements (String s, String s1);
}



