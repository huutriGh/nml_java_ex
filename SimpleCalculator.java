
/*
Bài Tập 3: Tính Toán Đơn Giản
Mô tả: Viết chương trình Java để tính tổng, hiệu, tích và thương của hai số nguyên.

Yêu cầu:

Nhận input từ người dùng cho hai số nguyên.
In ra kết quả của các phép toán.
 */


import java.util.Scanner;

public class SimpleCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Tổng: " + (num1 + num2));
        System.out.println("Hiệu: " + (num1 - num2));
        System.out.println("Tích: " + (num1 * num2));
        System.out.println("Thương: " + (num1 / num2));
        
        scanner.close();
    }
}
