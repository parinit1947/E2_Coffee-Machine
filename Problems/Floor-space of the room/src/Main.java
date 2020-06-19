import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        double a;
        double b;
        double c;
        double s;
        double r;
        double square;

        Scanner scanner = new Scanner(System.in);
        String form = scanner.next();

        switch (form) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                s = (a + b + c) / 2;                    // semi-perimeter
                square = Math.sqrt(s * (s - a) * (s - b) * (s - c));    // Heron's method
                System.out.println(square);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                square = a * b;
                System.out.println(square);
                break;
            case "circle":
                r = scanner.nextDouble();
                square = 3.14 * r * r;
                System.out.println(square);
                break;
            default:
                System.out.println("Unknown form");
                break;
        }
    }
}