/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.LoaiBan;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAL_LoaiBan {
    public static ResultSet GetAllData() {
        String sql = "select *from LoaiBan";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet FindByName(String tuKhoa){
        String sqp = "select * from LoaiBan where TenLoaiBan like ? or MaLoaiBan = ?";
        return sqlConnect.executeQuery(sqp, tuKhoa,tuKhoa);
    }
    public static ResultSet FindByID(String tuKhoa){
        String sqp = "select TenLoaiBan from LoaiBan where MaLoaiBan = ?";
        return sqlConnect.executeQuery(sqp,tuKhoa);
    }
    //ham them loai san pham
    public static void Insert(LoaiBan lb){
        String sql = "insert into LoaiBan(TenLoaiBan,GiaTien) values(?,?)";
        sqlConnect.executeUpdate(sql, lb.getTenLoaiBan(),lb.getGiaTien());
    }
    //ham sua loai san pham
    public static void Update(LoaiBan lb){
        String sql = "update LoaiSanPham set TenLoaiBan=?,GiaTien=? where MaLoaiBan=?";
        sqlConnect.executeUpdate(sql, lb.getTenLoaiBan(),lb.getGiaTien(),lb.getMaLoaiBan());
    }
    //ham xoa loai san pham
    public static void Delete(int MaLoaiBan){
        String sql = "delete LoaiBan where MaLoaiBan=?";
        sqlConnect.executeUpdate(sql,MaLoaiBan);
    }
}
