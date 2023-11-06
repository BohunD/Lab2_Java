class MatrixOperations {
    public static Matrix addMatrices(Matrix A, Matrix B) {
        int rows = A.getRows();
        int cols = A.getCols();

        if (rows != B.getRows() || cols != B.getCols()) {
            throw new IllegalArgumentException("Розміри матриць не співпадають");
        }

        long[][] result = new long[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A.getMatrix()[i][j] + B.getMatrix()[i][j];
            }
        }

        return new Matrix(result);
    }

    public static long sumMaxInEvenColumns(Matrix C) {
        long[][] matrix = C.getMatrix();
        int cols = C.getCols();
        long sum = 0;

        for (int j = 0; j < cols; j += 2) {
            long max = matrix[0][j];
            for (int i = 1; i < C.getRows(); i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            sum += max;
        }

        return sum;
    }

    public static long sumMinInOddColumns(Matrix C) {
        long[][] matrix = C.getMatrix();
        int cols = C.getCols();
        long sum = 0;

        for (int j = 1; j < cols; j += 2) {
            long min = matrix[0][j];
            for (int i = 1; i < C.getRows(); i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            sum += min;
        }

        return sum;
    }
}