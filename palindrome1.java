
public class Palindrome {
    public static void main(String[] args) {
        // Fetch the input from an environment variable
        String input = System.getenv("PALINDROME_INPUT");
        
        // Check if the input is provided
        if (input == null || input.isEmpty()) {
            System.out.println("Please provide an input string via the PALINDROME_INPUT environment variable.");
            return;
        }
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

