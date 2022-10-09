/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuNhap {
    int MaPhieuNhap;
    int MaHangNhap;
    int SoLuong;
    Double GiaNhap;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int MaPhieuNhap, int MaHangNhap, int SoLuong, Double GiaNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaHangNhap = MaHangNhap;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
    }

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public void setMaHangNhap(int MaHangNhap) {
        this.MaHangNhap = MaHangNhap;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public int getMaHangNhap() {
        return MaHangNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }
}
