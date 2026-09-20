package bai4;

import java.util.Scanner;

public class Dayso {
    int[] ds = new int[100];
    int n;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            ds[i] = sc.nextInt();
        }
    }

    public void hienThi() {
        for (int i = 0; i < n; i++) {
            System.out.print(ds[i] + " ");
        }
        System.out.println();
    }

    public int demX(int x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i] == x) dem++;
        }
        return dem;
    }

    public void sapXep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i] > ds[j]) {
                    int temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }

    public void chenX(int x) {
        int i = n - 1;
        while (i >= 0 && ds[i] > x) {
            ds[i + 1] = ds[i];
            i--;
        }
        ds[i + 1] = x;
        n++;
    }

    public void xoaNhoHonX(int x) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i] >= x) {
                ds[k] = ds[i];
                k++;
            }
        }
        n = k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaySo d = new DaySo();

        d.nhap();

        System.out.print("Nhap x: ");
        int x = sc.nextInt();

        System.out.println("So lan x xuat hien: " + d.demX(x));

        d.sapXep();
        System.out.print("Sau khi sap xep: ");
        d.hienThi();

        d.chenX(x);
        System.out.print("Sau khi chen x: ");
        d.hienThi();

        d.xoaNhoHonX(x);
        System.out.print("Sau khi xoa phan tu < x: ");
        d.hienThi();
    }
}