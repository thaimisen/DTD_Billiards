/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import EXTENDED.Render;
import EXTENDED.RenderLable;
import GUI.ChiTietBan;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell 7559
 */
public class BLLOrder {

    // load table chi tiết sản phẩm
    public static void loadButton(JTable table) {
        Icon addIcon = new ImageIcon("D:\\DuAnMau\\DA_Billiards\\src\\main\\java\\IMG\\icons8-plus-16.png");
        Icon truIcon = new ImageIcon("D:\\DuAnMau\\DA_Billiards\\src\\main\\java\\IMG\\icons8-minus-16.png");
        Icon xoaIcon = new ImageIcon("D:\\DuAnMau\\DA_Billiards\\src\\main\\java\\IMG\\icons8-trash-bin-16.png");

        table.setDefaultRenderer(Object.class, new Render());

        JButton btnThem = new JButton();
        JButton btnTru = new JButton();
        JButton btnXoa = new JButton();

        btnThem.setIcon(addIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
            
        btnTru.setOpaque(true);
        btnTru.setIcon(truIcon);
        btnTru.setBackground(Color.white);
        btnTru.setFocusPainted(false);
        btnTru.setFocusable(false);
        btnTru.setBorder(null);
        btnTru.setBorderPainted(false);

        btnXoa.setOpaque(true);
        btnXoa.setIcon(xoaIcon);
        btnXoa.setBackground(Color.white);
        btnXoa.setFocusPainted(false);
        btnXoa.setFocusable(false);
        btnXoa.setBorder(null);
        btnXoa.setBorderPainted(false);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{
            "Ten", "", "So luong", "", "Gia", ""
        });
        model.addRow(new Object[]{
            "pepsi", btnTru, "1", btnThem, "10000", btnXoa
        });
        table.setModel(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(10);
        table.getColumnModel().getColumn(2).setPreferredWidth(60);
        table.getColumnModel().getColumn(3).setPreferredWidth(10);
        table.getColumnModel().getColumn(4).setPreferredWidth(80);
        table.getColumnModel().getColumn(5).setPreferredWidth(30);

//
        table.setRowHeight(60);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

        table.setShowGrid(false);

    }

    // Them so luong san pham
    public static void clickBtnThem(JTable table, int indexRow, int valueOld) {
        System.out.println("+");
        int valueNew = valueOld + 1;
        table.setValueAt(valueNew, indexRow, 2);

    }

    // tru so luong san pham
    public static void clickBtntru(JTable table, int indexRow, int valueOld) {
        System.out.println("-");
        int valueNew = valueOld - 1;
        table.setValueAt(valueNew, indexRow, 2);
    }

    // xoá row table 
    public static void xoaRow(JTable jTable, int indexRow) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.removeRow(indexRow);
    }

    public static String tenban = "";

    // load bàn
    public static void loadBan(JPanel jPanel, JScrollPane jScrollPane) {
        GridLayout gridLayout = new GridLayout(5, 5);
//        jScrollPane.add(jPanel);
        ImageIcon icon = new ImageIcon("D:\\Kì 4\\java\\DA_Billiards\\src\\main\\java\\IMG\\icons8-pool-table-96.png");
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton();
            button.setFocusPainted(false);
            button.setBackground(new Color(63, 213, 192));
            button.setBorderPainted(false);
            button.setText("Bàn " + (i + 1));
            button.setIcon(icon);
            button.setFont(new Font("Segoe UI", Font.BOLD, 14));
            button.setForeground(Color.white);
            String ten = button.getText();

            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {
                    int countClick = e.getClickCount();
                    if (countClick == 2) {
                        tenban = ten;
                        ChiTietBan ban = new ChiTietBan(null, true);
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

            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);

            jPanel.add(button);
            jPanel.setLayout(gridLayout);
            gridLayout.setVgap(5);
            gridLayout.setHgap(5);

        }
    }

    public static void showdeltailBan(JDialog dialog, String tenBan1) {
        dialog.setVisible(true);
    }

    // load table sản phẩm
    public static void loadTableSanPham(JTable table) {

        JButton btnThem = new JButton();
        ImageIcon imageIcon = new ImageIcon("D:\\DuAnMau\\DA_Billiards\\src\\main\\java\\IMG\\icons8-plus-16.png");

        btnThem.setIcon(imageIcon);
        btnThem.setOpaque(true);
        btnThem.setBackground(Color.white);
        btnThem.setFocusPainted(false);
        btnThem.setFocusable(false);
        btnThem.setBorder(null);
        btnThem.setBorderPainted(false);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(new Object[]{
            "Ten", "Gia", "", ""
        });
        model.addRow(new Object[]{
            "pepsi", "10000", "", btnThem
        });
        table.setModel(model);
        table.getColumnModel().getColumn(2).setCellRenderer(new RenderLable());
        table.getColumnModel().getColumn(3).setCellRenderer(new Render());

        table.setRowHeight(60);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setHeaderRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setHeaderRenderer(centerRenderer);

        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        table.setShowGrid(false);
    }

    public static void loadChiTietBan(JTable table, JLabel tenBan, JLabel gioVao, ArrayList arr) {
        tenBan.setText(tenban);
    }

    // Mở bàn
    public static void moBan(String tenBan) {

    }

    public static void setButtonOnClick(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("oke");
            };
        });
    }
}
