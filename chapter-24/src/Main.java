import java.net.*;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("alexandrocastro.dev.br");
        System.out.println(Address);

        InetAddress[] SW = InetAddress.getAllByName("alexandrocastro.dev.br");

        System.out.printf("Found %s address%n", SW.length);
        System.out.println("=============");

        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }

        System.out.println("=============");

        for (InetAddress inetAddress : SW) {
            System.out.println(inetAddress);
        }
    }
}