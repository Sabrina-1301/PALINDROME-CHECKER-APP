import java.util.*;

// PalindromeStrategy interface (Strategy Pattern)
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack-based implementation
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String normalized = input.replaceAll("[\\W_]", "").toLowerCase();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based implementation
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        String normalized = input.replaceAll("[\\W_]", "").toLowerCase();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class to use a strategy dynamically
class PalindromeContext {
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Use the strategy
    public boolean executeStrategy(String input) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.isPalindrome(input);
    }
}

// Main App
public class UC12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("Enter a string to check for palindrome:");
        String input = scanner.nextLine();

        System.out.println("Choose algorithm: 1 = Stack, 2 = Deque");
        int choice = scanner.nextInt();

        // Set strategy dynamically
        switch (choice) {
            case 1:
                context.setStrategy(new StackStrategy());
                break;
            case 2:
                context.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice. Using Stack as default.");
                context.setStrategy(new StackStrategy());
        }

        // Execute chosen strategy
        boolean result = context.executeStrategy(input);

        if (result) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}



