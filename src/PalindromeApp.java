import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Palindrome Checker App ---");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        String word = original.toLowerCase();

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(original + " is a Palindrome (Case Insensitive).");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
        sc.close();
    }
}