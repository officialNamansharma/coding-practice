//Compostite and prime code
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int x = 0; 
        
          if (n == 1) 
        {
         System.out.println("not prime not compostie");
        
        }
        else
        {
        for(int i=2 ; i<=n-1 ; i++)
        {
            if (n%i==0) 
            {
                System.out.println("Compostite number");
                x = 1;
                break;
            }
        }

      

        if (x == 0) 
            {
                System.out.println("Prime number");    
            }
    }
    }
}