package threads_socket_tcp_udp.socket_tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

    private static InetAddress host;
    private static final int PORT = 4250;

    public static void main(String[] args) {
        try {
            host = InetAddress.getLocalHost();
        }catch (UnknownHostException uhe){
            System.out.println("Unable to locate Host");
            System.exit(1);
        }
        accessServer();
    }

    private static void accessServer(){
        Socket link = null;

        try {
            link = new Socket(host, PORT);
            Scanner input = new Scanner(link.getInputStream());
            PrintWriter output = new PrintWriter(link.getOutputStream(),true);

            Scanner userEntry = new Scanner(System.in);
            String msg;
            String resp;

            do {
                System.out.println("Enter your message: ");
                msg = userEntry.nextLine();
                output.println(msg);
                resp = input.nextLine();

                System.out.println("\nSERVER> " + resp);
            }
            while (!msg.equals("EXIT"));
        } catch (IOException ex){
            ex.printStackTrace();
        }

        finally {
            try {
                System.out.println("Terminates connection...");
                link.close();
            }catch (IOException ex){
                System.out.println("Unable to disconnect, force shutdown now...");
                System.exit(1);
            }
        }
    }
}
