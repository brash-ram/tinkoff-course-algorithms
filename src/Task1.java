import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n % 3 != 0) {
            System.out.println(0);
        } else {
            long result = (long) Math.pow(2, n / 3);
            System.out.println(result);
        }
    }
}
