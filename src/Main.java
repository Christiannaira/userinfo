import java.io.*;
import java.util.Scanner;

public class Main extends User {

    public static void main(String[] args) {

        Main user = new Main();

        user.setFirst_name("Christian");
        user.setLast_name("Naira");
        user.setMiddle_name("Mercado");

//        System.out.println(user.getFirst_name());
//        System.out.println(user.getLast_name());
//        System.out.println(user.getMiddle_name());

        printOut(user);

    }

    static void printOut(Main user){

        String filename = "C:\\Users\\USER\\IdeaProjects\\userinfo\\src\\user_files\\user_data2.txt";
        String first_name = user.getFirst_name();
        String last_name = user.getLast_name();
        String middle_name = user.getMiddle_name();

//        try (FileWriter appendText = new FileWriter(filename, true)) {
//
//            File checkFile = new File(filename);
//
//            appendText.write("\nFirst Name: " + first_name + "\nLast Name: " + last_name + "\nMiddle Name: " + middle_name);
//            System.out.println("Successfully add to the file");
//
//        } catch (IOException e) {
//
//            System.err.println("error " + e.getMessage());
//
//        }
        File readFile = new File(filename);

        try {

            PrintWriter p = new PrintWriter(readFile);
            p.println(8);
            p.println(6);
            p.println(7);
            p.println(5);

            p.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
            System.out.println(e.getStackTrace());

        }

        try {
            Scanner s = new Scanner(new File(filename));

            int total = 0;

            while (s.hasNext()) {
                String input = s.nextLine();
                int i = Integer.parseInt(input);
                System.out.println(total + " " + input);
                total += i;

            }

            s.close();
            System.out.println(total);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }


    }

}