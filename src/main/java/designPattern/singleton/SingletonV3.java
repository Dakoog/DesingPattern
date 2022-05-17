package designPattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonV3 {
    //  this is protected installation ->
    private static SingletonV3 INSTANCE;
    private static Object lock;
    private List<String> pizzaNames;

// -> against multiple threads
           //    |-> public synchronized static SingletonV3 getInstance(){...)- Java guarantee but don't trust it
    public/*synchronized*/ static SingletonV3 getInstance() {
        //ten threads go
        if (INSTANCE == null) {
            // only when not exists enter in block
            // and ten threads can enter in if
            synchronized (lock) {
                // only  one thread can be uploaded
                // nine passed threads check and don't create the instance
                if (INSTANCE == null) {
                    // the one thread create the instance
                    INSTANCE = new SingletonV3();
                }
            }
        }
        return INSTANCE;
    } // alternative -> public synchronized static SingletonV3 getInstance(){...}
    // - Java guarantee but don't trust it

    private SingletonV3() {
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
        for (String pizzaMenu : SingletonV3.INSTANCE.getPizzaNames()) {
            ordinal++;
            System.out.println(ordinal + ". " + pizzaMenu);
        }
    }
}
