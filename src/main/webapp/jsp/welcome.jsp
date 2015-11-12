<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'hello.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
</head>
<body>
	<h2>使用ModelAndView对象</h2>
	${sysperson.getName()}
	
	<h2>ModelMap参数</h2>
	${sysperson.getName()}---------------${sex}

	<h2>使用@ModelAttribute</h2>
	${sysperson.getSex()} ++++++++++${sysperson.getName()}
	
	<h2>Session存储</h2>
	${model.getSex()} --------------------------${sysperson.getName()}
</body>
</html>
