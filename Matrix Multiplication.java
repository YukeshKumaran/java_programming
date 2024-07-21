import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
      
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            scanner.close();
            return;
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices is: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
