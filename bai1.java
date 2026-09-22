package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.print("Nhap vao mot ky tu: ");
            // Đọc một chuỗi từ bàn phím và lấy ký tự đầu tiên [0]
            ch = scanner.next().charAt(0);

            System.out.println("Ky tu vua nhap: " + ch);

        } while (ch != 'q'); // Tiếp tục lặp nếu ký tự nhập vào khác 'q'

        System.out.println("Chuong trinh ket thuc.");
        scanner.close();
    }
}
