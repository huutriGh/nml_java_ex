/*
 Bài Tập 5: Chuyển Đổi Đơn Vị Nhiệt Độ
Mô tả: Viết chương trình chuyển đổi từ độ Celsius sang độ Fahrenheit.

Yêu cầu:

Nhận nhiệt độ Celsius từ người dùng.
Tính và in ra nhiệt độ tương ứng trong độ Fahrenheit.
 */

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập nhiệt độ Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Nhiệt độ Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
