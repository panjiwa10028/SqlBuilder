package com.LoadJson;

import com.RestApi.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface ImplementMysql {
    
    public List<String> getTabel(String param);
    
    public DefaultTableModel getColumn(String param);
    
    public DefaultTableModel getColumnSql(String param);
    
    public DefaultTableModel getData(String param);
    
    public DefaultTableModel getDataSql(String param);
    
}
