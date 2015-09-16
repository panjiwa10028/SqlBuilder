package com.RestApi;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface ImplementPhoenix {
    
    public List<String> getTabel();
    
    public DefaultTableModel getColumn(String parameter);
    
    public DefaultTableModel getData(String parameter, int limit);
    
}
