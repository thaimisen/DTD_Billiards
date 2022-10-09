/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Ban;
import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAL_Ban {

    public DAL_Ban() {
    }
    public static ResultSet GetAllData() {
        String sql = "select *from Ban";
        return sqlConnect.executeQuery(sql);
    }
    public static ResultSet Count() {
        String sql = "select count(*)from Ban";
        return sqlConnect.executeQuery(sql);
    }

    public static void Add(Ban tb) {
        String sql = "INSERT INTO Ban(TenBan,LoaiBan,Khuvuc) VALUES (?,?,?)";
        sqlConnect.executeUpdate(sql, tb.getTenBan(), tb.getLoaiBan(), tb.getKhuVuc());
    }

    public static void Update(Ban tb) {
        String sql = "UPDATE Ban SET TenBan=?,LoaiBan=? WHERE MaBan=?";
        sqlConnect.executeUpdate(sql, tb.getTenBan(), tb.getLoaiBan(), tb.getMaBan());
    }

    public static void Delete(int id, boolean status) {
        String sql = "Delete from Ban where MaBan=? and TinhTrang=?";
        sqlConnect.executeUpdate(sql, id, status);
    }
    public static void DeletebyName(String name, boolean status) {
        String sql = "Delete from Ban where TenBan=? and TinhTrang=?";
        sqlConnect.executeUpdate(sql, name, status);
    }

    public static ResultSet FindByMaLSP(String tukhoa) {
        String sql = "select *from Ban where LoaiBan=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }
    
    public static ResultSet FindByName(String tukhoa) {
        String sql = "select *from Ban where TenBan=?";
        return sqlConnect.executeQuery(sql, tukhoa);
    }

    public static void UpdateStatus(int tukhoa) {
        String sql = "Update Ban set TinhTrang = '1' where MaBan=?";
        sqlConnect.executeUpdate(sql, tukhoa);
    }

}
