package designPattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonV1 {
    // this object is created with the class loading
    private static final SingletonV1 INSTANCE = new SingletonV1();
    // our singleton which have pizza's names.
    private List<String> pizzaNames;

    // When, we want to have pizza's menu which is generally available,then we create singleton
    private SingletonV1() {// constructor, which is private
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
        for (String pizzaMenu : SingletonV1.INSTANCE.getPizzaNames()) {
            ordinal++;
            System.out.println(ordinal + ". " + pizzaMenu);
        }
    }

    public static SingletonV1 getInstance() {
        return INSTANCE;
    }
}
