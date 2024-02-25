package Tema4;

/*
        12. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Write a Java program to find the index of an array element.");


        int[] arr1 = new int[200];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 2;
        }

        int i = Arrays.binarySearch(arr1, 20);
        System.out.println(i);

        System.out.println("2. Write a Java program to copy an array by iterating the array." +
                "// hint: Don't use Arrays.copyOf()");

        int[] arr2 = new int[10];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = j + 1;
            System.out.print(arr2[j] + " ");
        }

        System.out.println();

        int[] copyOfArr2 = new int[arr2.length];
        for (int j = 0; j < copyOfArr2.length; j++) {
            copyOfArr2[j] = arr2[j];
        }

        for (int j = 0; j < copyOfArr2.length; j++) {
            System.out.print(copyOfArr2[j] + " ");
        }

        System.out.println();

        System.out.println("3. Write a Java program to insert an element (specific position) into an array." +
                "// hint: create a new array with old array's length + 1 and insert the element on the required position." +
                "please print the elements of the new created array.");
//
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter the array length: ");
        int arrLength = scanner.nextInt();

        System.out.println("Please enter the specific position to insert new element: ");
        int position = scanner.nextInt();

        int [] arr3 = new int[arrLength];

        for (int j = 0; j < arr3.length; j++) {
            arr3[j]= random.nextInt(10);
        }
        System.out.println();

        System.out.println("Please type the element to be added: ");
        int elementToAdd = scanner.nextInt();

        int [] newArr3 = new int[arr3.length + 1];

        for (int j = 0; j < position; j++) {
            newArr3[j] = arr3[j];
        }

        newArr3[position] = elementToAdd;

        for (int j = position + 1; j < newArr3.length; j++) {
            newArr3[j] = arr3[j-1];
        }

        System.out.println("Initial array: " + Arrays.toString(arr3));
        System.out.print("Updated array after adding " + elementToAdd+ " at position " + position + ":" + Arrays.toString(newArr3));

        System.out.println("4. Write a Java program to find the maximum and minimum value of an array.\n" +
                "// hint: initialize the minimum with a very big number, and the maximum with a very small value.");


        //1st solution

        System.out.println("Please enter the array length: ");
        Random random1 = new Random();

        int arrLength1 = scanner.nextInt();

        int [] arr4 = new int[arrLength1];
        for (int f = 0; f < arr4.length; f++) {
            arr4[f] = random1.nextInt(100);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int element : arr4) {
            if (element < min) {
                min = element;
        }
            if (element > max) {
                max = element;
                }
        }

        System.out.println("Array: " + Arrays.toString(arr4));
        System.out.println("Minimum value in array is: " + min);
        System.out.println("Maximum value in array is: " + max);

        //2nd solution

        int minimum = arr4[0];
        for (int g = 0; g < arr4.length; g++) {
            minimum = Math.min(minimum, arr4[g]);
        }
        System.out.println("Minimum value: " + minimum);

        int maximum = arr4[0];
        for (int h = 0; h < arr4.length; h++) {
            maximum = Math.max(maximum, arr4[h]);
        }
        System.out.println("Maximum value: " + maximum);

        System.out.println("5. Write a Java program to reverse an array of integer values.\n" +
                "// hint: play around with the statements and conditions used within the 'for' statement.\n" +
                "        for (i = arr.length; ....; i--)...");


        int [] arr5 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Initial array: " + Arrays.toString(arr5));

        for (int k = 0; k < arr5.length /2; k++) {
            int tempArr = arr5[k];
            arr5[k] = arr5[arr5.length - 1 - k];
            arr5[arr5.length - 1 -k] = tempArr;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr5));

        System.out.println(" 6. Write a Java program to find common elements between two integer arrays.\n" +
                "// hint: you can use a for in for.");

        int[] arr6 = {2, 5, 7, 3, 10, 12, 20, 4, 11};
        int[] arr7 = {5, 9, 12, 25, 4, 30, 8, 13};

        findCommonElements(arr6, arr7);

        System.out.println("7.Write a Java program which stores in another array the even numbers from a given array.\n" +
                "// hint: store the newly created array current length in an int variable.");

        int [] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = countEvenNumbers(originalArray);
        int [] evenNumbersArrray= new int [evenCount];

        int currentIndex = 0;
        for (int l = 0; l < originalArray.length; l++) {
            if(originalArray[l] % 2 ==0) {
                evenNumbersArrray[currentIndex] = originalArray[i];
                currentIndex++;
            }

        }
        System.out.println("Original array: " + Arrays.toString(originalArray));
//        System.out.println("Even numbers array: " + Arrays.toString(evenNumbersArrray));

        System.out.println(" 8. Iterate and print each element from a matrix.\n" +
                "// hint: check the session4.Main file.");

        int [][] matrix = new int[][] {
                new int[] {1, 2, 3, 4},
                new int[] {5, 6, 7, 8},
                new int[4]

        };

        for (int m = 0; m < matrix.length; m++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("matrix[%d][%d] = %d;\n", i, j, matrix[i][j]);
            }
        }

        System.out.println(" 9. Print the elements from the main diagonal in a matrix.\n" +
                "// hint: check the indexes/indices of 'i' (row) and 'j' (column)");

        int [][] matrix2 = new int[][] {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
        };

        System.out.println("Main Diagonal Elements: ");
        printMainDiagonal(matrix2);

        System.out.println("10. Print the elements from the secondary diagonal in a matrix.");

        int [][] matrix3 = new int[][] {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
        };

        System.out.println("secondary diagonal elements: ");
        printSecondaryDiagonal(matrix3);

        System.out.println(" 11. Print the sum of the elements above the main diagonal (all of them, not only the first 'semi-diagonal').");



    }

    public static void findCommonElements (int[] arr6, int[] arr7) {
        System.out.println("Common elements: ");
        for (int element1 : arr6) {
            for (int element2 : arr7) {
                if(element1 == element2) {
                    System.out.printf(element1 + ",");
                    break;

            }

        }

        }
    }

    public static int countEvenNumbers (int [] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static void printMainDiagonal(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][i]);

        }
    }

    private static void printSecondaryDiagonal(int[][]matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][columns - 1 - i]);
        }
    }
}
