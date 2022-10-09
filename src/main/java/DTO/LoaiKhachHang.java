/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class LoaiKhachHang {
    int MaLoaiKhachHang;
    String TenLoaiKhachHang;

    public LoaiKhachHang(int MaLoaiKhachHang, String TenLoaiKhachHang) {
        this.MaLoaiKhachHang = MaLoaiKhachHang;
        this.TenLoaiKhachHang = TenLoaiKhachHang;
    }

    public LoaiKhachHang(String TenLoaiKhachHang) {
        this.TenLoaiKhachHang = TenLoaiKhachHang;
    }

    public LoaiKhachHang() {
    }

    public void setTenLoaiKhachHang(String TenLoaiKhachHang) {
        this.TenLoaiKhachHang = TenLoaiKhachHang;
    }

    public String getTenLoaiKhachHang() {
        return TenLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(int MaLoaiKhachHang) {
        this.MaLoaiKhachHang = MaLoaiKhachHang;
    }

    public int getMaLoaiKhachHang() {
        return MaLoaiKhachHang;
    }
}
