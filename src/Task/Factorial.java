package Task;
import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            int fact = 1;

            // Factorial calculation
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + n + " = " + fact);
        }
}
