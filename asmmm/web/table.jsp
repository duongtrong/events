<%--
  Created by IntelliJ IDEA.
  User: trangduong
  Date: 8/26/2019
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>Events</h1>
    <br>
    <s:a href="form.jsp">Add new Event</s:a>
    <table style="width: 50%;">
        <tr>
            <th>When</th>
            <th>Time</th>
            <th>What are you planning</th>
            <th>Where</th>
            <th>More info</th>
            <th>Action</th>
            <th></th>
        </tr>
        <c:forEach var="eve" items="${listEvent}">
            <tr>
<%--                <td><s:property value="timeDay"/></td>--%>
<%--                <td><s:property value="timeOld"/></td>--%>
<%--                <td><s:property value="planning"/></td>--%>
<%--                <td><s:property value="whereee"/></td>--%>
<%--                <td><s:property value="info"/></td>--%>
                <td>${eve.timeDay}</td>
                <td>${eve.timeOld}</td>
                <td>${eve.planning}</td>
                <td>${eve.whereee}</td>
                <td>${eve.info}</td>
                <td><a href="delete/${eve.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
