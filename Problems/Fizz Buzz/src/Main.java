import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        for (int n = begin; n <= end; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }
}
