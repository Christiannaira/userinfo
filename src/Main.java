import java.util.Scanner;

public class Main extends User {

    public static void main(String[] args) {

        Main user = new Main();

        user.setFirst_name("Christian");
        user.setLast_name("Naira");
        user.setMiddle_name("Mercado");

        System.out.println(user.getFirst_name());
        System.out.println(user.getLast_name());
        System.out.println(user.getMiddle_name());

        printOut(user);

    }

    static void printOut(Main user){

        System.out.println(user.getFirst_name());


    }

}