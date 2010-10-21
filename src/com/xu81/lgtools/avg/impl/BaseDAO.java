package com.xu81.lgtools.avg.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xu81.lgtools.avg.view.InfoView;

public class BaseDAO {

    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;

    public void close() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                InfoView.showInfo("数据库关闭出错，请重新下载软件。", InfoView.ERROR);
                e.printStackTrace();
            }
            rs = null;
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                InfoView.showInfo("数据库关闭出错，请重新下载软件。", InfoView.ERROR);
                e.printStackTrace();
            }
            stat = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                InfoView.showInfo("数据库关闭出错，请重新下载软件。", InfoView.ERROR);
                e.printStackTrace();
            }
            conn = null;
        }
    }
}
