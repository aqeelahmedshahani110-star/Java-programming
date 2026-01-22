public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Welcome to the Calculator Application!");
        System.out.println("Enter your operation (e.g., 5 + 3):");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double result = calculator.calculate(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Enter your operation (or type 'exit' to quit):");
        }
        
        scanner.close();
        System.out.println("Thank you for using the Calculator Application!");
    }
}