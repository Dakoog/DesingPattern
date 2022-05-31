package designPattern.factory;

import designPattern.factory.car.Car;
import designPattern.factory.car.FiatFactory;

public class FactoryMain {
    public static void main(String[] args) {
        // this is my order for Lamborghini Service & Shop
        // Car myLamborghini =new Car("Lamborghini", "Veneno Roadster", "goldEdition", 6.5, 100000, 900, 5, true);
        //reaction -> haha:))), Security, take those guys, please....

        // create own objects is can't because
        // the access modifier prevents this

        //Car car = new Car("Lamborghini", "Veneno Roadster", "goldEdition", 6.5, 100000, 900, 5, true);

        Car myLamborghini = Car.createMyLamborghiniVenenoRoadster();
// -----------------------------------------------------------------------------------------------
        FiatFactory fiat = new FiatFactory();
        Car fiat125p = fiat.createFiat125p();
        Car fiat126p = fiat.createFiat126p();
        // creation of new cars Fiat 126p and Fiat 125p but with the option of changing colors
        fiat126p.setColor("orange");
        System.out.println(fiat126p);

        fiat125p.setColor("safari");
        System.out.println(fiat125p);


    }
}
