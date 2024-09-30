public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double initialBalance) {
        this.savingsBalance = initialBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04); 

        SavingsAccount account1 = new SavingsAccount(1000.00);
        SavingsAccount account2 = new SavingsAccount(2000.00);

        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.printf("Account 1 Balance: $%.2f%n", account1.getSavingsBalance());
        System.out.printf("Account 2 Balance: $%.2f%n", account2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05); 

        
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

        
        System.out.printf("Account 1 Balance after interest rate change: $%.2f%n", account1.getSavingsBalance());
        System.out.printf("Account 2 Balance after interest rate change: $%.2f%n", account2.getSavingsBalance());
    }
}
