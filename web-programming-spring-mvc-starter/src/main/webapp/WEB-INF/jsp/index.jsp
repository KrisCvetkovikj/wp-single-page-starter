<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: ristes
  Date: 11/9/15
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Pizza Order</title>
</head>
<body>
    <form method="get" action="DeliveryInfo" >

        <c:forEach var="p" items="${pizzas}">
            <input type="radio" name="pizzaType" id="pizzaType" value="${p.type}">
            <label>${p.type}</label>
            <br />
        </c:forEach>
        <br />
        <input type="SUBMIT" value="Submit">
    </form>
</body>
</html>
