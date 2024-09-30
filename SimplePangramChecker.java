import java.util.Scanner;

public class SimplePangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        scanner.close();

        if (isPangram(sentence)) {
            System.out.println(1); 
        } else {
            System.out.println(-1); 
        }
    }

    // Method to check if the sentence is a pangram
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase(); 
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) < 0) {
                return false; 
            }
        }
        return true;
    }
}