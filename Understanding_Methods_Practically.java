// 7. Reverse a number (e.g., 123 → 321)
import java.util.Scanner;
public class Main
{ 
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse=0, remender;

        while( number != 0)
        {
            remender = number%10;
            reverse = reverse*10 + remender;
            number = number/10;
        }
        System.out.println(reverse);
    }
}