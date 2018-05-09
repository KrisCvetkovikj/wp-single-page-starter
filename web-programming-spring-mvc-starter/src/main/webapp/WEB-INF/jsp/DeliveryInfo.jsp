<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <style>
        table, td, tr {
            border: 1px groove lightblue;
        }
    </style>
</head>
<body>
<div style="display: flex; align-items: center; justify-content: center; ">
    <form method="post" action="PlaceOrder" >
        <table>
            <tr >
                <td>Username:</td>
                <td>
                    <input type="text" name="clientName" path="clientName"/>
                </td>
            </tr>
            <tr>
                <td>Address:</td>
                <td>
                    <input type="text" name="clientAddress" path="clientAddress"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
