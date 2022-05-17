package designPattern.singleton;

public class Rounding {// my singleton
    private static final Rounding INSTANCE = new Rounding();
    private double number;

    public static double hundredths(double number) {
        return Math.round(number * 100d) / 100d;
    }

    public static double decimal(double number) {
        return Math.round(number * 10d) / 10d;
    }

    public static double thousandths(double number) {
        return Math.round(number * 1000d) / 1000d;
    }

    private Rounding() {

    }

    public static Rounding getInstance() {
        return INSTANCE;
    }
}
