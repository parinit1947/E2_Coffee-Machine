import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int height = 0;
        int n = 0;
        int bridge = 0;
        boolean crash = false;
        if (sc.hasNextInt()) {
            height = sc.nextInt();
        }
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                bridge = sc.nextInt();
            }
            if (bridge <= height) {
                i++;
                System.out.print("Will crash on bridge " + i);
                crash = true;
                break;
            }
        }
        if (!crash) {
            System.out.print("Will not crash");
        }
    }
}