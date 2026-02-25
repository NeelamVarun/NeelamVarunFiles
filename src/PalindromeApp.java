public class UC10PalindromeCheck {

    public static void main(String[] args) {
        // Input string
        String uc10Input = "Race Car";

        // Normalize: remove spaces and convert to lowercase
        String normalized = uc10Input.replaceAll("\\s+", "").toLowerCase();

        // Check if palindrome
        boolean isUc10Palindrome = new StringBuilder(normalized).reverse().toString().equals(normalized);

        // Output the result
        System.out.println("UC10: Normalized '" + uc10Input + "' result: " + isUc10Palindrome);
    }
}