import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean[][] f = new boolean[4][4];
        long prev = System.currentTimeMillis();
        for(int i = 0; i < line.length(); i++) {
            char o = line.charAt(i);
            if (!findFreeCell(f, o)) {
                insertFig(f, o);
            }
            clearMat(f);
//            printM(f);
        }
        System.out.println(System.currentTimeMillis() - prev);
    }

    public static void printM(boolean[][] mat) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void clearMat(boolean[][] mat) {
        for (int i = 0; i < 4; i++) {
            if (mat[i][0] && mat[i][1] && mat[i][2] && mat[i][3]) {
                mat[i][0] = mat[i][1] = mat[i][2] = mat[i][3] = false;
            }
            if (mat[0][i] && mat[1][i] && mat[2][i] && mat[3][i]) {
                mat[0][i] = mat[1][i] = mat[2][i] = mat[3][i] = false;
            }
        }
    }

    private static boolean findFreeCell(boolean[][] mat, char fig) {
        if (fig == '1') {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (mat[(i + 1) % 4][j] && mat[(i + 2) % 4][j] && mat[(i + 3) % 4][j]) {
                        if (j - 1 > 0 && !mat[i][j - 1]) {
                            mat[i][j - 1] = true;
                            mat[(i + 1) % 4][j] = mat[(i + 2) % 4][j] = mat[(i + 3) % 4][j] = false;
//                            System.out.println(1);
                            System.out.println((i + 1) + " " + (j + 1));
                            return true;
                        } else if (j + 1 < 4 && !mat[i][j + 1]) {
                            mat[i][j + 1] = true;
                            mat[(i + 1) % 4][j] = mat[(i + 2) % 4][j] = mat[(i + 3) % 4][j] = false;
//                            System.out.println(1);
                            System.out.println((i + 1) + " " + (j + 1));
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (mat[i][(j + 1) % 4] && mat[i][(j + 2) % 4] && mat[i][(j + 3) % 4]) {
                        if (i - 1 > 0 && !mat[i - 1][j]) {
                            mat[i - 1][j] = true;
                            mat[i][(j + 1) % 4] = mat[i][(j + 2) % 4] = mat[i][(j + 3) % 4] = false;
//                            System.out.println(1);
                            System.out.println((i + 1) + " " + (j + 1));
                            return true;
                        } else if (i + 1 < 4 && !mat[i + 1][j]) {
                            mat[i + 1][j] = true;
                            mat[i][(j + 1) % 4] = mat[i][(j + 2) % 4] = mat[i][(j + 3) % 4] = false;
//                            System.out.println(1);
                            System.out.println((i + 1) + " " + (j + 1));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void insertFig(boolean[][] mat, char fig) {
        if (fig == '1') {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!mat[i][j] && !mat[i][j + 1]) {
                        mat[i][j] = true;
                        mat[i][j + 1] = true;
//                        System.out.println(2);
                        System.out.println((i + 1) + " " + (j + 1));
                        return;
                    }
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!mat[j][i] && !mat[j + 1][i]) {
                        mat[j][i] = true;
                        mat[j + 1][i] = true;
//                        System.out.println(2);
                        System.out.println((i + 1) + " " + (j + 1));
                        return;

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
