import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long ans = 1L;
        if (n == 0L) {
            return ans;
        } else {
            for (long i = 1L; i <= n; i++) {
                ans = ans * i;
            }
            return ans;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}