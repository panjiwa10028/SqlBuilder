package com.Utility;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Validasi {

    public boolean cekAngka(String data) {
        return data.matches("[0-9][.]*");
    }
    
    public boolean cekTitik(String data) {
        return data.matches(".");
    }
    
    public boolean cekKoma(String data) {
        return data.matches(",");
    }
    
    public boolean cekHuruf(String data) {
        return data.matches("[A-Z]*");
    }
    
    public boolean cekEmail(String data){
        return data.matches("[@]");
    }

    public void limitTextFieldChar(JTextField field, final int numChar) {
        if (numChar == 0) {
            field.setDocument(new PlainDocument());
            return;
        }

        PlainDocument pd = new PlainDocument() {

            private static final long serialVersionUID = 1L;
            private final int limit = numChar;

            @Override
            public void insertString(int offs, String str, AttributeSet a)throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a);
                }
            }
        };
        field.setDocument(pd);
    }
    
    public void limitTextAreaChar(JTextArea field, final int numChar) {
        if (numChar == 0) {
            field.setDocument(new PlainDocument());
            return;
        }

        PlainDocument pd = new PlainDocument() {

            private static final long serialVersionUID = 1L;
            private final int limit = numChar;

            @Override
            public void insertString(int offs, String str, AttributeSet a)throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a);
                }
            }
        };
        field.setDocument(pd);
    }
}
