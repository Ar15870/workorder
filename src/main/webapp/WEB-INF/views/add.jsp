<%--
  Created by IntelliJ IDEA.
  User: petersuen
  Date: 11/19/17
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <h1>添加工单</h1>
    <form action="add" method="post">
        <input type="hidden" name="projectId" value="${projectId}" />
        执行人<input name="executor" /> <br><br>
        任务描述<textarea name="description"></textarea> <br><br>
        级别
        <select name="orderLevel">
            <option value="1">1级</option>
            <option value="2">2级</option>
            <option value="3">3级</option>
        </select> <br><br>
        <input type="submit" value="提交" /> <br>
    </form>
</head>
<body>

</body>
</html>
