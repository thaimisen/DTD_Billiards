/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import EXTENDED.sqlConnect;
import GUI.QLBan.pnlQLBan;
import GUI.QLKhachHang.pnlKhachHang;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRootPane;

/**
 *
 * @author ADMIN
 */
public class HomeScreen extends javax.swing.JFrame {

    public HomeScreen() {
        sqlConnect.openConnection();
        setUndecorated(true);
        initComponents();
        pnlDMcon.setVisible(false);
//        this.setExtendedState(HomeScreen.MAXIMIZED_BOTH);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        getContentPane().setBackground(Color.white);

        setSize(1520, 760);
        setLocationRelativeTo(null);

    }

    public void backgroundColor() {
        jButton1.setBackground(null);
        jButton2.setBackground(null);
        jButton3.setBackground(null);
        jButton4.setBackground(null);
        jButton5.setBackground(null);
        jButton6.setBackground(null);
        jButton7.setBackground(null);
        btnlogout.setBackground(null);
    }

    public void backgroundColorConDM() {
        jButton8.setBackground(null);
        jButton9.setBackground(null);
        jButton10.setBackground(null);

    }

    public void changecolormoved(JButton btn) {
        if (!btn.getBackground().equals(new Color(63, 213, 192))) {
            btn.setBackground(new Color(1, 177, 189));
        }
    }

    public void changecolorexit(JButton btn) {
        if (!btn.getBackground().equals(new Color(63, 213, 192))) {
            btn.setBackground(color);
        }
    }

    public void changecolorexitcon(JButton btn) {
        if (!btn.getBackground().equals(new Color(114, 255, 255))) {
            btn.setBackground(new Color(240, 240, 240));
        }
    }

    public void changecolormovedcon(JButton btn) {
        if (!btn.getBackground().equals(new Color(114, 255, 255))) {
            btn.setBackground(new Color(11, 255, 255));
        }
    }

    public void andanhmuccon() {
        if (flag) {
            flag = false;
            pnlDMcon.setVisible(false);
            backgroundColorConDM();
        }
    }

    Color color = new Color(204, 204, 204);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbminimize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbexit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlmenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnlDMcon = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbactor = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        pnltongquan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        lbminimize.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lbminimize.setForeground(new java.awt.Color(255, 0, 51));
        lbminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-subtract-16.png"))); // NOI18N
        lbminimize.setBorderPainted(false);
        lbminimize.setFocusPainted(false);
        lbminimize.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbminimize.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/billiard.png"))); // NOI18N
        jLabel1.setToolTipText("");

        lbexit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbexit.setForeground(new java.awt.Color(255, 51, 51));
        lbexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbexit.setText("X");
        lbexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbexit.setOpaque(true);
        lbexit.setPreferredSize(new java.awt.Dimension(4, 16));
        lbexit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbexitMouseMoved(evt);
            }
        });
        lbexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbexitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbexit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbminimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        pnlmenu.setBackground(new java.awt.Color(204, 204, 204));
        pnlmenu.setLayout(new java.awt.GridLayout(8, 0));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/overview.png"))); // NOI18N
        jButton1.setText("   TỔNG QUAN");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlmenu.add(jButton1);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/order.png"))); // NOI18N
        jButton3.setText("   ORDER");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        pnlmenu.add(jButton3);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/table.png"))); // NOI18N
        jButton2.setText("   BÀN");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        pnlmenu.add(jButton2);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/user.png"))); // NOI18N
        jButton4.setText("   KHÁCH HÀNG");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        pnlmenu.add(jButton4);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-brochure-48.png"))); // NOI18N
        jButton6.setText("   THU");
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton6MouseMoved(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        pnlmenu.add(jButton6);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-cashbook-48.png"))); // NOI18N
        jButton7.setText("   CHI");
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton7MouseMoved(evt);
            }
        });
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        pnlmenu.add(jButton7);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/category.png"))); // NOI18N
        jButton5.setText("   DANH MỤC");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        pnlmenu.add(jButton5);

        pnlDMcon.setLayout(new java.awt.GridLayout(3, 0, 0, 1));

        jButton8.setText("jButton8");
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton8MouseMoved(evt);
            }
        });
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        pnlDMcon.add(jButton8);

        jButton9.setText("jButton9");
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton9MouseMoved(evt);
            }
        });
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        pnlDMcon.add(jButton9);

        jButton10.setText("jButton10");
        jButton10.setBorderPainted(false);
        jButton10.setFocusPainted(false);
        jButton10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton10MouseMoved(evt);
            }
        });
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        pnlDMcon.add(jButton10);

        pnlmenu.add(pnlDMcon);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        lbactor.setBackground(new java.awt.Color(204, 204, 204));
        lbactor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbactor.setForeground(new java.awt.Color(51, 51, 51));
        lbactor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbactor.setText("ADMINISTRATOR");
        lbactor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(lbactor);

        btnlogout.setBackground(new java.awt.Color(204, 204, 204));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 51, 51));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-logout-48.png"))); // NOI18N
        btnlogout.setText("ĐĂNG XUẤT");
        btnlogout.setBorderPainted(false);
        btnlogout.setFocusPainted(false);
        btnlogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlogout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnlogoutMouseMoved(evt);
            }
        });
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogoutMouseExited(evt);
            }
        });
        jPanel3.add(btnlogout);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pnltongquan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnltongquan.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnltongquan, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnltongquan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        backgroundColor();
        andanhmuccon();
        jButton1.setBackground(new Color(63, 213, 192));
        Tongquan tongquan = new Tongquan();
        pnltongquan.add(tongquan);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        backgroundColor();
        andanhmuccon();
        jButton2.setBackground(new Color(63, 213, 192));
        pnltongquan.removeAll();
        pnlQLBan pnlban = new pnlQLBan();
        pnltongquan.add(pnlban);
        pnltongquan.validate();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        backgroundColor();
        andanhmuccon();
        jButton3.setBackground(new Color(63, 213, 192));
        pnltongquan.removeAll();
        Order order = new Order();
        pnltongquan.add(order);
        pnltongquan.validate();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        backgroundColor();
        andanhmuccon();
        jButton4.setBackground(new Color(63, 213, 192));
        pnltongquan.removeAll();
        pnlKhachHang khachhang = new pnlKhachHang();
        pnltongquan.add(khachhang);
        pnltongquan.validate();
    }//GEN-LAST:event_jButton4MouseClicked
    boolean flag = false;
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if (!flag) {
            pnlDMcon.setVisible(true);
            flag = true;
        } else {
            flag = false;
            pnlDMcon.setVisible(false);
            backgroundColorConDM();
        }
        backgroundColor();
        jButton5.setBackground(new Color(63, 213, 192));

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        backgroundColor();
        andanhmuccon();
        jButton6.setBackground(new Color(63, 213, 192));
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        backgroundColor();
        andanhmuccon();
        jButton7.setBackground(new Color(63, 213, 192));
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pnltongquan.removeAll();
        pnltongquan.add(new Tongquan()).setVisible(true);
        pnltongquan.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
        backgroundColor();
        btnlogout.setBackground(new Color(63, 213, 192));
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        // TODO add your handling code here:
        changecolormoved(jButton3);
    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        if (!jButton3.getBackground().equals(new Color(63, 213, 192))) {
            jButton3.setBackground(color);
        }
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        changecolormoved(jButton1);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        changecolorexit(jButton1);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        // TODO add your handling code here:
        changecolormoved(jButton2);
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        changecolorexit(jButton2);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
        changecolormoved(jButton4);
    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        changecolorexit(jButton4);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved
        // TODO add your handling code here:
        changecolormoved(jButton5);
    }//GEN-LAST:event_jButton5MouseMoved

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        changecolorexit(jButton5);

    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseMoved

        changecolormoved(jButton6);
    }//GEN-LAST:event_jButton6MouseMoved

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited

        changecolorexit(jButton6);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseMoved

        changecolormoved(jButton7);
    }//GEN-LAST:event_jButton7MouseMoved

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited

        changecolorexit(jButton7);
    }//GEN-LAST:event_jButton7MouseExited

    private void btnlogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseMoved
        // TODO add your handling code here:
        if (!btnlogout.getBackground().equals(new Color(63, 213, 192))) {
            btnlogout.setBackground(new Color(1, 177, 189));
        }
    }//GEN-LAST:event_btnlogoutMouseMoved

    private void btnlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseExited
        // TODO add your handling code here:
        if (!btnlogout.getBackground().equals(new Color(63, 213, 192))) {
            btnlogout.setBackground(color);
        }
    }//GEN-LAST:event_btnlogoutMouseExited

    private void lbexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseMoved
        // TODO add your handling code here:
        lbexit.setForeground(Color.white);
        lbexit.setBackground(Color.RED);
    }//GEN-LAST:event_lbexitMouseMoved

    private void lbexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseExited
        // TODO add your handling code here:
        lbexit.setForeground(new Color(255, 51, 51));
        lbexit.setBackground(null);
    }//GEN-LAST:event_lbexitMouseExited

    private void lbexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbexitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbexitMouseClicked

    private void jButton8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseMoved
        changecolormovedcon(jButton8);
    }//GEN-LAST:event_jButton8MouseMoved

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        changecolorexitcon(jButton8);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseMoved
        changecolormovedcon(jButton9);
    }//GEN-LAST:event_jButton9MouseMoved

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        changecolorexitcon(jButton9);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseMoved
        changecolormovedcon(jButton10);
    }//GEN-LAST:event_jButton10MouseMoved

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        changecolorexitcon(jButton10);
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        backgroundColorConDM();
        jButton8.setBackground(new Color(114, 255, 255));
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        backgroundColorConDM();
        jButton9.setBackground(new Color(114, 255, 255));
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        backgroundColorConDM();
        jButton10.setBackground(new Color(114, 255, 255));
    }//GEN-LAST:event_jButton10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbactor;
    private javax.swing.JLabel lbexit;
    private javax.swing.JButton lbminimize;
    private javax.swing.JPanel pnlDMcon;
    private javax.swing.JPanel pnlmenu;
    public javax.swing.JPanel pnltongquan;
    // End of variables declaration//GEN-END:variables
}
