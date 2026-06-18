import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeMathCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Division
            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(
                    "Error: Cannot divide by zero."
            );
        }
        catch (InputMismatchException e) {
            System.out.println(
                    "Error: Please enter valid integers only."
            );
        }

        sc.close();
    }
}