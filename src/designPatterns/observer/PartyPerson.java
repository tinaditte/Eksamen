package designPatterns.observer;

public class PartyPerson implements StringObserver {

    @Override
    public void update(String day) {
        if (day.equals("FRIDAY")) {
            System.out.println("Drunk PartyPerson");
            return;
        }
        System.out.println("Sad PartyPerson");
    }
}
