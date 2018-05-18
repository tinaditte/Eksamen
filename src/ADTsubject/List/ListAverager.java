package ADTsubject.List;

import java.util.*;

public class ListAverager {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        LinkedList<Integer> linkedNumbers = new LinkedList<>();
        Stack<Integer> stackNumbers = new Stack<>();

        Random random = new Random();
        for(int i = 0; i <= 100; i++){
            int numbers = random.nextInt(1000);
             arrayNumbers.add(numbers);
             linkedNumbers.add(numbers);
             stackNumbers.add(numbers);
        }

        printAverage(arrayNumbers);
        printAverage(linkedNumbers);
        printAverage(stackNumbers);
    }

    private static void printAverage(List<Integer> list){

        double sum = 0.0;
        for (Integer integer : list){
            sum += integer;
        }
        System.out.println(sum / list.size());
    }
}
