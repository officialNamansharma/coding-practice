// Find the Largest of three number in Java 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c) 
        {
            System.out.println("A is Greater");
        } 
        else if(b>a && b>c)
        {
            System.out.println("B is Greater");
        } 
        else if(c>a && c>b)
        {
            System.out.println("C is Greater");
        }
    }
}