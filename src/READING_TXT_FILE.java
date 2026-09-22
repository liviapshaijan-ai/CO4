import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class READING_TXT_FILE {

    public static void main(String[] args) {

        // Create a File object
        File file = new File("input.txt");

        try {

            // Open the file using Scanner
            Scanner scanner = new Scanner(file);

            // Read the file line by line
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                System.out.println(line);
            }

            // Close the Scanner
            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());
        }
    }
}