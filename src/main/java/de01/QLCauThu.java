/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.ArrayList;


import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {

    private ArrayList<CauThu> ds;

    
    public QLCauThu() {
        ds = new ArrayList<>();
        
        ds.add(new CauThu(1, "Nguyen Thanh Binh", 1992, 3000, 5000, 300));
        ds.add(new CauThu(2, "Tran Nhung", 1995, 6000, 3000, 300));
        ds.add(new CauThu(3, "Pham Dinh Khang", 1998, 5000, 1500, 400));
        ds.add(new CauThu(4, "Hoang Thi Tu", 1999, 5000, 1000, 200));
        ds.add(new CauThu(5, "Nguyen Hong Nhung", 11999, 3000, 3000, 100));
        ds.add(new CauThu(6, "Hoang Thi Mai", 2000, 3000, 1000, 200));
        ds.add(new CauThu(7, "Mai Quang Vu", 2001, 5000, 1500, 150));
        ds.add(new CauThu(8, "Ngo Dinh Manh", 2002, 4500, 1000, 250));
        ds.add(new CauThu(9, "Dao Thi Y", 2003, 4000, 1800, 400));
        ds.add(new CauThu(10, "Nguyen Thanh Cuong", 1992, 4100, 2000, 500));
        ds.add(new CauThu(11, "Hoang Thanh Dieu", 1994, 5500, 1500, 300));
    }
    public void themCauThu(CauThu CT) {
        for (CauThu ct : ds) {
            if (ct.getSoao() == CT.getSoao()) {
                System.out.println("So ao da co.");
                return;
            }
        }
        ds.add(CT);
    }
    public void xuatThongTinDanhSach() {
        double tongLuong = 0;
        for (CauThu ct : ds) {
            System.out.println(ct);
            tongLuong += ct.luongThucLanh();
        }
        System.out.println("Tong tien luong phai tra la: " + tongLuong);
    }
    public void timCauThuCoLuongCaoNhat() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach cau thu trong.");
            return;
        }
        double maxLuong = Double.MIN_VALUE;
        for (CauThu ct : ds) {
            if (ct.luongThucLanh() > maxLuong) {
                maxLuong = ct.luongThucLanh();
            }
        }
        for (CauThu ct : ds) {
            if (ct.luongThucLanh() == maxLuong) {
                System.out.println(ct);
            }
        }
    }
    public void sapXepLuongThucLanhTang() {
        ds.sort(Comparator.comparingDouble(CauThu::luongThucLanh));
    }
    public void tinhLuongCungTrungBinh() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach cau thu trong.");
            return;
        }
        double tongLuongCung = 0;
        for (CauThu ct : ds) {
            tongLuongCung += ct.getLuongcung();
        }
        double tBLuongCung = tongLuongCung / ds.size();
        System.out.println("Luong cung trung binh la: " + tBLuongCung);
    }
}
