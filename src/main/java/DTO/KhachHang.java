/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHang {
    int MaKhachHang;
    String TenKhachHang;
    String SoDienThoai;
    int LoaiKhachHang;
    Date NgayTao;

    public KhachHang(int MaKhachHang, String TenKhachHang, String SoDienThoai, int LoaiKhachHang, Date NgayTao) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.SoDienThoai = SoDienThoai;
        this.LoaiKhachHang = LoaiKhachHang;
        this.NgayTao = NgayTao;
    }

    public KhachHang(String TenKhachHang, String SoDienThoai, int LoaiKhachHang) {
        this.TenKhachHang = TenKhachHang;
        this.SoDienThoai = SoDienThoai;
        this.LoaiKhachHang = LoaiKhachHang;
    }
    

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public KhachHang(String TenKhachHang, String SoDienThoai, int LoaiKhachHang, Date NgayTao) {
        this.TenKhachHang = TenKhachHang;
        this.SoDienThoai = SoDienThoai;
        this.LoaiKhachHang = LoaiKhachHang;
        this.NgayTao = NgayTao;
    }

    public KhachHang() {
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public void setLoaiKhachHang(int LoaiKhachHang) {
        this.LoaiKhachHang = LoaiKhachHang;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public int getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public Date getNgayTao() {
        return NgayTao;
    }
}
