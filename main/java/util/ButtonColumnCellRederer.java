/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Pablo Bernardes
 */
public class ButtonColumnCellRederer extends DefaultTableCellRenderer {
    
    private String buttonType;
    
    public ButtonColumnCellRederer(String buttonType) {
        this.buttonType = buttonType;
    }
    
    public String getButtonType() {
        return buttonType;
    }
    
    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        //Centraliza a label
        label.setHorizontalAlignment(JLabel.CENTER);
        
        //Seta um �cone na label (Editar/Excluir)
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));
        
        //Retorna a label renderizada
        return label;
    }
}
