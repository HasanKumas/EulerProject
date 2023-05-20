package org.example.euler.opdracht3;

import java.util.ArrayList;

/**
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Long largestPrimeFactor = findLargestPrimeFactor(600851475143L);

        System.out.println("The result is: " + largestPrimeFactor);
    }

    private static Long findLargestPrimeFactor(long targetNumber) {

        return calculateFactors(targetNumber).stream()
                .distinct()
                .max(Long::compare)
                .get();
    }

    private static ArrayList<Long> calculateFactors(long targetNumber) {
        var factors = new ArrayList<Long>();

        for(long factor = 2; factor <= targetNumber; factor++) {
            while(targetNumber % factor == 0) {
                factors.add(factor);
                targetNumber /= factor;
            }
        }
        return  factors;
    }

}
