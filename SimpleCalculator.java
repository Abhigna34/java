import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number (Num1): ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number (Num2): ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Division by zero");
                    }
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integer values.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}