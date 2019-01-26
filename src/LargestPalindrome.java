import java.util.ArrayList;
import java.util.Collections;

public class LargestPalindrome {

    public static void main(String[] args) {
        System.out.println(getLargestPalindrome());

    }

    /**
     * Find the largest palindrome made from the product of two 3-digit numbers.
     *
     * @return the largest palindrome
     */
    public static int getLargestPalindrome() {

        int largestPalindrome = 0;

        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int product = i * j;

                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }

            }
        }

        return largestPalindrome;
    }

    /**
     * @param number
     * @return
     */

    public static boolean isPalindrome(int number) {
        int remainder, sum = 0, temp;

        temp = number;

        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        return temp == sum;
    }
}

