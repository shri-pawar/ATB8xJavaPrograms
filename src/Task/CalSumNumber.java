package Task;
import java.util.Scanner;

public class CalSumNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("sum of the number from 1 to "+ n +" is: "+sum);
    }

}

