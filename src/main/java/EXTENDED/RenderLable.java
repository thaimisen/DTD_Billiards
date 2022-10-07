/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author dell 7559
 */
public class RenderLable extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("D:\\DuAnMau\\DA_Billiards\\src\\main\\java\\IMG\\pessii.png")
                    .getImage().getScaledInstance(
                            60,
                            60,
                            Image.SCALE_DEFAULT));
        return new JLabel(imageIcon);
    }

}
