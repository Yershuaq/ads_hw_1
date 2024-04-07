import java.util.Scanner;

public class number_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        int result = calculatePower(a, n);

        System.out.println(a + "^" + n + " = " + result);

        scanner.close();
    }

    public static int calculatePower(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * calculatePower(a, n - 1);
        }
    }
}

