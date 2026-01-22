import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalc = "yes";
        
        while(continueCalc.equalsIgnoreCase("yes")) {
            System.out.println("\n=== Simple Calculator ===");
            
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);
                
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                
                switch(operator) {
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        continue;
                }
                
                System.out.println("Result: " + result);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter valid numbers.");
                scanner.nextLine();
                continue;
            }
            
            System.out.print("Do another calculation? (yes/no): ");
            continueCalc = scanner.next();
        }
        
        scanner.close();
    }
}
