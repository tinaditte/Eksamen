package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        Weekday weekday = new Weekday();
        System.out.println(weekday);

        PartyPerson partyPerson = new PartyPerson();
        weekday.attach(partyPerson);

        TiredTeacher tiredTeacher = new TiredTeacher();
        weekday.attach(tiredTeacher);

        weekday.setDay("FRIDAY");

        weekday.setDay("MONDAY");
    }
}
