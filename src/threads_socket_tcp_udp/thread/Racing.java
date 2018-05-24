package threads_socket_tcp_udp.thread;

public class Racing{

    public static void main(String[] args) {
        Racing aRace = new Racing();
    }

    public void launching(String name){
        RaceCar rc = new RaceCar(name);
        Thread rcThread = new Thread(rc);
        rcThread.start();
    }

    public Racing(){
        launching("Blue Car");
        launching("Red Car");
        launching("Green Car");
        launching("Yellow Car");
        launching("Pink Car");
        launching("Purple Car");
        launching("Orange Car");
        launching("Violet Car");
    }

}