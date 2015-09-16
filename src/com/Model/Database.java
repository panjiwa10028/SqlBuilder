package com.Model;

public class Database {
    
    private String dbNama, dbSelect, ip, port, tableName, limit;
    private static String url;
    private static final String apikey = "123456";

    public Database() {
    }   

    public String getDbNama() {
        return dbNama;
    }

    public void setDbNama(String dbNama) {
        this.dbNama = dbNama;
    }

    public String getDbSelect() {
        return dbSelect;
    }

    public void setDbSelect(String dbSelect) {
        this.dbSelect = dbSelect;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Database.url = url;
    }
    
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public static String getApikey() {
        return apikey;
    }   
}