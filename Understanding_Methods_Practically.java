import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, Welcome to Java!");

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Output with user input
        System.out.println("Hello " + name + ", nice to meet you!");

        // Close scanner
        sc.close();
    }
}