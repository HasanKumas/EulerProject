package org.example.euler.opdracht5;

/**
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        var smallestDivisableNumber = findSmallestDivisableNumber(20);

        System.out.println("The result is: " + smallestDivisableNumber);
    }

    private static int findSmallestDivisableNumber(int number) {
       for(int i = number; ;i++) {
           if(isDivisableToAllNumbers(i)) {
               return i;
           }
       }
    }

    private static boolean isDivisableToAllNumbers(int number) {
        for(int i = 20; i > 10; i--) {
            if(number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
