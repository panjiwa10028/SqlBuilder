package com.Controller;

import com.Model.Database;
import com.Utility.Connection;
import com.Utility.DialogHelper;
import com.Utility.Validasi;
import com.View.IFrame;
import com.View.Main;
import com.View.MainFrame;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainController {

    private final MainFrame frame;
    private final Database model;
    private final Validasi validasi;
    private final IFrame menuUtama;
    private final ConnectionController connectController;

    public MainController(MainFrame frameUtama) {
        frame = frameUtama;
        model = new Database();
        validasi = new Validasi();
        menuUtama = new IFrame();
        connectController = new ConnectionController();
    }

    public MainController() {
        frame = new MainFrame();
        model = new Database();
        validasi = new Validasi();
        menuUtama = new IFrame();
        connectController = new ConnectionController();
    }

    public void setVisibleFrame() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                    frame.setVisible(true);
                    setOnline(false);
                    frame.setLocationRelativeTo(null);
                    frame.setExtendedState(Main.MAXIMIZED_BOTH);
                    frame.getMainMenu().updateUI();
                    setTextField(false);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }

    private void setTextField(boolean status) {
        frame.getLblDatabaseName().setVisible(status);
        frame.getTxtDbName().setVisible(status);
    }

    private void setUkuran(JInternalFrame menuUtama) {
        int x = frame.getWidth();
        int y = frame.getHeight();
        menuUtama.setSize(x, y);
    }

    public void setLenghtField() {
        validasi.limitTextFieldChar(frame.getTxtIp(), 15);
        validasi.limitTextFieldChar(frame.getTxtPort(), 4);
        validasi.limitTextFieldChar(frame.getTxtDbName(), 20);
    }
    
    public void setOnline(boolean status){
        frame.getMnQuery().setEnabled(status);
        frame.getMnResult().setEnabled(status);
        frame.getMnView().setEnabled(status);
    }

    private void insertData() {
        model.setDbSelect(frame.getCboDatabase().getSelectedItem().toString());
        model.setIp(frame.getTxtIp().getText());
        model.setPort(frame.getTxtPort().getText());
        model.setDbNama(frame.getTxtDbName().getText());
    }

    private void resetConnection() {
        frame.getCboDatabase().setSelectedIndex(0);
        frame.getTxtIp().setText(null);
        frame.getTxtPort().setText(null);
        frame.getTxtDbName().setText(null);
    }

    private void resetMainMenu() {
        int a = frame.getMainMenu().getAllFrames().length;
        for (int i = 0; i < a; i++) {
            frame.getMainMenu().remove(i);
        }
    }

    private boolean validasiDatabase() {
        if (frame.getCboDatabase().getSelectedIndex() < 1) {
            DialogHelper.showWarningMessage("Must be choose database !");
            frame.getCboDatabase().requestFocus();
            return false;
        } else if (model.getIp().isEmpty()) {
            DialogHelper.showWarningMessage("IP cannot empty !");
            frame.getTxtIp().requestFocus();
            return false;
        } else if (model.getPort().isEmpty()) {
            DialogHelper.showWarningMessage("Port cannot empty !");
            frame.getTxtPort().requestFocus();
            return false;
        } else if (validasi.cekHuruf(model.getPort())) {
            DialogHelper.showErrorMessage("Port must a number !");
            frame.getTxtPort().requestFocus();
            return false;
        } else if (model.getDbSelect().toLowerCase().equals("mysql")) {
            if (model.getDbNama().isEmpty()) {
                DialogHelper.showErrorMessage("Name database cannot empty !");
                frame.getTxtDbName().requestFocus();
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public void cboDatabaseItemStateChange() {
        int db = frame.getCboDatabase().getSelectedIndex();
        if (db > 0) {
            if (frame.getCboDatabase().getSelectedItem().toString().toLowerCase().equals("mysql")) {
                setTextField(true);
            } else {
                setTextField(false);
            }
        }
    }

    public boolean btnTestAction() {
        insertData();
        Database.setUrl("http://" + model.getIp() + ":" + model.getPort() + "/");
        if (validasiDatabase()) {
            if (Connection.testConnection()) {
                DialogHelper.showInformationMessage("Connetion success !");
                return true;
            } else {
                DialogHelper.showWarningMessage("Connetion Refused !");
                return false;
            }
        }
        return false;
    }

    public void btnOkAction() {
        insertData();
        if (btnTestAction()) {
            resetConnection();
            resetMainMenu();
            frame.getDialogConnection().dispose();
            frame.getMainMenu().add(menuUtama);
            setUkuran(menuUtama);
            menuUtama.setEnableFrame(model.getDbSelect(), model.getDbNama(), model.getIp(), model.getPort());
            menuUtama.setVisible(true);
            setOnline(true);
        }
    }

    public void btnCancelAction() {
        frame.getDialogConnection().dispose();
    }

    public void exitAction() {
        int confirm = DialogHelper.showConfirmMessage("Are you sure exit ?");
        if (confirm == 0) {
            System.exit(0);
        }
    }

    public void menuNewConnectionAction() {
        setOnline(false);
        String name = null;
        try {
            name = frame.getMainMenu().getSelectedFrame().getTitle();
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        if (name != null) {
            if (name.equals(menuUtama.getTitle())) {
                int confirm = DialogHelper.showConfirmMessage("Are you sure end "+ menuUtama.getTxtDatabase().getText() +" connection ?");
                if (confirm == 0) {
                    resetConnection();
                    frame.getMainMenu().remove(menuUtama);
                    menuUtama.setVisible(false);
                    frame.getMainMenu().updateUI();
                    inputConnection();
                }
            }
        } else {
            inputConnection();
        }
    }

    private void inputConnection() {
        frame.getDialogConnection().setPreferredSize(new Dimension(400, 300));
        frame.getDialogConnection().setMinimumSize(new Dimension(400, 300));
        frame.getDialogConnection().setMaximumSize(new Dimension(400, 300));
        frame.getDialogConnection().setVisible(true);
        frame.getDialogConnection().setLocationRelativeTo(frame);
    }
    
    public void panelDesign(boolean status){
        if(status == true){
            menuUtama.addPanelDesign();
        } else {
            menuUtama.removePanelDesign();
        }
    }
    
    public void panelSql(boolean status){
        if(status == true){
            menuUtama.addPanelSql();
        } else {
            menuUtama.removePanelSql();
        }
    }
    
    public void panelResult(boolean status){
        if(status == true){
            menuUtama.addPanelResult();
        } else {
            menuUtama.removePanelResult();
        }
    }
    
    public void panelData(boolean status){
        if(status == true){
            menuUtama.addPanelData();
        } else {
            menuUtama.removePanelData();
        }
    }
    
    public void panelGrouping(boolean status){
        if(status == true){
            menuUtama.addPanelGroup();
        } else {
            menuUtama.removePanelGroup();
        }
    }

}
