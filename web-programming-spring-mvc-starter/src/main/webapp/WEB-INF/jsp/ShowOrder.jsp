<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: k1ko
  Date: 11/23/15
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>

    <style>
        table, td, tr {
            border: 1px groove lightblue;
        }
    </style>
</head>
<body>

<div style="align-items: center; display: flex; justify-content: center">
    <form>
    <table>
        <thead>
        <th>Име</th>
        <th>Адреса</th>
        <th>Тип Нарачка</th>
        </thead>
        <tr>
            <td>
                ${order.clientName}
            </td>
            <td>
                ${order.clientAddress}
            </td>
            <td>
                ${order.pizza.type}
            </td>
        </tr>
    </table>
    </form>
</div>
</body>
</html>
