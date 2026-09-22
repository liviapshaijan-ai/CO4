import java.util.Scanner;
import java.util.InputMismatchException;

public class MULTIPLE_EXCEPTION_HANDLING {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();

            System.out.print("Enter second integer: ");
            int b = sc.nextInt();

            int[] numbers = {a, b};

            int result = numbers[0] / numbers[1];

            System.out.println("Division result = " + result);

            System.out.println("Third element = " + numbers[2]);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        sc.close();
    }
}
