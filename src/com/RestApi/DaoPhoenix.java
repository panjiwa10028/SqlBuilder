package com.RestApi;

import com.Model.Database;
import com.Utility.Connection;
import com.View.Main;
import java.io.BufferedReader;
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

public class DaoPhoenix implements ImplementPhoenix {

    private static URL url;
    private static HttpURLConnection connection;
    private static InputStream is;

    private static Database model;
    private static Main frame;
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

    public DaoPhoenix() {
        model = new Database();
        list = new ArrayList();
        table = new ArrayList();
        column = new ArrayList();
        data = new ArrayList();
        parser = new JSONParser();
    }

    @Override
    public List<String> getTabel() {
        try {
            parameter = "/get/";
            connection = Connection.getConnection(parameter);
            is = connection.getInputStream();
            theReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((reply = theReader.readLine()) != null) {
                obj = parser.parse(reply);
                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
//                for (Object lang1 : lang) {
//                    table.add(lang1.toString());
//                }
                    itr = lang.iterator();
                    table.clear();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        table.add(innerObj.get("TABLE_NAME").toString().toLowerCase());
                    }
                }
            }
            connection.disconnect();

        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return table;
    }

    @Override
    public DefaultTableModel getColumn(String param) {
        try {
            parameter = "/get/" + param;
            connection = Connection.getConnection(parameter);
            is = connection.getInputStream();
            theReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((reply = theReader.readLine()) != null) {
                obj = parser.parse(reply);
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
                    for (String column1 : column) {
                        modelTable.addColumn(column1);
                    }
                }
            }
            connection.disconnect();
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return modelTable;
    }

    @Override
    public DefaultTableModel getData(String param, int limit) {
        try {
            int j = 1;
            parameter = "/get/" + param + "/" + limit;
            connection = Connection.getConnection(parameter);
            is = connection.getInputStream();
            theReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((reply = theReader.readLine()) != null) {
                obj = parser.parse(reply);
                column.remove(0);
//                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("1")) {
                    lang = (JSONArray) jsonObject.get("data");
                    itr = lang.iterator();
                    data.clear();
                    while (itr.hasNext()) {
                        innerObj = (JSONObject) itr.next();
                        System.out.println(innerObj);
                        System.out.println(column);
                        col = new ArrayList<>();
                        col.add(Integer.toString(j));
                        j++;
                        for (int i = 0; i < (int) column.size(); i++) {
                            record = column.get(i);
                            col.add(innerObj.get(record).toString());
                        }
                        //data.add(col);
                        modelTable.addRow(col.toArray());
                    }
                }

            }
            connection.disconnect();
//             output
//             {"Query":"Find Success","data":[{"id":1,"nama":"bani","email":"bani@pusing.com"},{"id":2,"nama":"hardika","email":"hardika@pusing.com"}]}
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return modelTable;
    }

}
