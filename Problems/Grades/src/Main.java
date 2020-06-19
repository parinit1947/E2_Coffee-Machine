import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int n;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < students; i++) {
            n = scanner.nextInt();
            switch (n) {
                case 2:
                    d++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    b++;
                    break;
                case 5:
                    a++;
                    break;
                default:
                    break;
            }
        }

        System.out.print(d + " " + c + " " + b + " " + a);
    }
}