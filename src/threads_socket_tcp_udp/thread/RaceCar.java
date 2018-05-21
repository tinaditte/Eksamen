package threads_socket_tcp_udp.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RaceCar implements Runnable {
    private String name = "";
    private int ditance = 0;
    private Random random = new Random();
    ArrayList<RaceCar> place = new ArrayList<>();

    public RaceCar(String name){
        this.name = name;
    }

    @Override
    public void run() {

        while (ditance < 1000){
            ditance += 100;

            try {
                Thread.sleep(random.nextInt(500));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + " " + ditance);

        }if (ditance == 1000){
            for (int i = 1; i <= 9; i++){
                place.add(RaceCar.this);
            }
        }
    }
}
