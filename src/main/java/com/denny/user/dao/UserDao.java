package com.denny.user.dao;

import com.denny.dbmanage.Dbmanage;
import com.denny.user.vo.UserVo;
import java.sql.*;

import java.sql.SQLException;

public class UserDao {
    public void insertUser(UserVo user) {
        // 用户注册方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;

        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "INSERT INTO usertable (user_name,user_password,user_province,user_city,user_sex,user_hobby,user_describe)VALUES('"
                    + user.getUserName()
                    + "','"
                    + user.getUserPassword()
                    + "','"
                    + user.getUserProvince()
                    + "','"
                    + user.getUserCity()
                    + "','"
                    + user.getUserSex()
                    + "','"
                    + user.getUserHobby()
                    + "','"
                    + user.getUserDescribe()
                    + "')";
            sta.executeUpdate(sql);
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(sta, conn);
        }
    }
}
