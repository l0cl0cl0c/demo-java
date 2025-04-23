import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        // Khai báo và nhập giá trị cho ma trận
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // In ma trận vừa nhập
        System.out.println("\nMa trận vừa nhập:");
        inMaTran(matrix);

        // Tìm phần tử lớn nhất trong ma trận
        int max = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("\nPhần tử lớn nhất trong ma trận là: " + max);
        System.out.println("Vị trí: hàng " + maxRow + ", cột " + maxCol);

        scanner.close();
    }

    // Phương thức in ma trận
    public static void inMaTran(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}