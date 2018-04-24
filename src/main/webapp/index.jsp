<html>
<body>
<h2>Hello World!</h2>
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
