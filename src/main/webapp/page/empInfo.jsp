<%@ page import="com.xxx.entity.Emp" %><%--
  Created by IntelliJ IDEA.
  User: 11581
  Date: 2023/9/13
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工详细信息</title>
</head>
<body>
<%
  Emp emp = (Emp)session.getAttribute("emp");
  out.write("<h2>员工编号:" + emp.getEmpno() + "</h2>");
  out.write("<h2>员工姓名:" + emp.getEname() + "</h2>");
%>
</body>
</html>
