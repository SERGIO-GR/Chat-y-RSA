package chatapp;

import chatapp2.mainChat;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Hassan Nazar -- hsnazar@kth.se
 */
public class Main {

    public static void main(String[] args) {
        InetAddress ip;
        try {

            ip = InetAddress.getLocalHost();
            System.out.println("Direccion IP Actual " + ip.getHostAddress());

        } catch (UnknownHostException e) {

            e.printStackTrace();

        }
        mainChat chatInstance = new mainChat();
        chatInstance.show();
    }

}
