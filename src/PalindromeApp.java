import java.util.*;

public class PalindromeApp {
    public static void main(String[] args) {
        // UC1: Welcome Message & Version
        System.out.println("Palindrome Checker App");
        System.out.println("UC1: Version: 1.0");
        System.out.println("-----------------------------");

        // UC2: Hardcoded Palindrome
        String input = "madam";
        if (input.equals("madam")) {
            System.out.println("UC2: madam is a palindrome (Hardcoded)");
        }

        // UC3: String Reverse Loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("UC3: " + input + " is a palindrome (String Reverse)");
        }

        // UC4: Char Array Two-Pointer
        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            if (charArray[i] != charArray[j]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("UC4: Palindrome check: " + isPalindrome + " (Char Array)");

        // UC5: Stack (Deque as Stack)
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        System.out.println("UC5: " + input.equals(res.toString()) + " (Stack)");

        // UC6: Queue + Stack
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();
        for (char c : input.toCharArray()) {
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

        // UC7: Deque Two-End Removal
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isDequePalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isDequePalindrome = false;
                break;
            }
        }
        System.out.println("UC7: Palindrome check: " + isDequePalindrome + " (Deque)");

        // UC8: Singly Linked List Traversal
        ListNode head = new ListNode(input.charAt(0));
        ListNode currentUC8 = head;
        for (int i = 1; i < input.length(); i++) {
            currentUC8.next = new ListNode(input.charAt(i));
            currentUC8 = currentUC8.next;
        }
        System.out.println("UC8: Singly Linked List created for node traversal");

        // UC9: Recursive Palindrome Checker
        boolean isUc9Palindrome = isRecursive(input, 0, input.length() - 1);
        System.out.println("UC9: Recursive check: " + isUc9Palindrome);

        // UC10: Normalization (Spaces and Case)
        String uc10Input = "Race Car";
        String normalized = uc10Input.replaceAll("\\s+", "").toLowerCase();
        boolean isUc10Palindrome = new StringBuilder(normalized).reverse().toString().equals(normalized);
        System.out.println("UC10: Normalized '" + uc10Input + "' result: " + isUc10Palindrome);

        // UC11: OOP Service
        PalindromeService service = new PalindromeService();
        System.out.println("UC11: OOP Service check: " + service.check(input));

        // UC12: Strategy Pattern (Lambda)
        PalindromeStrategy strategy = (str) -> new StringBuilder(str).reverse().toString().equals(str);
        System.out.println("UC12: Strategy Pattern check: " + strategy.isValid(input));

        // UC13: User Input Integration
        Scanner sc = new Scanner(System.in);
        System.out.print("\nFinal Test - Enter a word: ");
        String userVal = sc.next();
        System.out.println("UC13: Final check for '" + userVal + "': " + strategy.isValid(userVal));
        sc.close();
    }

    // UC8 Node Structure
    static class ListNode {
        char val;
        ListNode next;
        ListNode(char val) { this.val = val; }
    }

    // UC9 Recursive Method
    public static boolean isRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isRecursive(s, start + 1, end - 1);
    }

    // UC11 Service Class
    static class PalindromeService {
        public boolean check(String s) {
            return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        }
    }

    // UC12 Functional Interface
    interface PalindromeStrategy {
        boolean isValid(String s);
    }
}