package com.Utility;

import com.Model.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Connection {

    private static URL url;
    private static HttpURLConnection connection;
    private static InputStream is;
    private static Database model;

    private static JSONParser parser;
    private static BufferedReader theReader;
    private static Object obj;
    private static JSONObject jsonObject, innerObj;
    private static JSONArray lang;
    private static Iterator itr;

    private static String reply, parameter;

    public static HttpURLConnection getConnection(String parameter) {
        try {
            int ctrow = 0;
            int i = 0;
            url = new URL(Database.getUrl() + Database.getApikey() + parameter);
            System.out.println(url);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
        } catch (IOException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return connection;
    }

    public static boolean testConnection() {
        try {
            parser = new JSONParser();
            parameter = "/get/";
            connection = getConnection(parameter);
            is = connection.getInputStream();
            theReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((reply = theReader.readLine()) != null) {
                obj = parser.parse(reply);
                System.out.println(reply);
                jsonObject = (JSONObject) obj;
                if (jsonObject.get("sukses").equals("0")) {
                    reply = jsonObject.get("data").toString();
                    DialogHelper.showWarningMessage(reply);
                    return false;
                }
            }
            connection.disconnect();
        } catch (IOException | ParseException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        return true;
    }

}
