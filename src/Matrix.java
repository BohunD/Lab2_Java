import java.util.Random;

class Matrix {
    private long[][] mMatrix;

    public Matrix(int rows, int cols) {
        mMatrix = new long[rows][cols];
    }

    public Matrix(long[][] matrix){
        mMatrix = matrix;
    }

    public void generate() {
        Random random = new Random();
        for (int i = 0; i < mMatrix.length; i++) {
            for (int j = 0; j < mMatrix[i].length; j++) {
                mMatrix[i][j] = random.nextLong(1000);
            }
        }
    }

    public long[][] getMatrix() {
        return mMatrix;
    }

    public int getRows() {
        return mMatrix.length;
    }

    public int getCols() {
        return mMatrix[0].length;
    }

    public void printMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                System.out.print(mMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}