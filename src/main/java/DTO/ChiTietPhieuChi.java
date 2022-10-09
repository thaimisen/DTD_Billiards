/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuChi {
    int MaPhieuChi;
    String NoiDungChi;
    Double SoTien;

    public ChiTietPhieuChi(int MaPhieuChi, String NoiDungChi, Double SoTien) {
        this.MaPhieuChi = MaPhieuChi;
        this.NoiDungChi = NoiDungChi;
        this.SoTien = SoTien;
    }

    public ChiTietPhieuChi() {
    }

    public void setMaPhieuChi(int MaPhieuChi) {
        this.MaPhieuChi = MaPhieuChi;
    }

    public void setNoiDungChi(String NoiDungChi) {
        this.NoiDungChi = NoiDungChi;
    }

    public void setSoTien(Double SoTien) {
        this.SoTien = SoTien;
    }

    public int getMaPhieuChi() {
        return MaPhieuChi;
    }

    public String getNoiDungChi() {
        return NoiDungChi;
    }

    public Double getSoTien() {
        return SoTien;
    }
}
