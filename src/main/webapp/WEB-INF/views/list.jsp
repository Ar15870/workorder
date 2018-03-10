<%--
  Created by IntelliJ IDEA.
  User: petersuen
  Date: 11/19/17
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>企业工单列表</h1>
<table border="1">
    <tr>
        <td>工单编号</td>
        <td>项目名称</td>
        <td>执行人</td>
        <td>任务描述</td>
        <td>级别</td>
        <td>创建时间</td>
    </tr>
    <c:forEach items="${workOrders}" var="workOrder">
        <tr>
            <td>${workOrder.id}</td>
            <td>${workOrder.project.id}</td>
            <td>${workOrder.executor}</td>
            <td>${workOrder.description}</td>
            <td>${workOrder.orderLevel}</td>
            <td>${workOrder.createDate}</td>
        </tr>
    </c:forEach>
</table>

<a href="/workorder">首页</a>
</body>
</html>
