import java.util.ArrayList;

public class PrimeFibonacci {
    public static void main(String[] args) {
        int limit = 100000;
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0;
        int b = 1;
        while (a <= limit) {
            fibonacciNumbers.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

    
        System.out.println("Prime Fibonacci numbers below " + limit + ":");
        for (int num : fibonacciNumbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n <= 3) return true;  // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; 

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}