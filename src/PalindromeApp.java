public class UC12PalindromeStrategy {

    public static void main(String[] args) {
        // Input string
        String input = "Race Car";

        // Strategy using lambda expression
        PalindromeStrategy strategy = (str) -> {
            // Normalize: remove spaces and convert to lowercase
            String normalized = str.replaceAll("\\s+", "").toLowerCase();
            // Check palindrome
            return new StringBuilder(normalized).reverse().toString().equals(normalized);
        };

        // Use strategy to check palindrome
        System.out.println("UC12: Strategy Pattern check: " + strategy.isValid(input));
    }

    // Interface defining the strategy
    interface PalindromeStrategy {
        boolean isValid(String s);
    }
}