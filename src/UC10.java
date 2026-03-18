public class UC10 {

    // Method to check palindrome (ignoring case and spaces)
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Remove all non-alphanumeric characters and convert to lower case
        String normalized = input.replaceAll("[\\W_]", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer technique
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

    // Main method
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome (case-insensitive & spaces ignored).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}

