import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // C_5 = 1502 % 5 = 2 -> C = A + B
        // C_7 = 1502 % 7 = 4 -> long
        // C_11 = 1502 % 11 = 6 -> Обчислити суму найбільших елементів в стовпцях матриці з
                                //парними номерами та найменших елементів в стовпцях матриці з
                                //непарними номерами
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість рядків матриці: ");
            int rows = scanner.nextInt();
            System.out.print("Введіть кількість стовпців матриці: ");
            int cols = scanner.nextInt();

            Matrix A = new Matrix(rows, cols);
            Matrix B = new Matrix(rows, cols);

            A.generate();
            B.generate();

            System.out.println("Матриця A:");
            A.printMatrix();

            System.out.println("Матриця B:");
            B.printMatrix();

            Matrix C = MatrixOperations.addMatrices(A, B);

            System.out.println("Результат додавання матриць A та B:");
            C.printMatrix();

            long sumEvenColumns = MatrixOperations.sumMaxInEvenColumns(C);
            long sumOddColumns = MatrixOperations.sumMinInOddColumns(C);

            System.out.println("Сума найбільших елементів в стовпцях з парними номерами: " + sumEvenColumns);
            System.out.println("Сума найменших елементів в стовпцях з непарними номерами: " + sumOddColumns);
        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
        }
    }
}