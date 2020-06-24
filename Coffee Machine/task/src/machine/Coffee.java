package machine;

/**
 * @Project E2_Coffee_Machine
 * Created by @Author Parinit on 6/24/2020
 * at 10:32 PM
 */
public class Coffee {
    private String name;
    private int water;
    private int milk;
    private int beans;
    private int price;


    public Coffee(String name, int water, int milk, int beans, int price) {
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.price = price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getPrice() {
        return price;
    }
}
