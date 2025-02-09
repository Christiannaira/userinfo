import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main userObj = new Main(); // create an instance or object for the Main class
        userObj.askUser(); // Call askUser method to execute its function

    }

    public void askUser() {

        // three empty variables to store user input after prompting
        String first_name;
        String last_name;
        String middle_name;

        User addUser = new User(); // create an instance or object for the User class

        Scanner askUser = new Scanner(System.in); // create an instance or object for the Scanner class

        System.out.print("Enter your First Name: ");
        first_name = askUser.nextLine();

        System.out.print("Enter your Last Name: ");
        last_name = askUser.nextLine();

        System.out.print("Enter your Middle Name: ");
        middle_name = askUser.nextLine();

        addUser.setFirst_name(first_name);
        addUser.setLast_name(last_name);
        addUser.setMiddle_name(middle_name);


    }

}