public class UC11PalindromeOOP {

    public static void main(String[] args) {
        // Input string
        String input = "Race Car";

        // Use PalindromeService to check
        PalindromeService service = new PalindromeService();
        System.out.println("UC11: OOP Service check: " + service.check(input));
    }

    // PalindromeService class
    static class PalindromeService {
        public boolean check(String s) {
            // Normalize: remove spaces and ignore case
            String normalized = s.replaceAll("\\s+", "").toLowerCase();
            // Check palindrome
            return normalized.equals(new StringBuilder(normalized).reverse().toString());
        }
    }
}}