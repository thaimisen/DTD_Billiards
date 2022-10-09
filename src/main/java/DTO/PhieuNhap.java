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
public class PhieuNhap {
    int MaPhieuNhap;
    Date NgayTao;
    int NguoiTao;
    Double TongTien;
    boolean TinhTrang;

    public void setMaPhieuNhap(int MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public int getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public PhieuNhap(int MaPhieuNhap, Date NgayTao, int NguoiTao, Double TongTien, boolean TinhTrang) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.NgayTao = NgayTao;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public PhieuNhap(Date NgayTao, int NguoiTao, Double TongTien, boolean TinhTrang) {
        this.NgayTao = NgayTao;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
    }

    public PhieuNhap() {
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public void setNguoiTao(int NguoiTao) {
        this.NguoiTao = NguoiTao;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public int getNguoiTao() {
        return NguoiTao;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

}
