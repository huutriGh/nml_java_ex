/*
 Bài Tập 2: Chuyển Đổi Kiểu int Sang String
Mô tả: Viết chương trình nhận một số nguyên và chuyển đổi nó thành chuỗi.

Yêu cầu:

Nhận một số nguyên từ người dùng.
Chuyển đổi số nguyên đó thành chuỗi và in ra kết quả.
 */
import java.util.Scanner;

public class IntToString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        
        String numberStr = Integer.toString(number); // Chuyển đổi kiểu
        System.out.println("Chuỗi sau khi chuyển đổi: " + numberStr);
        
        scanner.close();
    }
}
