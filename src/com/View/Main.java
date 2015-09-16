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

public final class Main extends javax.swing.JFrame {

    private final MainController controller;

    public Main() {
        initComponents();
        controller = new MainController(this);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/com/Images/logo.png")));
        controller.setLenghtField();
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnOk() {
        return btnOk;
    }

    public JButton getBtnTest() {
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
        return mnFile;
    }

    public JMenuItem getMnItemNewConnection() {
        return mnItemNewConnection;
    }

    public JMenu getMnQuery() {
        return mnQuery;
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

    public JCheckBoxMenuItem getMnItemDesign() {
        return mnItemDesign;
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
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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
        btnTest = new javax.swing.JButton();
        mainMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnItemNewConnection = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnItemExit = new javax.swing.JMenuItem();
        mnQuery = new javax.swing.JMenu();
        mnView = new javax.swing.JMenu();
        mnItemDesign = new javax.swing.JCheckBoxMenuItem();
        mnItemSql = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnItemResult = new javax.swing.JCheckBoxMenuItem();
        mnItemData = new javax.swing.JCheckBoxMenuItem();
        mnItemGrouping = new javax.swing.JCheckBoxMenuItem();
        mnAbout = new javax.swing.JMenu();

        DialogConnection.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        DialogConnection.setTitle("New Connection");

        btnOk.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        panelDatabase.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblDatabase.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDatabase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDatabase.setText("Database");

        cboDatabase.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cboDatabase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Database -", "MySQL", "PHOENIX", "ORACLE", "MONGGO DB" }));
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
                .addGap(21, 21, 21)
                .addComponent(lblDatabase)
                .addGap(76, 76, 76)
                .addComponent(cboDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatabaseLayout.setVerticalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatabaseLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatabase)
                    .addComponent(cboDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelConfiguration.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblIp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIp.setText("IP");

        lblPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPort.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPort.setText("Port");

        lblDatabaseName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDatabaseName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDatabaseName.setText("Database Name");

        txtIp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtIp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIpKeyPressed(evt);
            }
        });

        txtPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPortKeyPressed(evt);
            }
        });

        txtDbName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDbName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDbNameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelConfigurationLayout = new javax.swing.GroupLayout(panelConfiguration);
        panelConfiguration.setLayout(panelConfigurationLayout);
        panelConfigurationLayout.setHorizontalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurationLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigurationLayout.createSequentialGroup()
                        .addComponent(lblIp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConfigurationLayout.createSequentialGroup()
                        .addComponent(lblPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConfigurationLayout.createSequentialGroup()
                        .addComponent(lblDatabaseName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(txtDbName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
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

        btnTest.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
            .addComponent(jSeparator1)
            .addGroup(DialogConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatabase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogConnectionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addComponent(panelConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DialogConnectionLayout.setVerticalGroup(
            DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk)
                    .addComponent(btnTest))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(btnOk);
        getRootPane().setDefaultButton(btnOk);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainMenu.setName(""); // NOI18N

        mnFile.setText("File");
        mnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFileActionPerformed(evt);
            }
        });

        mnItemNewConnection.setText("New Connection");
        mnItemNewConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemNewConnectionActionPerformed(evt);
            }
        });
        mnFile.add(mnItemNewConnection);
        mnFile.add(jSeparator2);

        mnItemExit.setText("Exit");
        mnItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemExitActionPerformed(evt);
            }
        });
        mnFile.add(mnItemExit);

        jMenuBar1.add(mnFile);

        mnQuery.setText("Edit");
        jMenuBar1.add(mnQuery);

        mnView.setText("View");
        mnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnViewActionPerformed(evt);
            }
        });

        mnItemDesign.setSelected(true);
        mnItemDesign.setText("Design");
        mnItemDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemDesignActionPerformed(evt);
            }
        });
        mnView.add(mnItemDesign);

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(mainMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFileActionPerformed

    }//GEN-LAST:event_mnFileActionPerformed

    private void mnItemNewConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemNewConnectionActionPerformed
        controller.menuNewConnectionAction();
    }//GEN-LAST:event_mnItemNewConnectionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controller.exitAction();
    }//GEN-LAST:event_formWindowClosing

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        controller.btnOkAction();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.btnCancelAction();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cboDatabaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDatabaseItemStateChanged
        controller.cboDatabaseItemStateChange();
    }//GEN-LAST:event_cboDatabaseItemStateChanged

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        controller.btnTestAction();
    }//GEN-LAST:event_btnTestActionPerformed

    private void txtIpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpKeyPressed

    private void txtPortKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPortKeyPressed
//        if (!cboDatabase.getSelectedItem().toString().toLowerCase().equals("mysql") && cboDatabase.getSelectedIndex() > 0) {
//            if (!txtPort.getText().isEmpty()) {
//                controller.btnOkAction();
//            }
//        }
    }//GEN-LAST:event_txtPortKeyPressed

    private void txtDbNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDbNameKeyPressed
//        if (cboDatabase.getSelectedItem().toString().toLowerCase().equals("mysql") && cboDatabase.getSelectedIndex() > 0) {
//            if (!txtDbName.getText().isEmpty()) {
//                controller.btnOkAction();
//            }
//        }
    }//GEN-LAST:event_txtDbNameKeyPressed

    private void mnItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemExitActionPerformed
        controller.exitAction();
    }//GEN-LAST:event_mnItemExitActionPerformed

    private void mnItemDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemDesignActionPerformed
        if(mnItemDesign.isSelected()){
            controller.panelDesign(true);
        } else {
            controller.panelDesign(false);
        }
    }//GEN-LAST:event_mnItemDesignActionPerformed

    private void mnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnViewActionPerformed

    private void mnItemSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemSqlActionPerformed
        if(mnItemSql.isSelected()){
            controller.panelSql(true);
        } else {
            controller.panelSql(false);
        }
    }//GEN-LAST:event_mnItemSqlActionPerformed

    private void mnItemResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemResultActionPerformed
        if(mnItemResult.isSelected()){
            controller.panelResult(true);
        } else {
            controller.panelResult(false);
        }
    }//GEN-LAST:event_mnItemResultActionPerformed

    private void mnItemDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemDataActionPerformed
        if(mnItemData.isSelected()){
            controller.panelData(true);
        } else {
            controller.panelData(false);
        }
    }//GEN-LAST:event_mnItemDataActionPerformed

    private void mnItemGroupingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemGroupingActionPerformed
        if(mnItemGrouping.isSelected()){
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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnTest;
    private javax.swing.JComboBox cboDatabase;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblDatabaseName;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblPort;
    private javax.swing.JDesktopPane mainMenu;
    private javax.swing.JMenu mnAbout;
    private javax.swing.JMenu mnFile;
    private javax.swing.JCheckBoxMenuItem mnItemData;
    private javax.swing.JCheckBoxMenuItem mnItemDesign;
    private javax.swing.JMenuItem mnItemExit;
    private javax.swing.JCheckBoxMenuItem mnItemGrouping;
    private javax.swing.JMenuItem mnItemNewConnection;
    private javax.swing.JCheckBoxMenuItem mnItemResult;
    private javax.swing.JCheckBoxMenuItem mnItemSql;
    private javax.swing.JMenu mnQuery;
    private javax.swing.JMenu mnView;
    private javax.swing.JPanel panelConfiguration;
    private javax.swing.JPanel panelDatabase;
    private javax.swing.JTextField txtDbName;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
