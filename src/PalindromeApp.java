import java.util.*;

public class PalindromeApp {
    public static void main(String[] args) {
        // ... previous UC code remains above ...

        String input = "madam"; // Or use your scanner variable

        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isDequePalindrome = true;
        while (deque.size() > 1) {
            // Updated with .equals() fix
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }
        System.out.println("UC7: Palindrome check: " + isDequePalindrome + " (Deque)");
    }
}