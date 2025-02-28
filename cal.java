public class cal {

    // Function to perform division
    public static int div(int a, int b) {
        // Check if the denominator is zero
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        // Return the result of division
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Test the division function
            int result = div(10, 2); // Change the numbers as needed
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println(e.getMessage());
        }
    }
}


