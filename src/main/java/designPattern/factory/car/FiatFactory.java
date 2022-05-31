package designPattern.factory.car;

import designPattern.factory.car.Car;

public class FiatFactory {
    public  Car createFiat126p() {
        return new Car("Fiat", "126p", "green",
                0.6, 20000, 50, 0, false);
    }
    public  Car createFiat125p() {
        return new Car("Fiat", "125p", "ivory",
                1.0, 35000, 60, 0, false);
    }
}
