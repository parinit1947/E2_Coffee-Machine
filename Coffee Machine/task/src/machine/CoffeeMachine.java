package machine;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Project E2_Coffee_Machine
 * Created by @Author Parinit on 6/24/2020
 * at 10:31 PM
 */
public class CoffeeMachine {
    private Map<Integer, Coffee> coffeeMap = new HashMap<>();
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int cash;
    private State state = State.START;
    private FillState fillState = FillState.INIT;
    CoffeeMachine() {
        water = 400;
        milk = 540;
        beans = 120;
        cups = 9;
        cash = 550;
        coffeeMap.put(1, new Coffee("espresso", 250, 0, 16, 4));
        coffeeMap.put(2, new Coffee("latte", 350, 75, 20, 7));
        coffeeMap.put(3, new Coffee("cappuccino", 200, 100, 12, 6));
        start();
    }
    void command(String input) {
        switch (state) {
            case DEFAULT:
                action(input);
                break;
            case BUY:
                buy(input);
                break;
            case FILL:
                fill(input);
                break;
        }
    }

    private void start() {
        state = State.DEFAULT;
        System.out.println(state.getMessage());
    }

    private void action(String action) {
        switch (action) {
            case "buy":
                state = State.BUY;
                System.out.println(state.getMessage());
                break;
            case "fill":
                state = State.FILL;
                fillState = FillState.WATER;
                System.out.println(fillState.getMessage());
                break;
            case "take":
                take();
                break;
            case "remaining":
                printState();
                break;
            case "exit":
                System.exit(0);
        }
    }

    private void printState() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water\n%d of milk\n%d of coffee beans\n%d of disposable cups\n%d of money\n\n",
                water, milk, beans, cups, cash);
        start();

    }

    private void buy(String input) {
        if (Objects.equals(input, "back")) {
            state = State.DEFAULT;
            start();
            return;
        }
        int point = Integer.parseInt(input);
        Coffee coffee = coffeeMap.get(point);
        if (water >= coffee.getWater() && milk >= coffee.getMilk() && beans >= coffee.getBeans() && cups > 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= coffee.getWater();
            milk -= coffee.getMilk();
            beans -= coffee.getBeans();
            cash += coffee.getPrice();
            cups--;
        } else {
            System.out.println("Sorry, not enough resources!");
        }
        start();
    }

    private void fill(String input) {
        int amount = Integer.parseInt(input);
        switch (fillState) {
            case WATER:
                this.water += amount;
                fillState = FillState.MILK;
                break;
            case MILK:
                this.milk += amount;
                fillState = FillState.BEANS;
                break;
            case BEANS:
                this.beans += amount;
                fillState = FillState.CUPS;
                break;
            case CUPS:
                this.cups += amount;
                fillState = FillState.INIT;
                start();
        }
        System.out.println(fillState.getMessage());
    }

    private void take() {
        state = State.TAKE;
        System.out.printf("I gave you $%d\n", cash);
        cash = 0;
        start();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine();
        while (true) {
            machine.command(scanner.next());
        }
    }
}
