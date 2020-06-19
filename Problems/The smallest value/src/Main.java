import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        long number = new Scanner(System.in).nextLong();
        long res = 1;
        int mult = 1;
        while (res <= number) {
            mult++;
            res *= mult;
        }
        System.out.print(mult);
    }
}