package com.View;

import com.Controller.MainController;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class MainFrame extends javax.swing.JFrame {

    private final MainController controller;

    public MainFrame() {
        initComponents();
        controller = new MainController(this);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/com/Images/logo.png")));
        controller.setLenghtField();
    }

    public JToggleButton getBtnCancel() {
        return btnCancel;
    }

    public JToggleButton getBtnOk() {
        return btnOk;
    }

    public JToggleButton getBtnTest() {
        return btnTest;
    }

    public JComboBox getCboDatabase() {
        return cboDatabase;
    }

    public JDialog getDialogConnection() {
        return DialogConnection;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JLabel getLblDatabase() {
        return lblDatabase;
    }

    public JLabel getLblDatabaseName() {
        return lblDatabaseName;
    }

    public JLabel getLblIp() {
        return lblIp;
    }

    public JLabel getLblPort() {
        return lblPort;
    }

    public JDesktopPane getMainMenu() {
        return mainMenu;
    }

    public JMenu getMnAbout() {
        return mnAbout;
    }

    public JMenu getMnFile() {
        return mnFIle;
    }

    public JMenuItem getMnItemNewConnection() {
        return mnItemNewConnection;
    }

    public JMenu getMnQuery() {
        return mnEdit;
    }

    public JMenu getMnResult() {
        return mnView;
    }

    public JPanel getPanelConfiguration() {
        return panelConfiguration;
    }

    public JPanel getPanelDatabase() {
        return panelDatabase;
    }

    public JTextField getTxtDbName() {
        return txtDbName;
    }

    public JTextField getTxtIp() {
        return txtIp;
    }

    public JTextField getTxtPort() {
        return txtPort;
    }

    public JMenuItem getMnItemExit() {
        return mnItemExit;
    }

    public JMenu getMnView() {
        return mnView;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogConnection = new javax.swing.JDialog();
        panelDatabase = new javax.swing.JPanel();
        lblDatabase = new javax.swing.JLabel();
        cboDatabase = new javax.swing.JComboBox();
        panelConfiguration = new javax.swing.JPanel();
        lblIp = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        lblDatabaseName = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        txtDbName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JToggleButton();
        btnOk = new javax.swing.JToggleButton();
        btnTest = new javax.swing.JToggleButton();
        mainMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFIle = new javax.swing.JMenu();
        mnItemNewConnection = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnItemExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnView = new javax.swing.JMenu();
        mnItemDesign = new javax.swing.JCheckBoxMenuItem();
        mnItemSql = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnItemResult = new javax.swing.JCheckBoxMenuItem();
        mnItemData = new javax.swing.JCheckBoxMenuItem();
        mnItemGrouping = new javax.swing.JCheckBoxMenuItem();
        mnAbout = new javax.swing.JMenu();

        DialogConnection.setTitle("New Connection");

        panelDatabase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lblDatabase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDatabase.setText("Database");

        cboDatabase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboDatabase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Database -", "MySQL", "PHOENIX", "ORACLE", "MONGGO DB" }));
        cboDatabase.setToolTipText("");
        cboDatabase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDatabaseItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelDatabaseLayout = new javax.swing.GroupLayout(panelDatabase);
        panelDatabase.setLayout(panelDatabaseLayout);
        panelDatabaseLayout.setHorizontalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblDatabase)
                .addGap(69, 69, 69)
                .addComponent(cboDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatabaseLayout.setVerticalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatabase)
                    .addComponent(cboDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelConfiguration.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lblIp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIp.setText("IP");

        lblPort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPort.setText("Port");

        lblDatabaseName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDatabaseName.setText("Database Name");

        txtIp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtPort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtDbName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelConfigurationLayout = new javax.swing.GroupLayout(panelConfiguration);
        panelConfiguration.setLayout(panelConfigurationLayout);
        panelConfigurationLayout.setHorizontalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurationLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDatabaseName)
                    .addComponent(lblIp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPort, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(35, 35, 35)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDbName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelConfigurationLayout.setVerticalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIp)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPort)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatabaseName)
                    .addComponent(txtDbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/btncancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/btnlogin.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/btnsearch.png"))); // NOI18N
        btnTest.setText("Test");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogConnectionLayout = new javax.swing.GroupLayout(DialogConnection.getContentPane());
        DialogConnection.getContentPane().setLayout(DialogConnectionLayout);
        DialogConnectionLayout.setHorizontalGroup(
            DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogConnectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DialogConnectionLayout.setVerticalGroup(
            DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogConnectionLayout.createSequentialGroup()
                .addComponent(panelDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel)
                        .addComponent(btnOk))
                    .addComponent(btnTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnFIle.setText("File");

        mnItemNewConnection.setText("New Connection");
        mnItemNewConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemNewConnectionActionPerformed(evt);
            }
        });
        mnFIle.add(mnItemNewConnection);
        mnFIle.add(jSeparator1);

        mnItemExit.setText("Exit");
        mnItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemExitActionPerformed(evt);
            }
        });
        mnFIle.add(mnItemExit);

        jMenuBar1.add(mnFIle);

        mnEdit.setText("Edit");
        jMenuBar1.add(mnEdit);

        mnView.setText("View");

        mnItemDesign.setSelected(true);
        mnItemDesign.setText("Design");
        mnItemDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemDesignActionPerformed(evt);
            }
        });
        mnView.add(mnItemDesign);

        mnItemSql.setSelected(true);
        mnItemSql.setText("Sql");
        mnItemSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemSqlActionPerformed(evt);
            }
        });
        mnView.add(mnItemSql);
        mnView.add(jSeparator3);

        mnItemResult.setSelected(true);
        mnItemResult.setText("Result");
        mnItemResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemResultActionPerformed(evt);
            }
        });
        mnView.add(mnItemResult);

        mnItemData.setSelected(true);
        mnItemData.setText("Data");
        mnItemData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemDataActionPerformed(evt);
            }
        });
        mnView.add(mnItemData);

        mnItemGrouping.setSelected(true);
        mnItemGrouping.setText("Grouping");
        mnItemGrouping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemGroupingActionPerformed(evt);
            }
        });
        mnView.add(mnItemGrouping);

        jMenuBar1.add(mnView);

        mnAbout.setText("About");
        jMenuBar1.add(mnAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemNewConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemNewConnectionActionPerformed
        controller.menuNewConnectionAction();
    }//GEN-LAST:event_mnItemNewConnectionActionPerformed

    private void mnItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemExitActionPerformed
        controller.exitAction();
    }//GEN-LAST:event_mnItemExitActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        controller.btnTestAction();
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        controller.btnOkAction();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.btnCancelAction();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cboDatabaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDatabaseItemStateChanged
        controller.cboDatabaseItemStateChange();
    }//GEN-LAST:event_cboDatabaseItemStateChanged

    private void mnItemDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemDesignActionPerformed
        if (mnItemDesign.isSelected()) {
            controller.panelDesign(true);
        } else {
            controller.panelDesign(false);
        }
    }//GEN-LAST:event_mnItemDesignActionPerformed

    private void mnItemSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemSqlActionPerformed
        if (mnItemSql.isSelected()) {
            controller.panelSql(true);
        } else {
            controller.panelSql(false);
        }
    }//GEN-LAST:event_mnItemSqlActionPerformed

    private void mnItemResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemResultActionPerformed
        if (mnItemResult.isSelected()) {
            controller.panelResult(true);
        } else {
            controller.panelResult(false);
        }
    }//GEN-LAST:event_mnItemResultActionPerformed

    private void mnItemDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemDataActionPerformed
        if (mnItemData.isSelected()) {
            controller.panelData(true);
        } else {
            controller.panelData(false);
        }
    }//GEN-LAST:event_mnItemDataActionPerformed

    private void mnItemGroupingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemGroupingActionPerformed
        if (mnItemGrouping.isSelected()) {
            controller.panelGrouping(true);
        } else {
            controller.panelGrouping(false);
        }
    }//GEN-LAST:event_mnItemGroupingActionPerformed

    //    private void setUpSportColumn(JTable table, TableColumn sportColumn) {
//        //Set up the editor for the sport cells.
//        JComboBox comboBox = new JComboBox();
//        comboBox.addItem("Equal");
//        comboBox.addItem("Not Equal");
//        comboBox.addItem("Grather Than");
//        comboBox.addItem("Smaller Than");
//        comboBox.addItem("Grather of Equal");
//        comboBox.addItem("Smaller of Equal");
//        comboBox.addItem("Start With");
//        comboBox.addItem("End With");
//        comboBox.addItem("Is Null");
//        comboBox.addItem("Like");
//        comboBox.addItem("Is Not Null");
//        comboBox.addItem("Is Number");
//        comboBox.addItem("Is Not Number");
//        comboBox.addItem("In List");
//        sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
//
//        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
//        renderer.setToolTipText("Click for combo box");
//        sportColumn.setCellRenderer(renderer);
//    }
//
//    private class PopupMenuListener extends MouseAdapter {
//
//        @Override
//        public void mousePressed(MouseEvent me) {
//            showPopup(me);
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent me) {
//            showPopup(me);
//        }
//
//        private void showPopup(MouseEvent me) {
//            if (me.isPopupTrigger()) {
//                menuPopUp = new PopupMenu();
//                menuPopUp.show(me.getComponent(), me.getX(), me.getY());
//            }
//        }
//    }
//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogConnection;
    private javax.swing.JToggleButton btnCancel;
    private javax.swing.JToggleButton btnOk;
    private javax.swing.JToggleButton btnTest;
    private javax.swing.JComboBox cboDatabase;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblDatabaseName;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblPort;
    private javax.swing.JDesktopPane mainMenu;
    private javax.swing.JMenu mnAbout;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFIle;
    private javax.swing.JCheckBoxMenuItem mnItemData;
    private javax.swing.JCheckBoxMenuItem mnItemDesign;
    private javax.swing.JMenuItem mnItemExit;
    private javax.swing.JCheckBoxMenuItem mnItemGrouping;
    private javax.swing.JMenuItem mnItemNewConnection;
    private javax.swing.JCheckBoxMenuItem mnItemResult;
    private javax.swing.JCheckBoxMenuItem mnItemSql;
    private javax.swing.JMenu mnView;
    private javax.swing.JPanel panelConfiguration;
    private javax.swing.JPanel panelDatabase;
    private javax.swing.JTextField txtDbName;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
