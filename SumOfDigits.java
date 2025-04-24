import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(number);

        // Add each digit
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
