package designPattern.builder;

public class Hero {
    private String name, surname, motherName, fatherName, cateName, sisterName, brotherName, grandmotherName, address, school;
    private double weight, height, waistCircumference, shoeSize;
    private boolean married, driver;

    private Hero(String name, String surname, String motherName, String fatherName, String cateName,
                 String sisterName, String brotherName, String grandmotherName, String address,
                 String school, double weight, double height, double waistCircumference, double shoeSize,
                 boolean married, boolean driver) {
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
        this.weight = weight;
        this.height = height;
        this.waistCircumference = waistCircumference;
        this.shoeSize = shoeSize;
        this.married = married;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "HERO:\n" +
                " name = " + name + "\n" +
                " surname = " + surname + "\n" +
                " motherName = " + motherName + "\n" +
                " fatherName = " + fatherName + "\n" +
                " cateName = " + cateName + "\n" +
                " sisterName = " + sisterName + "\n" +
                " brotherName = " + brotherName + "\n" +
                " grandmotherName = " + grandmotherName + "\n" +
                " address = " + address + "\n" +
                " school =' " + school + "\n" +
                " weight = " + weight + "\n" +
                " height = " + height + "\n" +
                " waistCircumference = " + waistCircumference + "\n" +
                " shoeSize = " + shoeSize + "\n" +
                " married = " + married + "\n" +
                " driver = " + driver;
    }

    public static class Builder {

        private String name;
        private String surname;
        private String motherName;
        private String fatherName;
        private String cateName;
        private String sisterName;
        private String brotherName;
        private String grandmotherName;
        private String address;
        private String school;
        private double weight;
        private double height;
        private double waistCircumference;
        private double shoeSize;
        private boolean married;
        private boolean driver;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public Builder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Builder setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }

        public Builder setSisterName(String sisterName) {
            this.sisterName = sisterName;
            return this;
        }

        public Builder setBrotherName(String brotherName) {
            this.brotherName = brotherName;
            return this;
        }

        public Builder setGrandmotherName(String grandmotherName) {
            this.grandmotherName = grandmotherName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWaistCircumference(double waistCircumference) {
            this.waistCircumference = waistCircumference;
            return this;
        }

        public Builder setShoeSize(double shoeSize) {
            this.shoeSize = shoeSize;
            return this;
        }

        public Builder setMarried(boolean married) {
            this.married = married;
            return this;
        }

        public Builder setDriver(boolean driver) {
            this.driver = driver;
            return this;
        }

        public Hero createHero() {
            return new Hero(name, surname, motherName, fatherName, cateName, sisterName, brotherName, grandmotherName, address, school, weight, height, waistCircumference, shoeSize, married, driver);
        }
    }
}
