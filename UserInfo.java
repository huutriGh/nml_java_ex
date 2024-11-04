/*
Bài Tập 2: Input và Output
Mô tả: Viết chương trình Java để nhận thông tin từ người dùng, bao gồm tên và tuổi.

Yêu cầu:

Sử dụng Scanner để nhận input.
In ra thông tin đã nhập.
 */


import java.util.Scanner;

public class UserInfo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        
        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi của bạn là: " + age);
        
        scanner.close();
    }
}
