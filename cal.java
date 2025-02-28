import java.util.Scanner;

public class cal {
    
    // Function for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Input: Second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Perform multiplication
        int multiplicationResult = multiply(num1, num2);
        System.out.println("Multiplication result: " + multiplicationResult);
        
        // Close the scanner
        scanner.close();
    }
}
