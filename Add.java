
public class Add {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter Choice 1. Multiply 2.Divide 3.Subtract 4.Add :   ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int answer = num1 * num2;
            System.out.println("Your answer: " + answer);
        } else if (choice == 2) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                double answer = num1 / num2;
                System.out.println("Your answer: " + answer);
            }
        } else if (choice == 3) {
            int answer = num1 - num2;
            System.out.println("Your answer: " + answer);
        } else if (choice == 4) {
            int answer = num1 + num2;
            System.out.println("Your answer: " + answer);
        } else {
            System.out.println("Invalid choice! Please select a number between 1 and 4.");
        }
        
        scanner.close();
    }
}
