import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FILE_HANDLING_EXCEPTION {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("\nFile Contents:");

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        sc.close();
    }
}
