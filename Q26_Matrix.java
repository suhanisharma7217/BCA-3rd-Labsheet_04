class Matrix {
    int[][] values = new int[2][2];
    static String matrixType = "2x2 Matrix";

    Matrix(int a, int b, int c, int d) {
        values[0][0] = a; values[0][1] = b;
        values[1][0] = c; values[1][1] = d;
    }

    void addAndSubtract(Matrix other) {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = values[i][j] + other.values[i][j];
                difference[i][j] = values[i][j] - other.values[i][j];
            }
        }
        System.out.println("Addition:");
        print(sum);
        System.out.println("Subtraction (first - second):");
        print(difference);
    }

    void print(int[][] matrix) {
        for (int i = 0; i < 2; i++)
            System.out.println(matrix[i][0] + " " + matrix[i][1]);
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(1, 2, 3, 4);
        Matrix m2 = new Matrix(5, 6, 7, 8);
        System.out.println(matrixType);
        m1.addAndSubtract(m2);
    }
}
