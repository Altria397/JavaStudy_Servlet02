<%--
  Created by IntelliJ IDEA.
  User: 11581
  Date: 2023/9/13
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工信息表</title>
</head>
<body>
<table>
    <th><td>员工编号</td><td>员工姓名</td><td>操作</td></th>
    <c:forEach items="${empList}" var="emp">
        <tr><td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td><a href="<%=request.getContextPath()%>/empInfo.a?empno=${emp.empno}">详情</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
