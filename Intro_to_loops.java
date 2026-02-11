import java.util.Scanner;

public class AddTwentyReflection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        // Adding 20
        int result = num + 20;

        // Reflecting output
        System.out.println("After adding 20, the result is: " + result);

        sc.close();
    }
}
