<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="index" method="get">
		文档分类： 
		<select name="categoryId">
			<c:forEach var="c" items="${categorys}">
				<c:if test="${c.id == categoryId}">
					<option selected="selected" value= "${c.id }">${c.name}</option>
				</c:if>
				<c:if test="${c.id != categoryId}">
					<option value= "${c.id }">${c.name}</option>
				</c:if>
		   </c:forEach>
		</select>
		<button type="submit">查询</button>
	</form>
	<button>
		<a href="add?categoryId=${param.categoryId}">新增电子文档</a>
	</button>
	<table border="1">
		<tr>
			<td colspan="6"><h1>电子文档列表</h1></td>
		</tr>
		<tr>
			<th>文档编号</th>
			<th>文档名称</th>
			<th>文档摘要</th>
			<th>上传人</th>
			<th>上传时间</th>
			<th>操作</th>
		</tr>
	
		<c:forEach var="c" items="${entrys}">
			<tr>
				<td>${c.id}</td>
				<td>${c.title}</td>
				<td>${c.summary}</td>
				<td>${c.uploaduser}</td>
				<td>${c.createdate }</td>
				<td><a href="fetchById?id=${c.id}">修改</a><a href="delete?id=${c.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>