import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ask_user = new Scanner(System.in);

        String first_name;
        String last_name;
        String middle_name;

        System.out.print("Enter first name: ");
        first_name = ask_user.nextLine();

        System.out.print("Enter last name: ");
        last_name = ask_user.nextLine();

        System.out.print("Enter middle name: ");
        middle_name = ask_user.nextLine();

        User manipulate_user = new User(first_name, last_name, middle_name);


    }

}

class User {

    protected String first_name;
    protected String last_name;
    protected String middle_name;



    public User(String first, String last, String middle) {

        this.first_name = first;
        this.last_name = last;
        this.middle_name = middle;

        String filename = "C:\\Users\\USER\\IdeaProjects\\userinfo\\src\\user_files\\user_data.txt";

        try (FileWriter add_toFile = new FileWriter(filename, true)) {

            add_toFile.write(first_name + "\n" + last_name + "\n" + middle_name + "\n");


        } catch (IOException e) {

            System.err.println("Error of " + e.getMessage());

        }



    }

    @Override
    public String toString() {
        return first_name;
    }
}