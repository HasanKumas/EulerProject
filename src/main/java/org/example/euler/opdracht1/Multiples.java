package org.example.euler.opdracht1;

import java.util.stream.IntStream;

/**
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Multiples {
    public static void main(String[] args) {
        int result = findSumOfMultiples(1000, 3,5);

        System.out.println("The result is: " + result);
    }

    private static int findSumOfMultiples(int target, int... multiples) {
        var numbers = IntStream.range(1, target);

        return numbers.filter(n -> n % multiples[0] == 0 || n % multiples[1] == 0)
                      .sum();
    }
}
