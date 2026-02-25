import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Palindrome Checker App ---");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
        sc.close();
    }
}