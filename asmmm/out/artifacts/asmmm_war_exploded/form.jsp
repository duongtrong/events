<%--
  Created by IntelliJ IDEA.
  User: trangduong
  Date: 8/26/2019
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Form Event</title>
</head>
<body>
<h1>Create event</h1>
<s:form action="store" method="POST">
    <s:textfield type="date" name="event.timeDay" label="When? "/>
    <s:textfield name="event.timeOld"/>
    <s:textfield name="event.planning" label="What are you planning? "/>
    <s:textfield name="event.whereee" label="Where? "/>
    <s:textarea name="event.info" label="More info? "/>
    <s:submit value="Create Event"/>
    <s:reset value="Reset"/>
</s:form>
</body>
</html>
