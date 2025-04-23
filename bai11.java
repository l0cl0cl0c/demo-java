import java.util.Scanner;
import java.util.Arrays;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng (n): ");
        int n = scanner.nextInt();

        // Khai báo và nhập giá trị cho mảng
        int[] A = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // In mảng ban đầu
        System.out.println("\nMảng ban đầu:");
        inMang(A);

        // Sắp xếp mảng tăng dần
        int[] sortedA = Arrays.copyOf(A, A.length);
        Arrays.sort(sortedA);

        // In mảng đã sắp xếp
        System.out.println("\nMảng sau khi sắp xếp tăng dần:");
        inMang(sortedA);

        scanner.close();
    }

    // Phương thức in mảng
    public static void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}