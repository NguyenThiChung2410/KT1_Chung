/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    private static QLCauThu qLCauThu = new QLCauThu();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        int chon;
        do {
            System.out.println("===THANH TOAN TIEN LUONG HANG THANG CHO CAC CAU THU===");
            System.out.println("1. Them");
            System.out.println("2. Xuat thong tin cau thu");
            System.out.println("3. Tim kiem cau thu co luong thuc lanh cao nhat");
            System.out.println("4. Sap xep cau thu theo luong tang dan");
            System.out.println("5. Tinh trung binh luong cung");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    themCauThu();
                    break;
                case 2:
                    xuatThongTinDanhSach();
                    break;
                case 3:
                    timCauThuLuongCaoNhat();
                    break;
                case 4:
                    sapXepTheoLuongThucLanh();
                    break;
                case 5:
                    tinhLuongCungTrungBinh();
                    break;
                case 0:
                    System.out.println("GoodBye.");
                    break;
                default:
                    System.out.println("Lua chon cua ban khong hop le.");
                    break;
            }
        } while (chon != 0);

    }

    private static void themCauThu() {
        String tiep = "y";
        do {
        System.out.print("Nhap so ao: ");
        int soao = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namsinh = sc.nextInt();
        System.out.print("Nhap luong cung: ");
        double luongcung = sc.nextDouble();
        System.out.print("Nhap tien thuong: ");
        double tienthuong = sc.nextDouble();
        System.out.print("Nhap tien phat: ");
        double tienphat = sc.nextDouble();
        CauThu cauThu = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
        qLCauThu.themCauThu(cauThu);
        System.out.print("Tiep tuc(Y/N): ");
        tiep = sc.nextLine();
        } while (tiep.equalsIgnoreCase("y"));
    }

    private static void xuatThongTinDanhSach() {
        qLCauThu.xuatThongTinDanhSach();
    }

    private static void timCauThuLuongCaoNhat() {
        qLCauThu.timCauThuCoLuongCaoNhat();
    }

    private static void sapXepTheoLuongThucLanh() {
        qLCauThu.timCauThuCoLuongCaoNhat();
        System.out.println("Danh sach cau thu sau khi duoc sap xep theo luong tang dan:");
        xuatThongTinDanhSach();
    }

    private static void tinhLuongCungTrungBinh() {
        qLCauThu.tinhLuongCungTrungBinh();
    }

}
