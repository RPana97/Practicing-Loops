import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("yes")) {
            System.out.print("Do you want to take a break? ");
            userInput = scanner.nextLine();
        }

        System.out.println("Break time!");
        scanner.close();
    }
}