
import java.util.Scanner;

public class number_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFibonacciValue(n));
    }
    public static int findFibonacciValue(int n){
        if(n == 1 || n == 2) {
            return 1;
        }
        else
            return findFibonacciValue(n-1) + findFibonacciValue(n-2);
    }

}