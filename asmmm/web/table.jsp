<%--
  Created by IntelliJ IDEA.
  User: trangduong
  Date: 8/26/2019
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Events</h1>
    <table>
        <tr>
            <th>When</th>
            <th>Time</th>
            <th>What are you planning</th>
            <th>Where</th>
            <th>More info</th>
        </tr>
        <s:iterator value="events">
            <tr>
                <td><s:property value="timeDay"/></td>
                <td><s:property value="timeOld"/></td>
                <td><s:property value="planning"/></td>
                <td><s:property value="whereee"/></td>
                <td><s:property value="info"/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
