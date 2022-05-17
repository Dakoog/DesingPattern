package designPattern.singleton;

import java.util.ArrayList;
import java.util.List;

public enum SingletonV4 {
    // this object it is enum -> created when the class loading.
   INSTANCE;
    private List<String> pizzaNames;

    private SingletonV4() {
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
        for (String pizzaMenu : SingletonV4.INSTANCE.getPizzaNames()) {
            ordinal++;
            System.out.println(ordinal + ". " + pizzaMenu);
        }
    }

    public static SingletonV4 getInstance() {
        return INSTANCE;
    }
}
