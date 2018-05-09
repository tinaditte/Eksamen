package Interface;

public class PinkLady implements Fruit {
    @Override
    public String name() {
        String name = "PinkLady";
        System.out.println(name + "\n");
        return name;
    }

    @Override
    public String color() {
        String color = "Red";
        System.out.println(color + "\n");
        return color;
    }

    @Override
    public String season() {
        String season = "Summer";
        System.out.println(season + "\n");
        return season;
    }

    @Override
    public String type() {
        String type = "Apple";
        System.out.println(type + "\n");
        return type;
    }

    @Override
    public double price() {
        double price = 2.00;
        System.out.println(price + " DKK" + "\n");
        return 0;
    }

    @Override
    public boolean isSeedless() {
        boolean seedless = false;
        System.out.println("Seeds" + "\n");
        return seedless;
    }

    @Override
    public String taste() {
        String taste = "Sweet";
        System.out.println(taste);
        return taste;
    }
}
