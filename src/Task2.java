import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCars = scanner.nextInt();
        long[] cars = new long[numberCars];
        for (int i = 0; i < numberCars; i++) {
            cars[i] = scanner.nextLong();
        }
        int i = 0;
        while (i < numberCars) {
            if (i + 1 != numberCars) {
                if (cars[i] < cars[i+1]) {
                    cars[i+1] = cars[i];
                }
            }
            System.out.println(cars[i]);
            i++;
        }
    }
}
