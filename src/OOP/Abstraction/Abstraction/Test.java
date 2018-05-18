package OOP.Abstraction.Abstraction;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.cry();

        animal = new Dog("Haku");
        animal.cry();

        animal = new Bird();
        animal.cry();
    }
}
