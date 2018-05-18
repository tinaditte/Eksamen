package OOP.Abstraction.Abstraction;

public class Cat extends Animal{

    public Cat(){
        nickname = "Misser";
    }

    @Override
    public String sound() {
        return "meow";
    }
}
