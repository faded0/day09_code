<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户名名回显问题展示</title>
	</head>
	<body>
		<form action="/day10_code/LoginServlet" method="post">
		    用户名:<input type="text" name="username" value="${cookie.username.value }"/><br/>
		   密   码:<input type="password" name="password"/></br/>
		   <input type="submit" value="提交"/>
		</form>
		<a href="/day10_code/SessionServlet"> 测试Session</a>
	</body>
</html>