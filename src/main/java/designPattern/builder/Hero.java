package designPattern.builder;

public class Hero {
    private String name, surname, motherName, fatherName, cateName, sisterName, brotherName, grandmotherName, address, school;
    private double weight, height, waistCircumference, shoeSize;
    private boolean married, driver;


    // constructor for Strings
    public Hero(String name, String surname, String motherName, String fatherName,
                String cateName, String sisterName, String brotherName, String
                        grandmotherName, String address, String school) {
        this.name = name;
        this.surname = surname;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.cateName = cateName;
        this.sisterName = sisterName;
        this.brotherName = brotherName;
        this.grandmotherName = grandmotherName;
        this.address = address;
        this.school = school;

    }

    // constructor for double
    public Hero(double weight, double height, double waistCircumference, double shoeSize) {
        this.weight = weight;
        this.height = height;
        this.waistCircumference = waistCircumference;
        this.shoeSize = shoeSize;
    }

    //boolean constructor
    public Hero(boolean married, boolean driver) {
        this.married = married;
        this.driver = driver;
    }

    //family constructor
    public Hero(String name, String surname, String motherName, String fatherName,
                String sisterName, String brotherName, String grandmotherName) {
        this.name = name;
        this.surname = surname;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.sisterName = sisterName;
        this.brotherName = brotherName;
        this.grandmotherName = grandmotherName;
    }
    // heroes constructor (only hero data)

    public Hero(String name, String surname, double weight, double height, double waistCircumference, double shoeSize, boolean married, boolean driver) {
        this.married = married;
        this.driver = driver;
        this.weight = weight;
        this.height = height;
        this.waistCircumference = waistCircumference;
        this.shoeSize = shoeSize;
        this.name = name;
        this.surname = surname;
    }

    // no args constructor
    public Hero() {

    }
}
