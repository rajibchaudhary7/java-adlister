<%--
  Created by IntelliJ IDEA.
  User: rajibchaudhary
  Date: 1/3/23
  Time: 4:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Ads</title>
</head>
<body>
    <h1>List of all the Ads</h1>
    <c:forEach var="ad" items="${ads}">
        <h3>${ad.title}</h3>
        <p>${ad.description}</p>
    </c:forEach>

</body>
</html>
