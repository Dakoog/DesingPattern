package designPattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Hero myHeroOfBonnieTyler = new Hero.Builder()
                .setName("Super")
                .setSurname("Sheriff")
                .setMarried(false)
                .setDriver(true)
                .createHero();
        System.out.println(myHeroOfBonnieTyler);
        Hero myFamily = new Hero.Builder()
                .setFatherName("John")
                .setMotherName("Liza")
                .setBrotherName("Peter")
                .setSisterName("Margie")
                .setGrandmotherName("Barbora")
                .setCateName("Blue")
                .setAddress("Pcim Dolny")
                .createHero();
        System.out.println(myFamily);
    }

}

