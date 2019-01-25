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
        /**
         * ArrayList of product of three digit numbers which are palindrome
         */
        ArrayList<Integer> numProduct = new ArrayList<>();

        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int product = i * j;

                if (isPalindrome(product))//check if palindrome
                    numProduct.add(product);//add to the ArrayList
            }
        }

        return Collections.max(numProduct);//return the largest palindrome in the ArrayList
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
        if (temp == sum)
            return true;
        else
            return false;
    }
}

