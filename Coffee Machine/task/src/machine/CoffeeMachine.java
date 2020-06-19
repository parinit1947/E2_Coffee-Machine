package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanner;
    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static void start() {

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();

    }

    public static void action() {
        scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next().toLowerCase().trim();

        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            default:
                System.out.println("Unknown action.");
                break;
        }
    }

    public static void buy() {
        scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                water -= 250;
                coffeeBeans -= 16;
                cups--;
                money += 4;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                coffeeBeans -= 20;
                cups--;
                money += 7;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                coffeeBeans -= 12;
                cups--;
                money += 6;
                break;
            default:
                System.out.println("Unknown choice.");
                break;
        }
        System.out.println();
    }

    public static void fill() {
        scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();

        System.out.println();
    }

    public static void take() {

        System.out.println("I gave you " + money);
        money = 0;

        System.out.println();
    }

    public static void main(String[] args) {

        start();
        action();
        start();
    }
}
