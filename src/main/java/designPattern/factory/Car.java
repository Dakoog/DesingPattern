package designPattern.factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    // Which fields should be entered to create your own car
    private String mark;
    private String model;
    private String color;
    private double engineCapacity;
    private double price;
    private double powerHP;
    private int numbersOfAirbags;
    private boolean heatedSeats;
    // ... end other
    // lamborghini 4,8 mln EURO (ok. 20 mln złotych), chcąc zarobić na jego odsprzedaży - bagatela - około 1,5 mln euro.
    //    Lamborghini Veneno Roadster napędzany jest 12-cylindrowym silnikiem o pojemności 6,5 litra i mocy 750 KM. Do prędkości 100 km/h potrafi rozpędzić się w niespełna 3 sekundy,
    // a przyspieszanie kończy się dopiero przy wartości 355 km/h.

    public void createMyLamborghiniVenenoRoadster(){
        Car myLambo = new Car("Lamborghini", "Veneno Roadster", "redAndGrey", 6.5, 48000000, 750, 4, true);
    }


}
