/*
Bài Tập 5: Chuyển Đổi Kiểu String Sang double
Mô tả: Viết chương trình nhận một chuỗi số thực và chuyển đổi nó thành số thực.

Yêu cầu:

Nhận một chuỗi từ người dùng.
Chuyển đổi chuỗi đó thành số thực và in ra kết quả.
 */

import java.util.Scanner;

public class StringToDouble {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số thực (dưới dạng chuỗi): ");
        String numberStr = scanner.nextLine();
        
        double doubleValue = Double.parseDouble(numberStr); // Chuyển đổi kiểu
        System.out.println("Số thực sau khi chuyển đổi: " + doubleValue);
        
        scanner.close();
    }
    
}
