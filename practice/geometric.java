package practice;
import java.util.Scanner;


public class geometric {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        float n = scanner.nextFloat();
        
        int i = 0; 
        float div = 2.0f / 3.0f; 
        float sum = 0.0f; 

        while ((3 - sum) > n) {
            sum += Math.pow(div, i); 
            System.out.println("Partial sum after term " + (i + 1) + ": " + sum);
            i++; 
        }

        System.out.println("Number of terms = " + i);
        scanner.close();
    }
}
