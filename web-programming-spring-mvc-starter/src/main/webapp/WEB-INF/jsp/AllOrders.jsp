<%--
  Created by IntelliJ IDEA.
  User: k1ko
  Date: 12/3/15
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="AllOrders">
    <table>
        <c:forEach items="${orders}" var="o">
            <tr>
                <td>${o.id} </td>
                <td>${o.clientName} </td>
                <td>${o.clientAddress} </td>
            </tr>
        </c:forEach>
    </table>
</form>


</body>
</html>
