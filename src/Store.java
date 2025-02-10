import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Store {


    public Store(User userInfos) {


    }

    public void storeData() {

        User userInfos = new User();

        System.out.println(userInfos.getFirst_name());

        String filename = "C:\\Users\\USER\\IdeaProjects\\userinfo\\src\\user_files\\my_file.txt";
        String textToAppend = "This is the text to append.\n"; // Include newline for new lines

        try (FileWriter writer = new FileWriter(filename, true)) { // The 'true' argument is crucial for appending
            writer.write(textToAppend);
            System.out.println("Text appended successfully!");
        } catch (IOException e) {
            System.err.println("Error appending text: " + e.getMessage());
        }



    }

}
