public class UC9 {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String input, int start, int end) {

        // Base condition: if pointers cross or are equal
        if (start >= end) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call with reduced problem
        return isPalindrome(input, start + 1, end - 1);
    }

    // Main method
    public static void main(String[] args) {

        String input = "level";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}

