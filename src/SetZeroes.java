import java.util.Arrays;

public class SetZeroes {
    public static void setZeroes(int[][] matrix) {
        boolean[][] setToZero = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!setToZero[i][j] && matrix[i][j] == 0) {
                    for (int l = 0; l < matrix[i].length; l++) {
                        if (matrix[i][l] != 0) {
                            setToZero[i][l] = true;
                        }
                    }
                    Arrays.fill(matrix[i], 0);
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = 0;
                            setToZero[k][j] = true;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
