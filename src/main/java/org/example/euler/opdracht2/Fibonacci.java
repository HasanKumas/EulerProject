package org.example.euler.opdracht2;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int result = findSumOfEvenFibonaccis(4_000_000);

        System.out.println("The result is: " + result);
    }

    private static int findSumOfEvenFibonaccis(int maxNumber) {
        List<Integer> fibonacciNumbers = createFibonacciNumbers(maxNumber);

        return fibonacciNumbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
    }

    private static List<Integer> createFibonacciNumbers(int maxNumber) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(2);
        int lastFibonacci;
        int previousFibonacci;

        do {
            lastFibonacci = fibonacciNumbers.get(fibonacciNumbers.size()-1);
            previousFibonacci = fibonacciNumbers.get(fibonacciNumbers.size()-2);
            lastFibonacci += previousFibonacci;
            fibonacciNumbers.add(lastFibonacci);
        } while (lastFibonacci <= maxNumber);

        return fibonacciNumbers;
    }
}
