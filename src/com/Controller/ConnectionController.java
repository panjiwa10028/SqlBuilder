package com.Controller;

import com.Model.Database;
import com.RestApi.DaoMysql;
import com.RestApi.DaoPhoenix;
import com.RestApi.ImplementMysql;
import com.RestApi.ImplementPhoenix;
import com.Utility.DialogHelper;
import com.View.IFrameMenu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ConnectionController {

    //from class
    private static Database model;
    private final IFrameMenu frame;

    //from class java
    private DefaultTableModel modelTable;

    //using to connecting RestAPI and get the json
    private URL url;
    private HttpURLConnection connection;
    private InputStream is;

    //confert the json
    private final JSONParser parser;
    private BufferedReader theReader;
    private Object obj;
    private JSONObject jsonObject, innerObj;
    private JSONArray lang;
    private Iterator itr;

    //for the JTree
    private TreePath[] paths;
    private Object parameter, hierarchy;
    private DefaultMutableTreeNode root, node, child;
    private DefaultTreeModel treeModel;

    //variable this class
    private List<String> table;
    private final List<String> column;
    private List<String> col;
    private final ArrayList data, list;
    private Object record;
    private String reply;
    private int value;

    //for Dao
    private final ImplementMysql implMysql;
    private final ImplementPhoenix implPhoenix;

    public ConnectionController() {
        model = new Database();
        frame = new IFrameMenu();

        list = new ArrayList();
        table = new ArrayList();
        column = new ArrayList();
        data = new ArrayList();
        parser = new JSONParser();

        implMysql = new DaoMysql();
        implPhoenix = new DaoPhoenix();
    }

    public ConnectionController(IFrameMenu frameMenu) {
        model = new Database();
        frame = frameMenu;
        modelTable = new DefaultTableModel();

        col = new ArrayList();
        list = new ArrayList();
        table = new ArrayList();
        column = new ArrayList();
        data = new ArrayList();
        parser = new JSONParser();

        implMysql = new DaoMysql();
        implPhoenix = new DaoPhoenix();
    }

    public void setEnableFrame(String dbSelect, String dbName, String ip, String port) {
        model.setDbSelect(dbSelect);
        if(model.getDbSelect().toLowerCase().equals("mysql")){
            model.setDbNama(dbName);
        } else {
            model.setDbNama(model.getDbSelect());
        }
        model.setIp(ip);
        model.setPort(port);
        frame.getTxtDatabase().setText(model.getDbSelect());
        frame.getTxtIp().setText(model.getIp());
        frame.getTxtPort().setText(model.getPort());
        pop_tree(model.getDbNama());
    }

    public void exitAction() {
        int confirm = DialogHelper.showConfirmMessage("Are you sure exit ?");
        if (confirm == 0) {
            frame.dispose();
        }
    }
    
    public void newConnectionAction() {
        int confirm = DialogHelper.showConfirmMessage("Are you sure ?");
        if (confirm == 0) {
            frame.dispose();
        }
    }

    public void btnChangeAction() {
        model.setLimit(DialogHelper.showInputMessage("Input limit !"));
        frame.getTxtLimit().setText(model.getLimit());
    }

    public void jTreeClick(javax.swing.event.TreeSelectionEvent evt) {
        paths = evt.getPaths();
        for (int i = 0; i <= paths.length; i++) {
            {
                if (evt.isAddedPath(i)) {
                    value = paths[i].getPathCount();
                    if (value == 2) {
                        frame.getPanelTableData().setVisible(true);
                        frame.gettPanelResult().setSelectedComponent(frame.getPanelTableData());
                        node = (DefaultMutableTreeNode) frame.getjTreeDatabase().getLastSelectedPathComponent();
                        if (node == null) {
                            return;
                        }
                        parameter = node.getUserObject();
//                        String limit = JOptionPane.showInputDialog("Insert limit !");
                        model.setLimit(frame.getTxtLimit().getText());
                        getColoumn(parameter.toString());
                        try {
                            if (!model.getLimit().isEmpty()) {
                                getData(parameter.toString(), Integer.parseInt(model.getLimit()));
                            } else {
                                model.setLimit("100");
                                getData(parameter.toString(), Integer.parseInt(model.getLimit()));
                            }
                        } catch (NullPointerException ex) {
                            System.out.println(ex);
                        }
                    }
                    break;
                } else {
                    break;
                }
            }
        }
    }

    // insert root jTree
    @SuppressWarnings({"empty-statement", "empty-statement"})
    public void pop_tree(String dbName) {
        System.out.println(dbName);
        list.add(dbName);
        hierarchy = list.toArray();
        root = processHierarchy((Object[]) hierarchy);
        treeModel = new DefaultTreeModel(root);
        frame.getjTreeDatabase().setModel(treeModel);
    }

    // Insert node to JTree from mysql
    private DefaultMutableTreeNode processHierarchy(Object[] hierarchy) {
        node = new DefaultMutableTreeNode(hierarchy[0]);
        switch (model.getDbSelect().toLowerCase()) {
            case "mysql":
                table = implMysql.getTabel(model.getDbNama());
                break;
            case "phoenix":
                table = implPhoenix.getTabel();
                break;   
        }
        for (int j = 0; j < (int) table.size(); j++) {
            child = new DefaultMutableTreeNode(table.get(j));
            node.add(child);
        }
        return (node);
    }

    private void getColoumn(String parameter) {
        switch (model.getDbSelect().toLowerCase()) {
            case "mysql":
                frame.gettTableData().setModel(implMysql.getColumn(parameter));
                break;
            case "phoenix":
                frame.gettTableData().setModel(implPhoenix.getColumn(parameter));
                break;   
        }
    }

    private void getData(String param, int limit) {
        switch (model.getDbSelect().toLowerCase()) {
            case "mysql":
                frame.gettTableData().setModel(implMysql.getData(param, limit));
                break;
            case "phoenix":
                frame.gettTableData().setModel(implPhoenix.getData(param, limit));
                break;   
        }
    }
    
    public void reset(){
//        newConnectionAction();
    }

}
