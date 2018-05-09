<%--
  Created by IntelliJ IDEA.
  User: k1ko
  Date: 12/3/15
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form method="get" action="ViewPizzas">
    <ol>
        <c:forEach var="pizza" items="${pizzas}" >
            <li>${pizza.getType()}</li>
        </c:forEach>
    </ol>
</form>

<form method="POST" action="ViewPizzas" >

    <h5>Enter pizza name:</h5>
    <input type="text" name="pizzatype" />
    <br/>
    <br/>
    <input type="SUBMIT" value="Submit">
</form>
</body>
</html>
