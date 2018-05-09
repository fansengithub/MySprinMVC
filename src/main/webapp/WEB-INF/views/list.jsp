<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2018/5/9
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty requestScope.employees}">
    没有任何员工信息。
</c:if>
<c:if test="${!empty requestScope.employees}">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>LastName</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Department</th>
            <th>Edit</th>
            <th>Delete</th>

        </tr>
        <c:forEach items="${requestScope.employees}" var="emp">
            <tr>${emp.id}</tr>
            <tr>${emp.lastName}</tr>
            <tr>${emp.email}</tr>
            <tr>${emp.gender == 0 ? 'Female':'Male'}</tr>
            <tr>${emp.department.departmentName}</tr>
            <tr><a href="">Edit</a></tr>
            <tr><a href="">Delete</a></tr>

        </c:forEach>
    </table>

</c:if>


</body>
</html>
