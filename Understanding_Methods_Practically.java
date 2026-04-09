//Count number of Digits in a number
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != 0)
        {
            count = count+1;
            num = num/10;
        }

        System.out.println(count);
    }
}