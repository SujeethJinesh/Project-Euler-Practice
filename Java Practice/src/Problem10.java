/**
 * Created by lab on 5/17/2016.
 */
public class Problem10 {

    public static void main(String[] args) {
        //uses Sieve of Eratosthenes.
        boolean[] sieve = new boolean[2000001]; //all false values where first val is 2

        long sum = 0;
        int counter = 2;
        int temp = 0;

        for(int i = 2; i < sieve.length; i++) { //sieve of eratosthenes
            if (!sieve[i]) {
                sum += i;
                for (int j = i; j < sieve.length;) {
                    temp = i;
                    sieve[j] = true;
                    j = counter*temp;
                    counter++;
                }
                counter = 2;
            }
        }
        System.out.println(sum);
    }

}
