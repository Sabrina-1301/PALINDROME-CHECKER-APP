public class UC3 {

    // Main method - entry point
    public static void main(String[] args) {

        // Input string (can be changed for testing)
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        // Display reversed string (for clarity)
        System.out.println("Reversed string: " + reversed);
    }
}
