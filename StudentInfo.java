/*
Bài Tập 1: Biến và Kiểu Dữ Liệu
Mô tả: Viết chương trình Java khai báo các biến để lưu trữ thông tin về một sinh viên, bao gồm:

Họ và tên (String)
Tuổi (int)
Điểm trung bình (double)
Yêu cầu:

In ra thông tin sinh viên đã nhập.
 */


public class StudentInfo {
    public static void main(String[] args) {
        String name = "Nguyen Van A";
        int age = 20;
        double gpa = 8.5;

        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm trung bình: " + gpa);
    }
}