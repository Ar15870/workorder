<%--
  Created by IntelliJ IDEA.
  User: petersuen
  Date: 11/17/17
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>企业工单管理系统</h1>
    <form action="toAdd" method="post">
        <select name="projectId">
            <c:forEach items="${projects}" var="project" >
                <option value="${project.id}">
                        ${project.projectName}
                </option>
            </c:forEach>
        </select>
        <input type="submit" value="确定" />
    </form>
</body>
</html>
