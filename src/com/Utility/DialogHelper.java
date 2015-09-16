package com.Utility;

import javax.swing.JOptionPane;

public class DialogHelper {

    public static void showInformationMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showErrorMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void showWarningMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    public static int showConfirmMessage(String message){
        return JOptionPane.showOptionDialog(null, message, "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yes", "No"}, null);
    }
    
    public static String showInputMessage(String message){
        return JOptionPane.showInputDialog(message, JOptionPane.YES_NO_OPTION);
    }
    
    public static int showYesNoCancelMessage(String message, String a, String b, String c, String d){
        return JOptionPane.showOptionDialog(null, message, "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{a,b,c,d}, null);
    }
}
