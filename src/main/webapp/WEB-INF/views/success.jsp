<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2018/4/23
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4>success page</h4>
time:${requestScope.time}
<br><br>
name:${requestScope.names}
<br><br>
request user:${requestScope.user}
<br><br>
session user:${sessionScope.user}
<br><br>
request school:${requestScope.scool}
<br><br>
session school:${sessionScope.scool}
<br><br>
</body>
</html>
