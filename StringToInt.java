import java.util.Scanner;

public class StringToInt {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số (dưới dạng chuỗi): ");
        String numberStr = scanner.nextLine();
        
        int number = Integer.parseInt(numberStr); // Chuyển đổi kiểu
        System.out.println("Số nguyên sau khi chuyển đổi: " + number);
        
        scanner.close();
    }
}
