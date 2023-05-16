//author:steam-404
//添加访问者信息
package com.jian.main.userMessage;

import java.sql.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addUserMessage {
    @RequestMapping(value = "/addUser")
    public void addUser(
//            接收url参数
            @RequestParam String ipAddress,
            @RequestParam String address,
            @RequestParam String browser,
            @RequestParam String system
    ) throws SQLException {
        System.out.println(ipAddress);
        System.out.println(address);
        System.out.println(browser);
        System.out.println(system);

        //接口测试数据
        //localhost:8080/addUser?ipAddress=localhost&address=建建的服务器&browser=Edge 113.0.1774.42&system=windows11
        SQLMessage(ipAddress, address, browser, system);
    }

    //    向数据库添加信息
    public void SQLMessage(String ipAddress, String address, String browser, String system) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String SQL = "insert into blog.access(data, ipAddress, address, browser, `system`)" +
                "values (now(), '" + ipAddress + "','" + address + "','" + browser + "','" + system + "');";
        statement.execute(SQL);
        statement.close();
        connection.close();
    }
}