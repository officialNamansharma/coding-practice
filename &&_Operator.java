//Logical operator
// && is logical and and || is logical or
// This is the code for finding 3digit number 
import java.util.Scanner;
public class classname{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if (n<1000 && n>99) {
            System.out.println("Three Digit");
        } else {
            System.out.println("Not Three Digit");
        }
       
    }
}