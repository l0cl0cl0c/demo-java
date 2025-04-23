import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi (không quá 80 ký tự): ");
        String chuoi = scanner.nextLine();

        // Kiểm tra độ dài chuỗi
        if (chuoi.length() > 80) {
            System.out.println("Chuỗi vượt quá 80 ký tự!");
            return;
        }

        // Nhập ký tự cần đếm
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }

        // In kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong chuỗi là: " + dem);

        scanner.close();
    }

}
