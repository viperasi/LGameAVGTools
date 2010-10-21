package com.xu81.lgtools.avg;

import javax.swing.UIManager;

import com.xu81.lgtools.avg.view.MainScreen;

public class Main {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        new MainScreen().setVisible(true);
    }
}
