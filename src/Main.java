import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String first_name = "";
        String last_name = "";
        String middle_name = "";

        askUser(first_name, last_name, middle_name);

    }

    static void askUser(String first_name, String last_name, String middle_name) {

        Scanner askUser = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        first_name = askUser.nextLine();

        System.out.print("Enter your Last Name: ");
        last_name = askUser.nextLine();

        System.out.print("Enter your Middle Name: ");
        middle_name = askUser.nextLine();


    }

}