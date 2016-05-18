import java.util.ArrayList;

/**
 * Finding longest Collatz Sequence below 1 million.
 *
 * @author Sujeeth Jinesh
 */
public class Problem_14 {

    /**
     * Driver for problem 14 class.
     * @param args
     */
    public static void main(String[] args) {

        //iteratively check through all the collatz sequences through 1 million

        long[] arr = new long[1000000];

        for (int i = 1; i <= 1000000; i++) { //start at 1 because starting val.
            arr[i-1] = collatz(i);
        }

        long max = 0;
        int pos = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                pos = j;
            }
        }

        System.out.println(pos+1);
    }

    /**
     * recursive method that calculates the length of the collatz chain.
     * @param n input collatz number
     * @return length of collatz chain.
     */
    public static int collatz(long n) {

        int counter = 1; //this will keep track of how many nums in sequence
        //check if n is 1, then return.
        if (n == 1) {
            return 1;
        } else if (n%2 == 0) { //check if even or odd
            return counter + collatz((n/2));
        } else {
            return counter + collatz((3*n + 1));
        }
    }
}
