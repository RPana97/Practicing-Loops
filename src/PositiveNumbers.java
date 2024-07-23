import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        while (num != 0) {
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Number must be positive");
            } else if (num == 0) {
                System.out.println("Entered 0. Ending.");
            } else {
                System.out.println ("Number is "+ num);
            }
        }
    }
}
