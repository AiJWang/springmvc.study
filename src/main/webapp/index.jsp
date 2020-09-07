<%--
  Created by IntelliJ IDEA.
  User: wangaijun
  Date: 2020/9/2
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc</title>
</head>
<body>
<p>入门程序</p>
<p><a href="some.do">发起some.do的get请求</a> </p>
<p><a href="param/some.do">发起some.do的get请求</a> </p>
<br/>
<form action="test/some.do" method="post">
    <input type="submit" value="post请求 test/some.do">
</form>

<!--逐个接收参数，此时参数名称name、age必须与后端一致-->
<form action="param/receiveOne.do" method="post">
    <input type="text" name="name"><br/>
    <input type="text" name="age">
    <input type="submit" value="post请求 Param/RecParamOne.do">
</form>
<!--@RequestParam注解使用，此时参数名称可与后端不一致-->
<form action="param/receiveOne1.do" method="post">
    <input type="text" name="rname"><br/>
    <input type="text" name="rage">
    <input type="submit" value="post请求 Param/RecParamOne.do">
</form>
</body>
</html>
