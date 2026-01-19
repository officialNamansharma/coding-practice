//Ternary Operator basically cool banna ka tarika or replacement of ifelse 
//expression 1 : expression 2 : expression 3
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println((n%2==0 ? "Even" : "Odd"));
    }
}