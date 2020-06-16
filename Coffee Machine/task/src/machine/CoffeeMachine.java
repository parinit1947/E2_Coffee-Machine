package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);

        int coffees = scanner.nextInt();
        int water = 200 * coffees;
        int milk = 50 * coffees;
        int beans = 15 * coffees;

        System.out.println("For " + coffees + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");

    }
}
