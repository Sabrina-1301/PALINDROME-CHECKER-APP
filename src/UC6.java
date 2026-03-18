import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UC6 {

    // Main method - entry point
    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both data structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO (enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // dequeue
            char fromStack = stack.pop();     // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}