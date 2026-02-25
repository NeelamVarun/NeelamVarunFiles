import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Palindrome Checker App ---");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = sc.nextLine();
        String word = input.replace(" ", "").toLowerCase();

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome (Ignoring Spaces).");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
        sc.close();
    }
}