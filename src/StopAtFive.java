import java.util.Scanner;

public class StopAtFive {
    public static void main (String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int num = 0;
        while (num != 5) {
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
        }
        System.out.println ("Entered 5. Stopping.");
        scanner.close();
    }
}
