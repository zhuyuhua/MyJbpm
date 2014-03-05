<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>jbpm请假流程---老板处理</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>
	<s:debug></s:debug>
	<body>
		<fieldset>
			<legend>
				老板审核
			</legend>
			<form action="submitBoss.html" method="post">
				<input type="hidden" name="id" value="${param.id}">
				申请人：
				<s:property value="map['owner']" />
				<br />
				请假时间：
				<s:property value="map['day']" />
				<br />
				请假原因：
				<s:property value="map['reason']" />
				<br />
				姓名：
				<s:property value="map['name']" />
				<br />
				性别：
				<s:property value="map['sex']" />
				<br />
				年龄：
				<s:property value="map['address']" />
				<br />
				<input type="submit" />
			</form>
		</fieldset>
	</body>
</html>
