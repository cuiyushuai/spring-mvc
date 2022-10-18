<%--
  Created by IntelliJ IDEA.
  User: 小帅
  Date: 2022/10/18
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/file" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit">
</form>


<a href="/download">下载</a>
</body>
</html>
