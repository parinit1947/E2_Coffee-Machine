import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int n = new Scanner(System.in).nextInt();
        int current = 1;
        int count = 0;
        while (count != n) {
            for (int i = 0; i < current; i++) {
                System.out.print(current + " ");
                count += 1;
                if (count == n) {
                    break;
                }
            }
            current += 1;
        }
    }
}