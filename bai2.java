package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;

        while (true) {
            try {
                System.out.print("Nhap a: ");
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Loi dinh dang, vui long nhap lai!");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Nhap b: ");
                b = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Loi dinh dang, vui long nhap lai!");
                scanner.nextLine();
            }
        }

        System.out.println("Tong a + b = " + (a + b));
        scanner.close();
    }
}
