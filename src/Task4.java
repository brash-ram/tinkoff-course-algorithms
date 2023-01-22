import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int maxX = 0;
        int maxDivisors = 0;

        for (int i = n; i >= n / 2; i--) {
            int res = temp(i);

            map.put(i, res);
        }

        for (Map.Entry<Integer, Integer> val: map.entrySet()) {
            if (val.getValue() >= maxX && val.getKey() > maxDivisors) {
                maxX = val.getValue();
                maxDivisors = val.getKey();
            }
        }

        System.out.println(maxDivisors);
        System.out.println(maxX);

    }

    private static int getNumberDivisors(int n) {
        int numberDivisors = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                numberDivisors++;
            }
        }
        return numberDivisors;
    }

    private static int temp(int digit) {
        int count = 0;

        for (int i = 1; i < (int) Math.sqrt(digit) + 1; i++) {
            if (i * i == digit) {
                count++;
            } else if (digit % i == 0) {
                count += 2;
            }
        }

        return count;
    }
}
