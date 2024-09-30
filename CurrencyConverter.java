import java.util.Scanner;

class CurrencyConverter {
    public void convert(double amount, String conversionType) {
        double convertedAmount = 0.0;
        switch (conversionType.toUpperCase()) {
            case "USD_TO_INR":
                convertedAmount = amount * 82.0;
                System.out.printf("%.2f USD = %.2f INR%n", amount, convertedAmount);
                break;
            case "INR_TO_USD":
                convertedAmount = amount / 82.0;
                System.out.printf("%.2f INR = %.2f USD%n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid conversion type. Please use 'USD_TO_INR' or 'INR_TO_USD'.");
        }
    }
}

public class ConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the amount:");
        double amount = scanner.nextDouble();
        
        System.out.println("Enter conversion type (USD_TO_INR or INR_TO_USD):");
        String conversionType = scanner.next();

        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.convert(amount, conversionType);
        
        scanner.close();
    }
}