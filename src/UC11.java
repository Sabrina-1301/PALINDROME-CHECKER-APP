public class UC11 {

    // PalindromeChecker class encapsulates all palindrome logic
    static class PalindromeChecker {

        // Internal method to check palindrome using two-pointer technique
        public boolean checkPalindrome(String input) {
            if (input == null || input.isEmpty()) {
                return true; // empty string is considered palindrome
            }

            // Normalize input (optional: ignore case & spaces)
            String normalized = input.replaceAll("[\\W_]", "").toLowerCase();

            int start = 0;
            int end = normalized.length() - 1;

            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Test strings
        String[] testStrings = {
                "madam",
                "Step on no pets",
                "Hello"
        };

        // Check each string
        for (String str : testStrings) {
            boolean result = checker.checkPalindrome(str);
            if (result) {
                System.out.println("\"" + str + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + str + "\" is NOT a Palindrome.");
            }
        }
    }
}



