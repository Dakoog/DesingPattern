package designPattern.factory;

import designPattern.factory.car.Car;

public class FactoryMain {
    public static void main(String[] args) {
        // this is my order for Lamborghini Service & Shop
       // Car myLamborghini =new Car("Lamborghini", "Veneno Roadster", "goldEdition", 6.5, 100000, 900, 5, true);
        //reaction -> haha:))), Security, take those guys, please....

        // create own objects is can't because
        // the access modifier prevents this

      //Car car = new Car("Lamborghini", "Veneno Roadster", "goldEdition", 6.5, 100000, 900, 5, true);
        Car myLamborghini = Car.createMyLamborghiniVenenoRoadster();



    }
}
