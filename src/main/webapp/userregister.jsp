<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2023/7/13
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="servlet/ServletUserRegister" method="post">
    <table align = "center" border="1" style="border-collapse: collapse;">
        <tr>
            <td colspan="2">用户注册</td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="userName" /></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="userPassword" /></td>
        </tr>
        <tr>
            <td>地址：</td>
            <td>
                <select name="userProvince" id="userProvince" onchange="addCity()"></select>省
                <select name="userCity" id="userCity"></select>市
                <!-- 此处是省市联动，具体javascript的代码实现请参见 html+js实现城市联动、日期联动示例 -->
            </td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                <input type="radio" name="userSex" value="男" checked="checked" />男
                <input type="radio" name="userSex" value="女" />女
            </td>
        </tr>
        <tr>
            <td>爱好：</td>
            <td>
                <input type="checkbox" name="userHobby" value="篮球" />篮球
                <input type="checkbox" name="userHobby" value="足球" />足球
                <input type="checkbox" name="userHobby" value="羽毛球" />羽毛球
                <input type="checkbox" name="userHobby" value="跑步" />跑步
            </td>
        </tr>
        <tr>
            <td>个人描述：</td>
            <td>
                <textarea cols="10" rows="3" name="userDescribe"></textarea>
            </td>
        </tr>
        <tr>
            <td class="tdstyle" colspan="2">
                <input type="submit" value="注册" />
            </td>
        </tr>
    </table>
</form>