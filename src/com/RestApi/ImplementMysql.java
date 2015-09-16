package com.RestApi;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface ImplementMysql {
    
    public List<String> getTabel(String param);
    
    public DefaultTableModel getColumn(String param);
    
    public DefaultTableModel getData(String param, int limit);
    
}
