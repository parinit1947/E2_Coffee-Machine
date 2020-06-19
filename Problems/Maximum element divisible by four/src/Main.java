import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int currentMax = 0;
        int num;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > currentMax) {
                currentMax = num;
            }
        }
        System.out.println(currentMax);
    }
}