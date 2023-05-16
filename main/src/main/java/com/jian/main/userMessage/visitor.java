//author:steam-404
//查询访客信息的接口
package com.jian.main.userMessage;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class visitor {
    @RequestMapping("/visitor")
    public  String[] user() throws SQLException {
        String[] message =new String[10];
        String url = "jdbc:mysql://localhost:3306/blog";
        String user = "root";
        String password = "root";
        String SQL = "select * from access;";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);
        int i=0;
        while (resultSet.next()) {
            int ranking = resultSet.getInt("ranking");
            String data = resultSet.getString("data");
            String ipAddress = resultSet.getString("ipAddress");
            String address = resultSet.getString("address");
            String browser = resultSet.getString("browser");
            String system = resultSet.getString("system");
            message[i]=ranking+data+ipAddress+address+browser+system;
            i++;
        }
        resultSet.close();
        statement.close();
        connection.close();
        return message;
    }
}
