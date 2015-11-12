<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<h1>前台传递参数至后台</h1>
	<h2>使用@RequestParam("name1")String name 方式传参</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=test1">
		renyua:<input type="text" name="name1" id="name1"> author:<input
			type="text" name="author1" id="author1"> <input type="submit"
			value="Add">
	</form>
	
	<h2>Spring会自动将表单参数注入到方法参数，和表单的name属性保持一致。和Struts2一样</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=test2">
		renyua:<input type="text" name="name2" id="name2"> author:<input
			type="text" name="author2" id="author2"> <input type="submit"
			value="Add">
	</form>
	
	<h2>使用HttpServletRequest获取</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=test3">
		renyua:<input type="text" name="name3" id="name3"> author:<input
			type="text" name="author3" id="author3"> <input type="submit"
			value="Add">
	</form>
	
	<h2>使用model——VO注入</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=test4">
		renyua:<input type="text" name="name" id="name"> author:<input
			type="text" name="sex" id="sex"> <input type="submit"
			value="Add">
	</form>
	
	<h1>向jsp页面传值</h1>
	<h2>使用ModelAndView对象</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=testToJsp1">
		renyua:<input type="text" name="name" id="name"> author:<input
			type="text" name="sex" id="sex"> <input type="submit"
			value="Add">
	</form>
	
	<h2>ModelMap参数</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=testToJsp2">
		renyua:<input type="text" name="name" id="name"> author:<input
			type="text" name="sex" id="sex"> <input type="submit"
			value="Add">
	</form>
	
	<h2>使用@ModelAttribute</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=testToJsp3">
		renyua:<input type="text" name="name" id="name"> author:<input
			type="text" name="sex" id="sex"> <input type="submit"
			value="Add">
	</form>
	
	<h2>Session存储</h2>
	<form method="post" action="<%=request.getContextPath()%>/welcome.do?method=testToJsp4">
		renyua:<input type="text" name="name" id="name"> author:<input
			type="text" name="sex" id="sex"> <input type="submit"
			value="Add">
	</form>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>
