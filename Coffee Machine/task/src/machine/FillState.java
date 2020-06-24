package machine;

/**
 * @Project E2_Coffee_Machine
 * Created by @Author Parinit on 6/24/2020
 * at 10:33 PM
 */
public enum FillState {
    INIT(""),
    WATER("Write how many ml of water do you want to add:"),
    MILK("Write how many ml of milk do you want to add:"),
    BEANS("Write how many grams of coffee beans do you want to add:"),
    CUPS("Write how many disposable cups of coffee do you want to add:");

    private String message;

    FillState(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
