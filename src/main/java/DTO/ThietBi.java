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
public class ThietBi {
    int MaThietBi;
    String TenThietBi;
    Double GiaNhap;
    int SoLuong;
    Date NgayTao;

    public void setMaThietBi(int MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public int getMaThietBi() {
        return MaThietBi;
    }

    public ThietBi(int MaThietBi, String TenThietBi, Double GiaNhap, int SoLuong, Date NgayTao) {
        this.MaThietBi = MaThietBi;
        this.TenThietBi = TenThietBi;
        this.GiaNhap = GiaNhap;
        this.SoLuong = SoLuong;
        this.NgayTao = NgayTao;
    }

    public ThietBi(String TenThietBi, Double GiaNhap, int SoLuong, Date NgayTao) {
        this.TenThietBi = TenThietBi;
        this.GiaNhap = GiaNhap;
        this.SoLuong = SoLuong;
        this.NgayTao = NgayTao;
    }

    public ThietBi() {
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public Date getNgayTao() {
        return NgayTao;
    }
}
