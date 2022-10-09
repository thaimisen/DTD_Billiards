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
public class PhieuChi {
    int MaPhieuChi;
    int NguoiTao;
    Double TongTien;
    Date NgayTao;
    boolean TinhTrang;

    public PhieuChi(int NguoiTao, Double TongTien, Date NgayTao, boolean TinhTrang) {
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
    }

    public PhieuChi(int MaPhieuChi, int NguoiTao, Double TongTien, Date NgayTao, boolean TinhTrang) {
        this.MaPhieuChi = MaPhieuChi;
        this.NguoiTao = NguoiTao;
        this.TongTien = TongTien;
        this.NgayTao = NgayTao;
        this.TinhTrang = TinhTrang;
    }

    public PhieuChi() {
    }

    public void setMaPhieuChi(int MaPhieuChi) {
        this.MaPhieuChi = MaPhieuChi;
    }

    public void setNguoiTao(int NguoiTao) {
        this.NguoiTao = NguoiTao;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public int getMaPhieuChi() {
        return MaPhieuChi;
    }

    public int getNguoiTao() {
        return NguoiTao;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }
}
