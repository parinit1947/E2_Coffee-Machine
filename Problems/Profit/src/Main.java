import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double current = scanner.nextInt();
        int length = 0;
        double percent = scanner.nextInt();
        int goal = scanner.nextInt();
        while (current < goal) {
            current *= 1 + percent / 100;
            length++;
        }
        System.out.print(length);
    }
}