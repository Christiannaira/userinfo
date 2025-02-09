import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    }

    public void askUser() {

        Scanner askUser = new Scanner(System.in);
        String first_name;
        String last_name;
        String middle_name;

        System.out.print("Enter your First Name: ");
        first_name = askUser.nextLine();

        System.out.print("Enter your Last Name: ");
        last_name = askUser.nextLine();

        System.out.print("Enter your Middle Name: ");
        middle_name = askUser.nextLine();


    }

}