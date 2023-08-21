/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layerd.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.layerd.controller.ItemController;
import pos.layerd.dto.ItemDto;

/**
 *
 * @author Hiran
 */
public class ItemPanel extends javax.swing.JPanel {
private ItemController itemController;
    /**
     * Creates new form ItemPanel
     */
    public ItemPanel() {
        itemController = new ItemController();
        initComponents();
        loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        itemcodeLabel = new javax.swing.JLabel();
        itemcodeText = new javax.swing.JTextField();
        descriptionLabel1 = new javax.swing.JLabel();
        itemdescriptionText = new javax.swing.JTextField();
        packsizeLabel = new javax.swing.JLabel();
        itempackSizeText = new javax.swing.JTextField();
        unitpriceLabel = new javax.swing.JLabel();
        itemunitpriceText = new javax.swing.JTextField();
        itemqohText = new javax.swing.JTextField();
        qohLabel = new javax.swing.JLabel();
        addbotton = new javax.swing.JButton();
        deletebotton = new javax.swing.JButton();
        updatebotton = new javax.swing.JButton();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        basePanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        headerlabel.setText(" Manage Items");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fromPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemcodeLabel.setForeground(new java.awt.Color(0, 0, 0));
        itemcodeLabel.setText("Item Code");
        fromPanel.add(itemcodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, -1, 22));

        itemcodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcodeTextActionPerformed(evt);
            }
        });
        fromPanel.add(itemcodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 15, 108, -1));

        descriptionLabel1.setText("Description");
        fromPanel.add(descriptionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, -1, 22));
        fromPanel.add(itemdescriptionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 43, 429, -1));

        packsizeLabel.setText("Pack Size");
        fromPanel.add(packsizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 70, 22));
        fromPanel.add(itempackSizeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 77, 108, -1));

        unitpriceLabel.setText(" Unit Price");
        fromPanel.add(unitpriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 111, -1, 22));

        itemunitpriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemunitpriceTextActionPerformed(evt);
            }
        });
        fromPanel.add(itemunitpriceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 111, 108, -1));
        fromPanel.add(itemqohText, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 139, 108, -1));

        qohLabel.setText("QOH");
        fromPanel.add(qohLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 139, 54, 22));

        addbotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbotton.setText("Save Item");
        addbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbottonActionPerformed(evt);
            }
        });
        fromPanel.add(addbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 213, -1, -1));

        deletebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebotton.setText("Delete Item");
        deletebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebottonActionPerformed(evt);
            }
        });
        fromPanel.add(deletebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 213, -1, -1));

        updatebotton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updatebotton.setText("Update Item");
        updatebotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebottonActionPerformed(evt);
            }
        });
        fromPanel.add(updatebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 213, -1, -1));

        itemsTable.setBackground(new java.awt.Color(204, 204, 255));
        itemsTable.setBorder(new javax.swing.border.MatteBorder(null));
        itemsTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        itemsTable.setForeground(new java.awt.Color(0, 0, 0));
        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemsTable);

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fromPanel.add(tablepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 254, 705, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/layerd/view/online-shopping-e-commerce-concept-wooden-block-icon-cart-standing-computer-keyboard-viewed-44905065.jpg"))); // NOI18N
        fromPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 660));

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fromPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemcodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcodeTextActionPerformed

    private void itemunitpriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemunitpriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemunitpriceTextActionPerformed

    private void addbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbottonActionPerformed
    try {
        // TODO add your handling code here:
        saveItems();
    } catch (Exception ex) {
        Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
  
    }//GEN-LAST:event_addbottonActionPerformed

    private void deletebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebottonActionPerformed
    try {
        // TODO add your handling code here:
        deletItem();
    } catch (Exception ex) {
        Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_deletebottonActionPerformed

    private void updatebottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebottonActionPerformed
    try {
        // TODO add your handling code here:
        updateItem();
    } catch (Exception ex) {
        Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_updatebottonActionPerformed

    private void itemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseClicked
    try {
        // TODO add your handling code here:
        searchItems();
    } catch (Exception ex) {
        Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_itemsTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbotton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton deletebotton;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel itemcodeLabel;
    private javax.swing.JTextField itemcodeText;
    private javax.swing.JTextField itemdescriptionText;
    private javax.swing.JTextField itempackSizeText;
    private javax.swing.JTextField itemqohText;
    private javax.swing.JTable itemsTable;
    private javax.swing.JTextField itemunitpriceText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel packsizeLabel;
    private javax.swing.JLabel qohLabel;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JLabel unitpriceLabel;
    private javax.swing.JButton updatebotton;
    // End of variables declaration//GEN-END:variables

 private void clear(){
            
            itemcodeText.setText("");
            itemdescriptionText.setText("");
            itempackSizeText.setText("");
            itemunitpriceText.setText("");
            itemqohText.setText("");
            
                 
        }
 
 
 private void  loadAllItems(){

        try {
            String [] columns = { "ItemCode", "Description","PackSize"," UnitPrice","QtyOnHand"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
                
            };
            itemsTable.setModel(dtm);
            
            ArrayList<ItemDto> itemDto =itemController.getAllItem();
            
            for (ItemDto dto : itemDto) {
        
                Object[] rowData = {dto.getId(),dto.getDescription(),dto.getPackSize(),dto.getUnitPrice(),dto.getQty()};
                dtm.addRow(rowData);
                 
            }   } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
      JOptionPane.showMessageDialog(this, ex);
            }
                  


}

    private void saveItems() throws Exception {

    try {
            ItemDto itemDtol= new ItemDto(itemcodeText.getText(),
                    itemdescriptionText.getText(),
                    itempackSizeText.getText(),
                    Double.parseDouble(itemunitpriceText.getText()),
                    Integer.parseInt(itemqohText.getText()));
            String resp = itemController.addItem(itemDtol);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }


    }
    
     private void searchItems() throws Exception{
    
        try {
            String itemCode = itemsTable.getValueAt(itemsTable.getSelectedRow(), 0).toString();
            
            ItemDto itemDtol = itemController.getItem(itemCode);
            
            
             if(itemDtol != null){
            
              itemcodeText.setText(itemDtol.getId());
            itemdescriptionText.setText(itemDtol.getDescription());
            itempackSizeText.setText(itemDtol.getPackSize());
            itemunitpriceText.setText(Double.toString(itemDtol.getUnitPrice()));
            itemqohText.setText(Integer.toString(itemDtol.getQty()));
              
            
            }else{
            
            
            JOptionPane.showMessageDialog(this,"Item Not Found");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex);
        }
    
    
    }
     
     private void  updateItem() throws Exception{
     
        try {
            ItemDto itemDtol= new ItemDto(itemcodeText.getText(),
                    itemdescriptionText.getText(),
                    itempackSizeText.getText(),
                    Double.parseDouble(itemunitpriceText.getText()),
                    Integer.parseInt(itemqohText.getText()));
            String resp = itemController.uodateItem(itemDtol);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
     
    
     
     }

 private void deletItem() throws Exception{
    
        try {
            String itemCode = itemcodeText.getText();
            String resp = itemController.deleteItem(itemCode);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex);
        }
}
}
