package designPatterns.observer;

public class TiredTeacher implements StringObserver{

    public void update(String day) {
        if (day.equals("FRIDAY")) {
            System.out.println("Happy teacher");
            return;
        }
        System.out.println("Tired teacher");
    }
}
