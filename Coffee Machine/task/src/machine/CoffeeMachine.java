package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanner;
    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int cups = 9;
    public static int money = 550;
    public static boolean exit = false;

    public static void start() {

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        if (money > 0) {
            System.out.println("$" + money + " of money");
        } else {
            System.out.println(money + " of money");
        }
        System.out.println();

    }

    public static void action() {
        while (!exit) {
            scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
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
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Unknown action.");
                    break;
            }
        }
    }

    public static void buy() {

        scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String option = scanner.nextLine();
        if (!option.equalsIgnoreCase("back")) {
            int choice = Integer.parseInt(option);

            switch (choice) {
                case 1:
                    if (water > 249 && coffeeBeans > 15 && cups > 0) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 250;
                        coffeeBeans -= 16;
                        cups--;
                        money += 4;
                    } else {
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                    }
                    break;
                case 2:
                    if (water > 349 && milk > 74 && coffeeBeans > 19 && cups > 0) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 350;
                        milk -= 75;
                        coffeeBeans -= 20;
                        cups--;
                        money += 7;
                    } else {
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (coffeeBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                    }
                    break;
                case 3:
                    if (water > 199 && milk > 99 && coffeeBeans > 11 && cups > 0) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 200;
                        milk -= 100;
                        coffeeBeans -= 12;
                        cups--;
                        money += 6;
                    } else {
                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (coffeeBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                        }
                    }
                    break;
                default:
                    System.out.println("Unknown choice.");
                    break;
            }
        } else {
            action();
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

        System.out.println("I gave you $" + money);
        money = 0;

        System.out.println();
    }

    public static void remaining() {
        start();
    }

    public static void exit() {
        exit = true;
    }

    public static void main(String[] args) {
        action();
    }
}
