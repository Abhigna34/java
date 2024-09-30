import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number (Num1): ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number (Num2): ");
            int num2 = Integer.parseInt(scanner.nextLine());
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}