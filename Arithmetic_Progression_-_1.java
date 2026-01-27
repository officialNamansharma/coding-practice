// Write code to find AP = a + (n-1)d 
import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    { 
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter Third number: ");
        int c = sc.nextInt();

        System.out.println("Enter term to find: ");
        int n = sc.nextInt();
        int d = b-a;
    System.out.println("Your AP is;");
    System.out.println(a + (n-1)*(d));
    }
}