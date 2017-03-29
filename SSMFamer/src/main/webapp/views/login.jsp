<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<center>
		<table>
			<caption>Show Actor</caption>
			<thead>
				<tr>
					<th>actor_id</th>
					<th>first_name</th>
					<th>last_name</th>
					<th>last_update</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${actor}" var="act">
					<tr>
						<td>${act.actorId}</td>
						<td>${act.firstName}</td>
						<td>${act.lastName}</td>
						<td>${act.lastUpdate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>
