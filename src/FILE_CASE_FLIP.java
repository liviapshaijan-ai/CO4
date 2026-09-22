import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FILE_CASE_FLIP {

    public static void main(String[] args) {

        // Scanner to read input from keyboard
        Scanner keyboard = new Scanner(System.in);

        File originalFile;

        // -----------------------------------------
        // STEP 1: Ask for a valid file name
        // -----------------------------------------

        while (true) {

            System.out.print("Enter the file name: ");
            String fileName = keyboard.nextLine();

            // Create File object
            originalFile = new File(fileName);

            // Check whether file exists
            if (originalFile.exists() && originalFile.isFile()) {

                System.out.println("File found.\n");
                break;

            } else {

                System.out.println("File not found. Please try again.\n");
            }
        }


        // -----------------------------------------
        // STEP 2: Display first five lines
        // -----------------------------------------

        System.out.println("FIRST FIVE LINES OF ORIGINAL FILE");
        System.out.println("---------------------------------");

        displayFirstFiveLines(originalFile);


        // Create temporary file
        File tempFile = new File("temp.txt");

        try {

            // Open original file for reading
            Scanner reader = new Scanner(originalFile);

            // Open temporary file for writing
            PrintWriter writer = new PrintWriter(tempFile);

            // Read each line
            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                // Flip the case
                line = flipCase(line);

                // Write modified line to temp file
                writer.println(line);
            }

            // Close files
            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error while processing the file.");

            keyboard.close();
            return;
        }


        // -----------------------------------------
        // STEP 3: Copy temp file to original file
        // -----------------------------------------

        try {

            // Read temporary file
            Scanner reader = new Scanner(tempFile);

            // Open original file for writing
            PrintWriter writer = new PrintWriter(originalFile);

            // Copy modified content
            while (reader.hasNextLine()) {

                writer.println(reader.nextLine());
            }

            // Close files
            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error while copying the file.");

            keyboard.close();
            return;
        }


        // -----------------------------------------
        // STEP 4: Display modified file
        // -----------------------------------------

        System.out.println();
        System.out.println("FIRST FIVE LINES AFTER FLIPPING THE CASE");
        System.out.println("----------------------------------------");

        displayFirstFiveLines(originalFile);


        // -----------------------------------------
        // STEP 5: Delete temporary file
        // -----------------------------------------

        tempFile.delete();

        keyboard.close();
    }


    // -----------------------------------------
    // Method to display first five lines
    // -----------------------------------------

    public static void displayFirstFiveLines(File file) {

        try {

            Scanner reader = new Scanner(file);

            int count = 0;

            while (reader.hasNextLine() && count < 5) {

                System.out.println(reader.nextLine());

                count++;
            }

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("Unable to open the file.");
        }
    }


    // -----------------------------------------
    // Method to flip the case
    // -----------------------------------------

    public static String flipCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Uppercase → lowercase
            if (Character.isUpperCase(ch)) {

                result = result + Character.toLowerCase(ch);

                // Lowercase → uppercase
            } else if (Character.isLowerCase(ch)) {

                result = result + Character.toUpperCase(ch);

                // Keep numbers, spaces and symbols unchanged
            } else {

                result = result + ch;
            }
        }

        return result;
    }
}