package com.LoadJson;

import com.RestApi.*;
import com.Model.Database;
import com.Utility.Connection;
import com.View.MainFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoadMysql implements ImplementMysql {

    private static Database model;
    private static MainFrame frame;
    private DefaultTableModel modelTable;

    private final JSONParser parser;
    private BufferedReader theReader;
    private Object obj;
    private JSONObject jsonObject, innerObj;
    private JSONArray lang;
    private Iterator itr;

    private final List<String> table;
    private final List<String> column;
    private List<String> col;
    private final ArrayList data, list;
    private Object record;
    private String reply, parameter;
    private int value;

    public LoadMysql() {
        model = new Database();
        list = new ArrayList();
        table = new ArrayList();
        column = new ArrayList();
        data = new ArrayList();
        parser = new JSONParser();
    }

    @Override
    public List<String> getTabel(String param) {
        try {
            parameter = param;
            obj = parser.parse(new FileReader(parameter));
            while (obj != null) {
                //                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
                    itr = lang.iterator();
                    table.clear();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        table.add(innerObj.get("Tables_in_" + param).toString());
                    }
                }
            }
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return table;
    }

    @Override
    public DefaultTableModel getColumn(String param) {
        try {
            parameter = param;
            obj = parser.parse(new FileReader(parameter));
            while (obj != null) {
//                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
                    itr = lang.iterator();
                    column.clear();
                    column.add("No");
                    modelTable = new DefaultTableModel();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        column.add(innerObj.get("COLUMN_NAME").toString().toUpperCase());
                    }
                    for (Object column1 : column) {
                        modelTable.addColumn(column1);
                    }
                }
            }
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return modelTable;
    }

    @Override
    public DefaultTableModel getData(String param) {
        try {
            int j = 1;
            parameter = param;
            obj = parser.parse(new FileReader(parameter));
            while (obj != null) {
                column.remove(0);
                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
                    itr = lang.iterator();
                    data.clear();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        System.out.println(innerObj);
                        System.out.println(column.toString());
                        col = new ArrayList<>();
                        col.add(Integer.toString(j));
                        j++;
                        for (int i = 0; i < (int) column.size(); i++) {
                            record = column.get(i).toLowerCase();
                            col.add(innerObj.get(record).toString());
                        }
                        //data.add(col);
                        modelTable.addRow(col.toArray());
                    }
                }
            }
//             output
//             {"Query":"Find Success","data":[{"id":1,"nama":"bani","email":"bani@pusing.com"},{"id":2,"nama":"hardika","email":"hardika@pusing.com"}]}
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return modelTable;
    }

    @Override
    public DefaultTableModel getColumnSql(String param) {
        try {
            parameter = param;
            obj = parser.parse(new FileReader(parameter));
            while (obj != null) {
//                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
                    itr = lang.iterator();
                    column.clear();
                    column.add("No");
                    modelTable = new DefaultTableModel();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        column.add(innerObj.get("COLUMN_NAME").toString().toUpperCase());
                    }
                    for (Object column1 : column) {
                        modelTable.addColumn(column1);
                    }
                }
            }
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return modelTable;
    }

    @Override
    public DefaultTableModel getDataSql(String param) {
        try {
            int j = 1;
            parameter = param;
            obj = parser.parse(new FileReader(parameter));
            while (obj != null) {
                column.remove(0);
                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
                    itr = lang.iterator();
                    data.clear();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        System.out.println(innerObj);
                        System.out.println(column.toString());
                        col = new ArrayList<>();
                        col.add(Integer.toString(j));
                        j++;
                        for (int i = 0; i < (int) column.size(); i++) {
                            record = column.get(i).toLowerCase();
                            col.add(innerObj.get(record).toString());
                        }
                        //data.add(col);
                        modelTable.addRow(col.toArray());
                    }
                }
            }
//             output
//             {"Query":"Find Success","data":[{"id":1,"nama":"bani","email":"bani@pusing.com"},{"id":2,"nama":"hardika","email":"hardika@pusing.com"}]}
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return modelTable;
    }

}
