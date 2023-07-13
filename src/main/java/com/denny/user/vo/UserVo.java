package com.denny.user.vo;

public class UserVo {
    private int userId;
    // 用户Id
    private String userName ;
    // 用户姓名
    private String userPassword;
    // 用户密码
    private String userProvince;
    // 用户省份
    private String userCity;
    // 用户城市
    private String userSex;
    // 用户性别
    private String userHobby;
    // 用户爱好
    private String userDescribe;
    // 用户描述
    private int userDisplay;
    // 用户状态

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }

    public void setUserDescribe(String userDescribe) {
        this.userDescribe = userDescribe;
    }

    public void setUserDisplay(int userDisplay) {
        this.userDisplay = userDisplay;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public String getUserDescribe() {
        return userDescribe;
    }

    public int getUserDisplay() {
        return userDisplay;
    }



}