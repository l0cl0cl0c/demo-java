import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số từ người dùng
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        
        // Tính toán các phép toán
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;  // Phép chia nguyên
        int remainder = num1 % num2; // Phép chia lấy dư
        
        // In kết quả
        System.out.println("Tổng của hai số: " + sum);
        System.out.println("Hiệu của hai số: " + difference);
        System.out.println("Tích của hai số: " + product);
        System.out.println("Thương của hai số (chia nguyên): " + quotient);
        System.out.println("Chia lấy dư của hai số: " + remainder);
        
        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
