/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.KhachHang;
import EXTENDED.Caution;
import EXTENDED.MyComboBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class BLLKhachHang {

    public static ArrayList<KhachHang> listTables() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_KhachHang.GetAllData();
        ArrayList<KhachHang> arr = new ArrayList();
        try {
            while (rs.next()) {
                KhachHang table = new KhachHang();
                table.setMaKhachHang(rs.getByte("MaKhachHang"));
                table.setTenKhachHang(rs.getString("TenKhachHang"));
                table.setSoDienThoai(rs.getString("SoDienThoai"));
                table.setLoaiKhachHang(rs.getByte("LoaiKhachHang"));
                table.setNgayTao(rs.getDate("NgayTao"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void DoVaoTable(ArrayList<KhachHang> arr, JTable tbl) {
        String[] headerTable = {"STT", "Tên", "Số Điện Thoại", "Loại Khách Hàng"};
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnIdentifiers(headerTable);
        int i = 1;
        for (KhachHang table : arr) {
            Object obj[] = new Object[4];
            obj[0] = i++;
            obj[1] = table.getTenKhachHang();
            obj[2] = table.getSoDienThoai();
            obj[3] = BLLKhachHang.loadTenLoaiKH(table.getLoaiKhachHang()+"");
            tbModel.addRow(obj);
        }
    }

//    public static void LoadLoaiKH(JComboBox cb, String TenLoai) {
//        for (int i = 0; i < cb.getItemCount(); i++) {
//            MyComboBox myCb = (MyComboBox) cb.getItemAt(i);
//            if (myCb.toString().equals(TenLoai)) {
//                cb.setSelectedIndex(i);
//            }
//        }
//    }
    public static String loadTenLoaiKH(String MaLoaiKH){
        ResultSet rs = DAL.DAL_KhachHang.FindByID(MaLoaiKH);
        try {
            if(rs.next()){
                return rs.getString("TenLoaiKhachHang");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static boolean check(String tukhoa) {
        ArrayList<KhachHang> arrlist = listTables();
        for (KhachHang table : arrlist) {
            if (table.getSoDienThoai().equalsIgnoreCase(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "SDT đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemSanpham(KhachHang table) {
        if (check(table.getSoDienThoai())) {
            DAL.DAL_KhachHang.Add(table);
            Caution.ThongBaoDonGian("Thông báo", "Thành công!");
        }
    }
}
