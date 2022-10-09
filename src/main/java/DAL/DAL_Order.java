/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import EXTENDED.sqlConnect;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAL_Order {

    public DAL_Order() {
    }
    public static ResultSet getDataByinvoiceId(int invoiceId){
        String sql = "SELECT * FROM ChiTietHoaDon WHERE MaHoaDon = ?";
        return sqlConnect.executeQuery(sql, invoiceId);
    }
    
    public static void Insert(int drinkId, int count,int invoiceId,Double gia){
        String sql="INSERT INTO ChiTietHoaDon(MaDoDung, SoLuong, MaHoaDon,GiaBan) VALUES (?,?,?,?)";
        sqlConnect.executeUpdate(sql, drinkId,count,invoiceId,gia);
    }
    public static void Delete(int ordersid){
        String sql="delete ChiTietHoaDon where id=?";
        sqlConnect.executeUpdate(sql,ordersid);
    }
}
