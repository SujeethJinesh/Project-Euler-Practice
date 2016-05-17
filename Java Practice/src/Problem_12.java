/**
 * Created by lab on 5/17/2016.
 */
public class Problem_12 {

    public static void main(String[] args) {

        long triangleNum;
        int numDivisors = 0;
        int n = 1;

        while(true) {
            triangleNum = getTriangularNumber(n);
            numDivisors = getNumDivisors(triangleNum);

            if (numDivisors > 500) {
                System.out.print(triangleNum);
                break;
            }
            n++;
        }

    }

    public static long getTriangularNumber(int n) {
        return n*(n+1)/2;
    }

    public static int getNumDivisors(long triangularNum) {
        int numberDivisors = 1;
        for (int i = 1; i < Math.sqrt(triangularNum); i++) {
            if (triangularNum%i == 0) {
                numberDivisors += 2;
            }
        }
        return numberDivisors;
    }


}
