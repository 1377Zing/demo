package com.denny.user.severlet;

import com.denny.user.dao.UserDao;
import com.denny.user.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletUserRegister {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        // 设置编码格式为 UTF-8
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String userProvince = request.getParameter("userProvince");
        String userCity = request.getParameter("userCity");
        String userSex = request.getParameter("userSex");
        String userDescribe = request.getParameter("userDescribe");
        String userHobby[] = request.getParameterValues("userHobby");
        // 前台得到 用户输入数据
        String str = "";
        for (int i = 0; i < userHobby.length; i++) {
            str = str + userHobby[i];
            // 得到每个元素
            if (i != (userHobby.length - 1)) {
                str += ",";
                // 如果不为最后一个元素，将其尾部加一个‘,’隔开
            }
        }
        // for 循环拼接爱好数组中的数据

        UserVo user = new UserVo();
        // 实例化一个VO对象
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserProvince(userProvince);
        user.setUserCity(userCity);
        user.setUserHobby(str);
        user.setUserSex(userSex);
        user.setUserDescribe(userDescribe);
        // 将前台得到的数据存入ＶＯ
        UserDao userDao = new UserDao();
        // 实例化一个数据库操作对象
        userDao.insertUser(user);
        // 调用增加用户方法
        request.getRequestDispatcher("/userlogin.jsp").forward(request,
                response);
        // 转到登录页面
    }
}
