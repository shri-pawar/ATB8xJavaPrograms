package Task;
import java.util.Scanner;
public class DoWhileEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = scanner.nextInt();

        int count = 0;
        int number = 2;

        do {
            System.out.println(number);
            number += 2;
            count++;
        }while (count < n);
    }
}
