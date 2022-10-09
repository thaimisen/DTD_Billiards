/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.Ban;
import EXTENDED.Caution;
import GUI.QLBan.jdlChiTietBan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class BLLBan {

    public static ArrayList<Ban> listTables() {
        //lay tat ca du lieu loai san pham tu sql
        ResultSet rs = DAL.DAL_Ban.GetAllData();
        ArrayList<Ban> arr = new ArrayList();
        try {
            while (rs.next()) {
                Ban table = new Ban();
                table.setMaBan(rs.getByte("MaBan"));
                table.setTenBan(rs.getString("TenBan"));
                table.setLoaiBan(rs.getInt("LoaiBan"));
                table.setKhuVuc(rs.getInt("KhuVuc"));
                table.setTinhTrangVeSinh(rs.getBoolean("TinhTrangVeSinh"));
                table.setTinhTrang(rs.getString("TinhTrang"));
                arr.add(table);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAL.DAL_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void DoVaoPanel(ArrayList<Ban> arr, JPanel pnl) {
        for (Ban table : arr) {
            JButton button = new JButton();
             button.setFocusPainted(false);
            button.setBackground(new Color(63, 213, 192));
            button.setBorderPainted(false);
            button.setHorizontalAlignment(JButton.CENTER);
            button.setVerticalAlignment(JButton.CENTER);
             button.setText(table.getTenBan());
             button.setPreferredSize(new Dimension(252,100));
             button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
//                    int countClick = e.getClickCount();
                    if (evt.getButton()==MouseEvent.BUTTON1) {
                        jdlChiTietBan ban = new jdlChiTietBan(null, true);
                        ban.lbtxtName.setText(button.getText());
                        ban.setVisible(true);
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
            pnl.add(button);
        }
    }

//    public static void DoVaoTable(ArrayList<Ban> arr, JTable tbl) {
//        String[] headerTable = {"ID", "Name", "Loại Bàn", "Status"};
//        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
//        tbModel.setRowCount(0);
//        tbModel.setColumnIdentifiers(headerTable);
//        int i = 1;
//        for (Tables table : arr) {
//            Object obj[] = new Object[4];
//            obj[0] = table.getTableId();
//            obj[1] = table.getTableName();
//            obj[2] = BLL_LoaiBan.loadTenLB(table.getMaLoaiBan() + "");
//            obj[3] = table.getStatus() ? "Đã đặt" : "Còn trống";
//            tbModel.addRow(obj);
//        }
//    }
//
//    public static void DoVaoTableOrders(ArrayList<Tables> arr, JTable tbl) {
//        String[] headerTable = {"Name", "Loại Bàn", "Status", "Note"};
//        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
//        tbModel.setRowCount(0);
//        tbModel.setColumnIdentifiers(headerTable);
//        int i = 1;
//        for (Tables table : arr) {
//            Object obj[] = new Object[4];
//            obj[0] = table.getTableName();
//            obj[1] = BLL_LoaiBan.loadTenLB(table.getMaLoaiBan() + "");
//            obj[2] = table.getStatus() ? "Đã đặt" : "Còn trống";
//            obj[3] = table.getGhichu();
//            tbModel.addRow(obj);
//        }
//    }
    public static boolean check(String tukhoa) {
        ArrayList<Ban> arrlist = listTables();
        for (Ban table : arrlist) {
            if (table.getTenBan().equalsIgnoreCase(tukhoa)) {
                Caution.ThongBaoDonGian("Lỗi", "Bàn đã tồn tại!");
                return false;
            }
        }
        return true;
    }

    public static void ThemSanpham(Ban table) {
        if (check(table.getTenBan())) {
            DAL.DAL_Ban.Add(table);
            Caution.ThongBaoDonGian("Thông báo", "Thành công!");
        }
    }

    public static void XoaSanpham(int ID, boolean status) {
        if (Caution.ThongBaoYesNo()) {
            try {
                DAL.DAL_Ban.Delete(ID, status);
                Caution.ThongBaoThanhCong("Thông báo", "Thành công!");
            } catch (Exception e) {
                Caution.ThongBaoCoIcon("Cảnh báo", "Không thể xóa bàn đang được sử dụng", 0);
            }

        }
    }

    public static void XoaSanphambyName(String name, boolean status) {
        DAL.DAL_Ban.DeletebyName(name, status);

    }

    public static void SuaSanpham(Ban table) {
        if (Caution.ThongBaoYesNo()) {
            DAL.DAL_Ban.Update(table);
            Caution.ThongBaoThanhCong("Thông báo", "Thành công!");
        }
    }

    public static void SuaStatus(int tukhoa) {
        DAL.DAL_Ban.UpdateStatus(tukhoa);
    }

    public static int DemBan() {
        ResultSet rs = DAL.DAL_Ban.GetAllData();
        int i = 0;
        try {
            while (rs.next()) {
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLLBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
