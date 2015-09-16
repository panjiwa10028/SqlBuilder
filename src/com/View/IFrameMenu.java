package com.View;

import com.Controller.ConnectionController;
import com.Model.Database;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTree;

public final class IFrameMenu extends javax.swing.JInternalFrame {

    private final ConnectionController controller;
    private final Database model;
    
    public IFrameMenu() {
        initComponents();
        controller = new ConnectionController(this);
        model = new Database();
        addPanelDesign();
        addPanelResult();
        addPanelData();
    }

    public void setEnableFrame(String dbSelect, String dbName, String ip, String port) {
        controller.setEnableFrame(dbSelect, dbName, ip, port);
    }
    
    public void addPanelDesign(){
        tPanelQuery.addTab("Design", panelDesign);
    }
    
    public void removePanelDesign(){
        tPanelQuery.remove(panelDesign);
    }
    
    public void addPanelSql(){
        tPanelQuery.addTab("Sql", panelSql);
    }
    
    public void removePanelSql(){
        tPanelQuery.remove(panelSql);
    }
    
    public void addPanelResult(){
        tPanelResult.addTab("Result", panelResult);
    }
    
    public void removePanelResult(){
        tPanelResult.remove(panelResult);
    }
    
    public void addPanelData(){
        tPanelResult.addTab("Data", panelData);
    }
    
    public void removePanelData(){
        tPanelQuery.remove(panelData);
    }
    
    public void addPanelGroup(){
        tPanelResult.addTab("Grouping", panelGrouping);
    }
    
    public void removePanelGroup(){
        tPanelQuery.remove(panelGrouping);
    }

    public JTree getjTreeDatabase() {
        return jTreeDatabase;
    }

    public JPanel getPanelHeader() {
        return panelHeader;
    }

    public JPanel getPanelResult() {
        return panelResult;
    }

    public JPanel getPanelTableData() {
        return panelData;
    }

    public JToggleButton gettBtnChange() {
        return tBtnChange;
    }

    public JTabbedPane gettPanelQuery() {
        return tPanelQuery;
    }

    public JTabbedPane gettPanelResult() {
        return tPanelResult;
    }

    public JTable gettResult() {
        return tTableResult;
    }

    public JTable gettTableData() {
        return tTableData;
    }
    
    public JTable gettTableGrouping() {
        return tTableGrouping;
    }

    public JTextField getTxtDatabase() {
        return txtDatabase;
    }

    public JTextField getTxtIp() {
        return txtIp;
    }

    public JTextField getTxtLimit() {
        return txtLimit;
    }

    public JTextField getTxtPort() {
        return txtPort;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTreePopup = new javax.swing.JPopupMenu();
        Refresh = new javax.swing.JMenuItem();
        designPopup = new javax.swing.JPopupMenu();
        addComponent = new javax.swing.JMenuItem();
        addConnection = new javax.swing.JMenuItem();
        excuteQuery = new javax.swing.JMenuItem();
        panelDesignPopup = new javax.swing.JPopupMenu();
        closeAll = new javax.swing.JMenuItem();
        closeOther = new javax.swing.JMenuItem();
        panelDesign = new javax.swing.JPanel();
        panelSql = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSql = new javax.swing.JTextArea();
        panelResult = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tTableResult = new javax.swing.JTable();
        panelData = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tTableData = new javax.swing.JTable();
        panelGrouping = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tTableGrouping = new javax.swing.JTable();
        panelHeader = new javax.swing.JPanel();
        lblDatabase = new javax.swing.JLabel();
        lblIp = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        lblLimit = new javax.swing.JLabel();
        txtLimit = new javax.swing.JTextField();
        tBtnChange = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeDatabase = new javax.swing.JTree();
        tPanelResult = new main.ClosableTab();
        tPanelQuery = new main.ClosableTab();

        Refresh.setText("Refesh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jTreePopup.add(Refresh);

        addComponent.setText("Add Component");
        designPopup.add(addComponent);

        addConnection.setText("Add Connection");
        designPopup.add(addConnection);

        excuteQuery.setText("Excute Query");
        designPopup.add(excuteQuery);

        closeAll.setText("Close All");
        panelDesignPopup.add(closeAll);

        closeOther.setText("Close Other");
        panelDesignPopup.add(closeOther);

        javax.swing.GroupLayout panelDesignLayout = new javax.swing.GroupLayout(panelDesign);
        panelDesign.setLayout(panelDesignLayout);
        panelDesignLayout.setHorizontalGroup(
            panelDesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelDesignLayout.setVerticalGroup(
            panelDesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtSql.setColumns(20);
        txtSql.setRows(5);
        jScrollPane2.setViewportView(txtSql);

        javax.swing.GroupLayout panelSqlLayout = new javax.swing.GroupLayout(panelSql);
        panelSql.setLayout(panelSqlLayout);
        panelSqlLayout.setHorizontalGroup(
            panelSqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(panelSqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE))
        );
        panelSqlLayout.setVerticalGroup(
            panelSqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
            .addGroup(panelSqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
        );

        tTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tTableResult);

        javax.swing.GroupLayout panelResultLayout = new javax.swing.GroupLayout(panelResult);
        panelResult.setLayout(panelResultLayout);
        panelResultLayout.setHorizontalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
            .addGroup(panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE))
        );
        panelResultLayout.setVerticalGroup(
            panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
            .addGroup(panelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );

        tTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tTableData);

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        tTableGrouping.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tTableGrouping);

        javax.swing.GroupLayout panelGroupingLayout = new javax.swing.GroupLayout(panelGrouping);
        panelGrouping.setLayout(panelGroupingLayout);
        panelGroupingLayout.setHorizontalGroup(
            panelGroupingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
        );
        panelGroupingLayout.setVerticalGroup(
            panelGroupingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDatabase.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDatabase.setText("Database");

        lblIp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblIp.setText("IP");

        lblPort.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPort.setText("Port");

        txtDatabase.setEditable(false);
        txtDatabase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDatabase.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtIp.setEditable(false);
        txtIp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPort.setEditable(false);
        txtPort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLimit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLimit.setText("Limit");

        txtLimit.setEditable(false);
        txtLimit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLimit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimit.setText("100");

        tBtnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/btnEdit.png"))); // NOI18N
        tBtnChange.setText("Limit");
        tBtnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDatabase)
                    .addComponent(lblIp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPort, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(32, 32, 32)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addComponent(lblLimit)
                        .addGap(18, 18, 18)
                        .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tBtnChange))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatabase)
                    .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIp)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLimit)
                    .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBtnChange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPort)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTreeDatabase.setComponentPopupMenu(jTreePopup);
        jTreeDatabase.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeDatabaseValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTreeDatabase);

        tPanelQuery.setComponentPopupMenu(panelDesignPopup);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tPanelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tPanelQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tPanelQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPanelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tBtnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtnChangeActionPerformed
        controller.btnChangeAction();
    }//GEN-LAST:event_tBtnChangeActionPerformed

    private void jTreeDatabaseValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeDatabaseValueChanged
        controller.jTreeClick(evt);
    }//GEN-LAST:event_jTreeDatabaseValueChanged

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        controller.exitAction();
    }//GEN-LAST:event_formInternalFrameClosing

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        controller.refreshAction();
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JMenuItem addComponent;
    private javax.swing.JMenuItem addConnection;
    private javax.swing.JMenuItem closeAll;
    private javax.swing.JMenuItem closeOther;
    private javax.swing.JPopupMenu designPopup;
    private javax.swing.JMenuItem excuteQuery;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTree jTreeDatabase;
    private javax.swing.JPopupMenu jTreePopup;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblLimit;
    private javax.swing.JLabel lblPort;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelDesign;
    private javax.swing.JPopupMenu panelDesignPopup;
    private javax.swing.JPanel panelGrouping;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelResult;
    private javax.swing.JPanel panelSql;
    private javax.swing.JToggleButton tBtnChange;
    private main.ClosableTab tPanelQuery;
    private main.ClosableTab tPanelResult;
    private javax.swing.JTable tTableData;
    private javax.swing.JTable tTableGrouping;
    private javax.swing.JTable tTableResult;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextArea txtSql;
    // End of variables declaration//GEN-END:variables
}
