import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        long prod = 1;
        for (int i = left; i < right; i++) {
            prod *= i;
        }
        System.out.println(prod);
    }
}
