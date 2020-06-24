package machine;

import java.util.Scanner;

/**
 * @Project E2_Coffee_Machine
 * Created by @Author Parinit on 6/24/2020
 * at 10:31 PM
 */
public class CoffeeMachine {
    private enum State {
        CHOOSING_AN_ACTION,
        CHOOSING_A_VARIANT_OF_COFFEE,
        CHOOSING_AMOUNT_OF_WATER,
        CHOOSING_AMOUNT_OF_MILK,
        CHOOSING_AMOUNT_OF_COFFEE_BEANS,
        CHOOSING_AMOUNT_OF_CUPS
    }

    //                                     {espresso, latte, cappuccino}
    static final int[] waterPerCup       = {250,      350,   200},        // milliliters
            milkPerCup        = {0,        75,    100},        // milliliters
            coffeeBeansPerCup = {16,       20,    12},         // grams
            cupCost           = {4,        7,     6};          // $

    private State state = State.CHOOSING_AN_ACTION;

    private int totalWater,
            totalMilk,
            totalCoffeeBeans,
            totalCups,
            totalMoney;

    public CoffeeMachine(int totalWater, int totalMilk, int totalCoffeeBeans, int totalCups, int totalMoney) {
        this.totalWater       = totalWater;
        this.totalMilk        = totalMilk;
        this.totalCoffeeBeans = totalCoffeeBeans;
        this.totalCups        = totalCups;
        this.totalMoney       = totalMoney;
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input;
        while(!(input = scanner.nextLine()).equals("exit")) {
            coffeeMachine.act(input);
        }
    }

    public void act(String input) {
        switch (state) {
            case CHOOSING_AN_ACTION:
                switch (input) {
                    case "buy":
                        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                        state = State.CHOOSING_A_VARIANT_OF_COFFEE;
                        break;
                    case "fill":
                        System.out.println("\nWrite how many ml of water do you want to add:");
                        state = State.CHOOSING_AMOUNT_OF_WATER;
                        break;
                    case "take":
                        System.out.println("\nI gave you $" + totalMoney +
                                "\n\nWrite action (buy, fill, take, remaining, exit):");
                        totalMoney = 0;
                        break;
                    case "remaining":
                        System.out.println("\nThe coffee machine has:\n" +
                                totalWater       + " of water\n" +
                                totalMilk        + " of milk\n" +
                                totalCoffeeBeans + " of coffee beans\n" +
                                totalCups        + " of disposable cups\n" +
                                "$" + totalMoney + " of money" +
                                "\n\nWrite action (buy, fill, take, remaining, exit):");
                        break;
                }
                break;
            case CHOOSING_A_VARIANT_OF_COFFEE:
                if (!input.equals("back")) {
                    int coffeeDrink = Integer.parseInt(input) - 1;
                    if (0 <= coffeeDrink && coffeeDrink <= 2) {
                        if (totalWater < waterPerCup[coffeeDrink]) {
                            System.out.println("Sorry, not enough water!");
                        } else if (totalMilk < milkPerCup[coffeeDrink]) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (totalCoffeeBeans < coffeeBeansPerCup[coffeeDrink]) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (totalCups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            totalWater -= waterPerCup[coffeeDrink];
                            totalMilk -= milkPerCup[coffeeDrink];
                            totalCoffeeBeans -= coffeeBeansPerCup[coffeeDrink];
                            totalCups--;
                            totalMoney += cupCost[coffeeDrink];
                        }
                    }
                }
                state = State.CHOOSING_AN_ACTION;
                System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                break;
            case CHOOSING_AMOUNT_OF_WATER:
                totalWater += Integer.parseInt(input);
                state = State.CHOOSING_AMOUNT_OF_MILK;
                System.out.println("Write how many ml of milk do you want to add:");
                break;
            case CHOOSING_AMOUNT_OF_MILK:
                totalMilk += Integer.parseInt(input);
                state = State.CHOOSING_AMOUNT_OF_COFFEE_BEANS;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                break;
            case CHOOSING_AMOUNT_OF_COFFEE_BEANS:
                totalCoffeeBeans += Integer.parseInt(input);
                state = State.CHOOSING_AMOUNT_OF_CUPS;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                break;
            case CHOOSING_AMOUNT_OF_CUPS:
                totalCups += Integer.parseInt(input);
                state = State.CHOOSING_AN_ACTION;
                System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                break;
            default:
        }
    }
}
