package OOP.Abstraction.Abstraction;

public class Dog extends Animal {

    public Dog(String name){
        nickname = name;
    }

    @Override
    public String sound() {
        return "bork";
    }

}