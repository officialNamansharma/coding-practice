// Check whether a number is prime or not 
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=2 ; i<=number-1 ; i++)
        {
            if(number%i == 0)
            {
                count = count+1;
            }
        }
        if (count == 0) 
        {
         System.out.printf("Prime");    
        } else 
        {
         System.out.println("Not Prime");   
        }
    }
}