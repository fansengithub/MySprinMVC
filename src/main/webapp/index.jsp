<html>
<body>
<h2>Hello World!</h2>
<br><br>

<a href="emps">List All Employees</a>
<br><br>

<a href="/springmvc/testRedirect">testRedirect</a>
<br><br>

<a href="/springmvc/testView">test View</a>
<br><br>

<%--
    模拟修改操作：
    1，原始数据：1 tom 123456 aa 24
    2, 密码不能被修改
    3，表单回显，模拟操作直接在表单填写对应属性值.
--%>
<form action="/springmvc/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1"/>
    username:<input type="text" name="username" value="tom"/>
    <br>
    email:<input type="text" name="email" value="123456"/>
    <br>
    age:<input type="text" name="age" value="23"/>
    <br>
    <input type="submit" value="Submit"/>
</form>
<br><br>
<a href="/springmvc/testSessionAttributes">testSessionAttributes</a>
<br><br>
<a href="/springmvc/testMap">testMap</a>
<br><br>
<a href="/springmvc/testModelAndView">testModelAndView</a>
<br><br>
<a href="/springmvc/testServletAPI">testServletAPI</a>
<br><br>
<form  action="/springmvc/testPOJO" method="post">
username:<input type="text" name="username"/>
    <br>
password:<input type="text" name="password"/>
    <br>
    email:<input type="text" name="email">
    <br>
    age:<input type="text" name="age">
    <br>
    city:<input type="text" name="address.city">
    <br>
    province:<input type="text" name="address.province">
    <br>
    <input type="submit" value="submit">
</form>
<br><br>
<a href="springmvc/testRequestParam?useranme=fansen&age=24"> testRequestParam</a>

<br><br>


<form action="/springmvc/testRest" method="post">
    <input type="hidden"  name="_method" value="put"/>

    <input type="submit"  value="testRest put"/>
</form>
<br><br>

<form action="/springmvc/testRest" method="post">
    <input type="hidden"  name="_method" value="delete"/>

    <input type="submit"  value="testRest delete"/>
</form>
<br><br>

<form action="/springmvc/testRest" method="post">
    <input type="submit"  value="testRest post"/>
</form>
<br><br>

<a href="springmvc/testRest/1"> testRest get</a>

<br><br>


<a href="springmvc/testPathVariable/1"> testPathVariable</a>

<br><br>


<a href="springmvc/testParamsAndHeaders?username=www&age=10"> testParamsAndHeaders</a>

<br><br>

<form action="/springmvc/testMethod" method="post">
    <input type="submit"  value="submit"/>
</form>
<br><br>


<a href="springmvc/testMethod">Test testMethod</a>

<br><br>

<a href="springmvc/testRequestMapping">Test RequestMapping</a>

<br><br>
<a href="helloworld">Hello World</a>


</body>
</html>
