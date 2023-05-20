package org.example.euler.opdracht4;

/**
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindrome {
    public static void main(String[] args) {
        int largestPalindrome = findLargestPalindrome();

        System.out.println("The result is: " + largestPalindrome);
    }

    private static int findLargestPalindrome() {
        var largestProductFromThreeDigits = 999 * 999;
        var smallestProductFromThreeDigits = 100 * 100;

        for(int i = largestProductFromThreeDigits; i >= smallestProductFromThreeDigits; i--) {
            if(isPalindrome(i) && canBeConstructedFromTwoThreeDigitNumbers(i)) {
                return  i;
            }
        }
        return -1;
    }

    private static boolean canBeConstructedFromTwoThreeDigitNumbers(int number) {
        for(int j = 999; j >= 100; j--) {
            if(number % j == 0 && number / j >= 100 && number / j <= 999) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(int number) {
        return reverseNumber(number) == number;
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        int remained;

        while(number > 0) {
            remained = number % 10;
            reversedNumber = reversedNumber * 10 + remained;
            number /= 10;
        }
        return reversedNumber;
    }
}
