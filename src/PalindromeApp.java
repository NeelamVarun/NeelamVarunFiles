import java.util.*;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Palindrome Checker App ---");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = sc.nextLine();

        // Logic for UC5 (Space/Case handling)
        String word = input.replace(" ", "").toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        // UC6: Queue + Stack Logic
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();
        for (char c : word.toCharArray()) {
            q.add(c);
            s.push(c);
        }
        boolean isUc6Palindrome = true;
        while (!q.isEmpty()) {
            if (!q.remove().equals(s.pop())) {
                isUc6Palindrome = false;
                break;
            }
        }
        System.out.println("UC6: Palindrome check: " + isUc6Palindrome + " (Queue + Stack)");

        sc.close();
    }
}