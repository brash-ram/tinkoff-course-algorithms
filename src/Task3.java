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

    private static void findFreeCell(boolean[][] mat, char fig) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (fig == '0') {
                    if (mat[i + 1 % 4][j] && mat[i + 2 % 4][j] && mat[i + 3 % 4][j]) {
                        if (j - 1 > 0 && !mat[i][j - 1]) {
                            mat[i][j - 1] = true;
                            mat[i + 1 % 4][j] = mat[i + 2 % 4][j] = mat[i + 3 % 4][j] = false;
                            return;
                        } else if (!mat[i][j + 1]) {
                            mat[i][j + 1] = true;
                            mat[i + 1 % 4][j] = mat[i + 2 % 4][j] = mat[i + 3 % 4][j] = false;
                            return;
                        }
                    }
                } else {
                    if (mat[i][j + 1 % 4] && mat[i][j + 2 % 4] && mat[i][j + 3 % 4]) {

                    }
                }
            }
        }
    }

//    private static void fillRowWhenRow(boolean[][] mat) {
//        for(int i = 0; i < 4; i++) {
//            if ((mat[i][0] && mat[i][1]) && (!mat[i][2] && !mat[i][3])) {
//                mat[i][0] = false;
//                mat[i][1] = false;
//                System.out.println(i + " " + 1);
//            } else if ((mat[i][2] && mat[i][3]) && (!mat[i][0] && !mat[i][1])) {
//                mat[i][2] = false;
//                mat[i][3] = false;
//                System.out.println(i + " " + 3);
//            } else if ((mat[i][0] && mat[i][3]) && (!mat[i][1] && !mat[i][2])) {
//                mat[i][0] = false;
//                mat[i][3] = false;
//                System.out.println(i + " " + 2);
//            }
//        }
//    }

    public static void fillColumnWhenRow(boolean[][] mat) {

    }
}
