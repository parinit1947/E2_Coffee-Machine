import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long value1 = scanner.nextLong();
        String operator = scanner.next();
        long value2 = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(value1 + value2);
                break;
            case "-":
                System.out.println(value1 - value2);
                break;
            case "/":
                if (value2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(value1 / value2);
                }
                break;
            case "*":
                System.out.println(value1 * value2);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}