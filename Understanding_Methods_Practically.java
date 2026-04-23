import java.util.Scanner;
public class main
{
public static void main(String[] args) 
{
   for(int i = 1 ; i<=5 ; i++)
   {
    for(int j = 1 ; j<=i ; j++)
    {
        System.out.print("x");
    }
    System.out.println(" ");
   }
   for(int m = 1 ; m<=4 ; m++)
   {
    for(int n =4 ; n>=m ; n--)
    {
        System.out.print("x");
    }
    System.out.println(" ");
   }    
}
}