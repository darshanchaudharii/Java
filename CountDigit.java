import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            // Count digits
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}