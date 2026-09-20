package bai4;

import java.util.Scanner;

public class bai5 {

    public static String tachTen(String hoTen) {
        hoTen = hoTen.trim();
        if (hoTen.isEmpty()) {
            return "";
        }
        
        int lastSpaceIndex = hoTen.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return hoTen;
        }
        
        return hoTen.substring(lastSpaceIndex + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        String hoTen = scanner.nextLine();

        String ten = tachTen(hoTen);
        System.out.println("Tên là: " + ten);

        scanner.close();
    }
}