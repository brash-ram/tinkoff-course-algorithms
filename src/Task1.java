import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n % 3 != 0) {
            System.out.println(0);
        } else {
            long result = ((n / 3) * 2) * Task1.getFactorial(n / 3);
            System.out.println(result);
        }
    }

    private static long getFactorial(long f) {
        long result = 1L;
        for (long i = 1L; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
