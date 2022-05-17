package designPattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonV2 {
    //  this is laze installation
    private static SingletonV2 INSTANCE;
    private List<String> pizzaNames;

    //  -> because crated instance when is asked
    public static SingletonV2 getInstance() {
        if (INSTANCE == null) {
            // phenomenon racing isn't exists. It's synchronized
            INSTANCE = new SingletonV2();

        }
        return INSTANCE;
    }

    private SingletonV2() {
        this.pizzaNames = new ArrayList<>();
        this.pizzaNames.add("Margherita");
        this.pizzaNames.add("Hawai");
        this.pizzaNames.add("Country");
    }

    public List<String> getPizzaNames() {
        return pizzaNames;
    }

    public void pizzaMenu() {
        int ordinal = 0;
        for (String pizzaMenu : SingletonV2.INSTANCE.getPizzaNames()) {
            ordinal++;
            System.out.println(ordinal + ". " + pizzaMenu);
        }
    }
}
