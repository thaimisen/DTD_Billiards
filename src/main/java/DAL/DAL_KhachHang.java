/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.KhachHang;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAL_KhachHang {

    public DAL_KhachHang() {
    }
    public static ResultSet GetAllData() {
        String sql = "select *from KhachHang";
        return sqlConnect.executeQuery(sql);
    }

    public static void Add(KhachHang tb) {
        String sql = "INSERT INTO KhachHang(TenKhachHang,SoDienThoai,LoaiKhachHang,NgayTao) VALUES (?,?,?,getdate())";
        sqlConnect.executeUpdate(sql,tb.getTenKhachHang(), tb.getSoDienThoai(),tb.getLoaiKhachHang());
    }

    public static void Update(KhachHang tb) {
        String sql = "UPDATE KhachHang SET TenKhachHang=?,SoDienThoai=?,LoaiKhachHang=? WHERE MaKhachHang=?";
        sqlConnect.executeUpdate(sql, tb.getTenKhachHang(), tb.getSoDienThoai(), tb.getLoaiKhachHang(),tb.getMaKhachHang());
    }

    public static void Delete(int id) {
        String sql = "Delete from KhachHang where MaKhachHang=?";
        sqlConnect.executeUpdate(sql, id);
    }
    
    public static ResultSet FindByID(String tuKhoa){
        String sqp = "select TenLoaiKhachHang from LoaiKhachHang where MaLoaiKhachHang = ?";
        return sqlConnect.executeQuery(sqp,tuKhoa);
    }
}
