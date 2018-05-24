package designPatterns.composite;


public class PyramidScheme {
    public static void main(String[] args) {
        designPatterns.composite.SalesPerson salesPerson;
        salesPerson = new designPatterns.composite.SalesPerson("Tina", 100);
        System.out.println("Før: " + salesPerson);

        for (int i = 0; i <5; i++) {
            designPatterns.composite.SalesPerson friend;
            friend = new designPatterns.composite.SalesPerson("Kaj" + i, 500);
            salesPerson.add(friend);

            for (int j = 0; j <5; j++) {
                designPatterns.composite.SalesPerson friendOfFriend;
                friendOfFriend= new designPatterns.composite.SalesPerson("Kaj" + i + "sVen" + j, 500);
                friend.add(friendOfFriend);
            }
        }

        System.out.println("Efter: " + salesPerson);
    }
}
