import java.util.Scanner;

public class HienThiKyTuTheoLoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        String chuThuong = "";
        String chuHoa = "";
        String chuSo = "";

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                chuThuong += c;
            } else if (Character.isUpperCase(c)) {
                chuHoa += c;
            } else if (Character.isDigit(c)) {
                chuSo += c;
            }
        }

        // In kết quả
        System.out.println("Các ký tự thường: " + chuThuong);
        System.out.println("Các ký tự hoa: " + chuHoa);
        System.out.println("Các chữ số: " + chuSo);

        scanner.close();
    }
}
