import java.util.Scanner;

public class SumProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculating sum
        int sum = a + b;

        // Printing result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
