package com.View;

import com.Controller.ConnectionController;
import com.Model.Database;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTree;

public final class IFrame extends javax.swing.JInternalFrame {

    private final ConnectionController controller;
    private final Database model;

    public IFrame() {
        initComponents();
        controller = new ConnectionController(this);
        model = new Database();
        addPanelDesign();
        addPanelResult();
        addPanelData();
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
        panelHeader = new javax.swing.JPanel();
        lblDatabase = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        lblLimit = new javax.swing.JLabel();
        txtLimit = new javax.swing.JTextField();
        tBtnChange = new javax.swing.JToggleButton();
        lblIp = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        lblPort = new javax.swing.JLabel();
        jScroolTree = new javax.swing.JScrollPane();
        jTreeDatabase = new javax.swing.JTree();
        tPanelQuery = new main.ClosableTab();
        tPanelResult = new main.ClosableTab();

        Refresh.setText("Refresh");
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

        javax.swing.GroupLayout panelGroupingLayout = new javax.swing.GroupLayout(panelGrouping);
        panelGrouping.setLayout(panelGroupingLayout);
        panelGroupingLayout.setHorizontalGroup(
            panelGroupingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelGroupingLayout.setVerticalGroup(
            panelGroupingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximizable(true);
        setTitle("Query Builder");
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

        lblDatabase.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDatabase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDatabase.setText("Database");

        txtDatabase.setEditable(false);
        txtDatabase.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDatabase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDatabase.setToolTipText("Server your database");

        lblLimit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblLimit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLimit.setText("Limit Data");

        txtLimit.setEditable(false);
        txtLimit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtLimit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimit.setText("100");
        txtLimit.setToolTipText("Server your database");

        tBtnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/btnEdit.png"))); // NOI18N
        tBtnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtnChangeActionPerformed(evt);
            }
        });

        lblIp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIp.setText("IP");

        txtIp.setEditable(false);
        txtIp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtIp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIp.setToolTipText("Server your database");

        txtPort.setEditable(false);
        txtPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPort.setToolTipText("Server your database");

        lblPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPort.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPort.setText("Port");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblIp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblDatabase)
                        .addGap(38, 38, 38)
                        .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(lblLimit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tBtnChange)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatabase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIp))
                        .addGap(9, 9, 9)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPort)))
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tBtnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLimit))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTreeDatabase.setComponentPopupMenu(jTreePopup);
        jTreeDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeDatabaseMouseClicked(evt);
            }
        });
        jTreeDatabase.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeDatabaseValueChanged(evt);
            }
        });
        jScroolTree.setViewportView(jTreeDatabase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScroolTree, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tPanelQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tPanelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tPanelQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPanelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScroolTree, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setEnableFrame(String dbSelect, String dbName, String ip, String port) {
        controller.setEnableFrame(dbSelect, dbName, ip, port);
    }
    
    public void addPanelDesign(){
        tPanelQuery.addTab("Design", );
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
        return panelResult.gettResult();
    }

    public JTable gettTableData() {
        return panelData.gettTableData();
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

    private void tBtnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtnChangeActionPerformed
        controller.btnChangeAction();
    }//GEN-LAST:event_tBtnChangeActionPerformed

    private void jTreeDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeDatabaseMouseClicked
        
    }//GEN-LAST:event_jTreeDatabaseMouseClicked

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
    private javax.swing.JScrollPane jScroolTree;
    private javax.swing.JTree jTreeDatabase;
    private javax.swing.JPopupMenu jTreePopup;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblLimit;
    private javax.swing.JLabel lblPort;
    private javax.swing.JPopupMenu panelDesignPopup;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JToggleButton tBtnChange;
    private main.ClosableTab tPanelQuery;
    private main.ClosableTab tPanelResult;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}

