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
public class DAL_HoaDon {

    public DAL_HoaDon() {
    }
    
    public static ResultSet ShowDetailTable(int idban){
        String sql = "select * from hoadon inner join ChiTietHoaDon on hoadon.MaHoaDon=ChiTietHoaDon.MaHoaDon where MaBan=? and TinhTrang=0";
        return sqlConnect.executeQuery(sql, idban);
    }
    public static ResultSet GetUncheckInvoiceByTableId(int id) {
        String sql = "SELECT * FROM Invoice WHERE TableID = ? AND Status = 0";
        return sqlConnect.executeQuery(sql, id);
    }

    public static void Insert(int id, int accountId, double unitprice, String mahoadon) {
        String sql = "INSERT INTO Invoice(AccountID, TableID, Status,giobatdau,unitprice,mahoadon) VALUES (?,?,0,convert(varchar(10), GETDATE(), 108),?,?)";
        sqlConnect.executeUpdate(sql, accountId, id, unitprice, mahoadon);
    }

    public static void UpdateOnNote(int id) {
        String sql = "update Invoice set gioketthuc=convert(varchar(10), GETDATE(), 108) where id=?";
        sqlConnect.executeUpdate(sql, id);
    }

    public static void UpdateUnitPrice(double unitprice) {
        String sql = "update Invoice set unitprice=? ";
        sqlConnect.executeUpdate(sql, unitprice);
    }

    public static void UpdateSttAndttPrice(int id, double totalprice) {
        String sql = "UPDATE [dbo].[Invoice] SET [InvoiceDate] = getdate(),[Status] = 1,[TotalPrice] = ? WHERE Id = ? ";
        sqlConnect.executeUpdate(sql, totalprice, id);
    }
    
    public static ResultSet GetMaxIdInvoice() {
        String sql = "SELECT MAX(ID) FROM Invoice";
        return sqlConnect.executeQuery(sql);
    }

    public static ResultSet CountSoHoaDon(String mahoadon) {
        String sql = "select count(*) from invoice where mahoadon like ?";
        return sqlConnect.executeQuery(sql, mahoadon);
    }

    public static ResultSet GetHoaDonBySo(String SoHoaDon) {
        String sql = "select * from invoice where mahoadon = ?";
        return sqlConnect.executeQuery(sql, SoHoaDon);
    }
}
