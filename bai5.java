package baitap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ho va ten: ");
        String hoTen = scanner.nextLine();

        String ten = tachTen(hoTen);
        System.out.println("Ten cua ban la: " + ten);

        scanner.close();
    }

    public static String tachTen(String hoTen) {
        hoTen = hoTen.trim();
        if (hoTen.isEmpty()) {
            return "";
        }
        int lastSpaceIndex = hoTen.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return hoTen; // Neu chi nhap 1 tu
        }
        return hoTen.substring(lastSpaceIndex + 1);
    }
}