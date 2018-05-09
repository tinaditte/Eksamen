package Interface;

/**
 * Created by Martin on 09-05-2018.
 */
public class Tulip implements Flower{
    @Override
    public String name() {
        System.out.println("Tulip");
        return "";
    }

    @Override
    public String color() {
        System.out.println("Red, Yellow, Orange");
        return "";
    }

    @Override
    public String season() {
        System.out.println("Spring");
        return "";
    }

    @Override
    public String type() {
        System.out.println("Unedible flower");
        return null;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public String taste() {
        return null;
    }

    @Override
    public String size() {
        return null;
    }

    @Override
    public String smell() {
        return null;
    }

    @Override
    public boolean indoor() {
        return false;
    }

    @Override
    public String water() {
        return null;
    }
}
