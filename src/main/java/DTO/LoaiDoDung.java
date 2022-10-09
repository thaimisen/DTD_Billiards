/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class LoaiDoDung {
    int LoaiDoDung;
    String TenLoaiDoDung;
    String MoTa;

    public LoaiDoDung(int LoaiDoDung, String TenLoaiDoDung, String MoTa) {
        this.LoaiDoDung = LoaiDoDung;
        this.TenLoaiDoDung = TenLoaiDoDung;
        this.MoTa = MoTa;
    }

    public LoaiDoDung(String TenLoaiDoDung, String MoTa) {
        this.TenLoaiDoDung = TenLoaiDoDung;
        this.MoTa = MoTa;
    }

    public LoaiDoDung() {
    }

    public void setTenLoaiDoDung(String TenLoaiDoDung) {
        this.TenLoaiDoDung = TenLoaiDoDung;
    }

    public void setLoaiDoDung(int LoaiDoDung) {
        this.LoaiDoDung = LoaiDoDung;
    }

    public int getLoaiDoDung() {
        return LoaiDoDung;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTenLoaiDoDung() {
        return TenLoaiDoDung;
    }

    public String getMoTa() {
        return MoTa;
    }
}
