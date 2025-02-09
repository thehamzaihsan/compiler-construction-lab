import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your GPA (0 - 4 scale): ");
        double gpa = scanner.nextDouble();

        String grade;

        if (gpa > 4.0) {
            System.out.println("Invalid GPA. Please enter a value between 0 and 4.");
            scanner.close();
            return;
        }

        if (gpa >= 4.0) {
            grade = "A";
        } else if (gpa >= 3.7) {
            grade = "A-";
        } else if (gpa >= 3.3) {
            grade = "B+";
        } else if (gpa >= 3.0) {
            grade = "B";
        } else if (gpa >= 2.7) {
            grade = "B-";
        } else if (gpa >= 2.3) {
            grade = "C+";
        } else if (gpa >= 2.0) {
            grade = "C";
        } else if (gpa >= 1.7) {
            grade = "C-";
        } else if (gpa >= 1.3) {
            grade = "D+";
        } else if (gpa >= 1.0) {
            grade = "D";
        } else if (gpa >= 0) {
            grade = "F";
        } else {
            System.out.println("Invalid GPA. Please enter a value between 0 and 4.");
            scanner.close();
            return;
        }

        System.out.println("Your letter grade is: " + grade);

        scanner.close();
    }
}
