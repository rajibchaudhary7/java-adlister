<%--
  Created by IntelliJ IDEA.
  User: rajibchaudhary
  Date: 12/16/22
  Time: 2:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="login"/>
</form>
<%
String uname = request.getParameter("username");
String pwd = request.getParameter("password");
    if (uname != null && pwd != null) {

        if (uname.equals("admin") && pwd.equals("password")) {
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

%>

</body>
</html>
