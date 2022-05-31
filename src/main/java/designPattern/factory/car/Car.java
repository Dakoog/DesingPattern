package designPattern.factory.car;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor

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

    // private => when we want to prohibit the possibility of creating our own objects
    protected Car(String mark, String model, String color, double engineCapacity,
               double price, double powerHP, int numbersOfAirbags, boolean heatedSeats) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.powerHP = powerHP;
        this.numbersOfAirbags = numbersOfAirbags;
        this.heatedSeats = heatedSeats;
    }

// ...then, create some predefined objects -> and pattern factory
    public static Car createMyLamborghiniVenenoRoadster() {
        return new Car("Lamborghini", "Veneno Roadster", "redAndGrey",
                6.5, 48000000, 750, 4, true);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return   mark.toUpperCase()  + " "+
                 model.toUpperCase()  +
                "\ncolor: "+ color  +
                "\nengineCapacity: " + engineCapacity +" dm^3"+
                "\nprice: " + price +" zł"+
                "\npowerHP: " + powerHP + " KM"+
                "\nnumbersOfAirbags: " + numbersOfAirbags +
                "\nheatedSeats: " + heatedSeats+"\n";
    }

}
