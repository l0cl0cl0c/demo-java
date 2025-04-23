import java.util.Scanner;

public class baitap9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        // Khai báo biến đếm
        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(c)) {
                soKyTuHoa++;
            } else if (Character.isDigit(c)) {
                soChuSo++;
            }
        }

        // In kết quả
        System.out.println("Số ký tự thường: " + soKyTuThuong);
        System.out.println("Số ký tự hoa: " + soKyTuHoa);
        System.out.println("Số chữ số: " + soChuSo);

        scanner.close();
    }
}
