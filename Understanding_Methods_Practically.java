public class NumberSum {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            sum = sum + i;
        }

        System.out.println("Total Sum = " + sum);
    }
}