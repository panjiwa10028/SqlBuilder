package com.LoadJson;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface ImplementPhoenix {
    
    public List<String> getTabel(String parameter);
    
    public DefaultTableModel getColumn(String parameter);
    
    public DefaultTableModel getData(String parameter);
    
}
