package designPattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Pizza Menu:");
        //V1 - created when the class is loading -> eager
        SingletonV1.getInstance().pizzaMenu();
        //V2 - created when called INSTANCE (getInstance) -> lazy
        SingletonV2.getInstance().pizzaMenu();
        // V3 - created when called INSTANCE and is secured multiple threads -> lazy
        SingletonV3.getInstance().pizzaMenu();
        //V4  - created ENUM -> eager V4 = V1
        SingletonV4.INSTANCE.pizzaMenu();

    }
}
