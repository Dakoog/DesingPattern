package designPattern.factory.car;
// abstract factory - a factory that is not instantiated.
public abstract class AbstractFiatFactory {
    public  static Car createFiat126p() {
        return new Car("Fiat", "126p", "green",
                0.6, 20000, 50, 0, false);
    }
    public  static Car createFiat125p() {
        return new Car("Fiat", "125p", "ivory",
                1.0, 35000, 60, 0, false);
    }
}
