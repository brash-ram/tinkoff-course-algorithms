import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean[][] f = new boolean[4][4];
        for(int i = 0; i < line.length(); i++) {
            char o = line.charAt(i);

        }
    }

    private static void fillRowWhenRow(boolean[][] mat) {
        for(int i = 0; i < 4; i++) {
            if ((mat[i][0] && mat[i][1]) && (!mat[i][2] && !mat[i][3])) {
                mat[i][0] = false;
                mat[i][1] = false;
                System.out.println(i + " " + 1);
            } else if ((mat[i][2] && mat[i][3]) && (!mat[i][0] && !mat[i][1])) {
                mat[i][2] = false;
                mat[i][3] = false;
                System.out.println(i + " " + 3);
            } else if ((mat[i][0] && mat[i][3]) && (!mat[i][1] && !mat[i][2])) {
                mat[i][0] = false;
                mat[i][3] = false;
                System.out.println(i + " " + 2);
            }
        }
    }

    public static void fillColumnWhenRow(boolean[][] mat) {

    }
}
