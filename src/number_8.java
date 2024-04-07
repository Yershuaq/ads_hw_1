import java.util.Scanner;

public class number_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        boolean isAllDigits = checkAllDigits(s);


        if (isAllDigits) {
            System.out.println(s + " - Yes ");
        } else {
            System.out.println(s + " - No");
        }

        scanner.close();
    }

    public static boolean checkAllDigits(String s) {
        return s.matches("[0-9]+");
    }
}
