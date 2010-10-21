package com.xu81.lgtools.avg.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xu81.lgtools.avg.view.InfoView;

public class DbUtil {

    private static Connection conn = null;
    private static final String CLASSNAME = "org.sqlite.JDBC";
    private static final String DBURL = "jdbc:sqlite:d:/lgavgtools.db";

    public static Connection conn() {
        try {
            Class.forName(CLASSNAME);
            conn = DriverManager.getConnection(DBURL);
        } catch (ClassNotFoundException e) {
            InfoView.showInfo("无法获得数据库驱动，请重新下载软件。", InfoView.ERROR);
            e.printStackTrace();
        } catch (SQLException e) {
            InfoView.showInfo("数据库连接出错，请重新下载软件。", InfoView.ERROR);
            e.printStackTrace();
        }
        return conn;
    }
}
