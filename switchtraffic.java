import java.util.Scanner;
public class switchtraffic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-3) to get the command of the signal: ");
        int signal = scanner.nextInt();

        switch (signal) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Wait");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid input Please enter a number between 1 and 3.");
        }

        scanner.close();
    }
}