import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        if (scanner.nextInt() < 10) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}