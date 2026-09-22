import java.util.Scanner;
public class ARRAY_INDEX_VALIDATION {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Element = " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        sc.close();
    }
}
