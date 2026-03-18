import java.util.Deque;
import java.util.LinkedList;

public class UC7 {

    // Main method - entry point
    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i)); // insert at rear
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {
            char front = deque.removeFirst(); // remove from front
            char rear = deque.removeLast();   // remove from rear

            if (front != rear) {
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

