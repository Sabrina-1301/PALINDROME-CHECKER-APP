import java.util.Stack;

public class UC5 {

    // Main method - entry point
    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string using pop operation
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}