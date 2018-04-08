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
	<form action="update" method="post">
		<table>
			<tr>
				<td colspan="2"><h1>更新电子文档</h1></td>
			</tr>
			 <tr>
                <th>文档编号</th>
                <td><input type="text" name="entry.id" readonly="readonly" value="${entry.id}"></td>
            </tr>
			<tr>
				<th>文档名称(*)</th>
				<td><input type="text" name="entry.title" value="${entry.title}"></td>
			</tr>
			<tr>
				<th>上传人</th>
				<td><input type="text" name="entry.uploaduser" value="${entry.uploaduser}"></td>
			</tr>
			<tr>
				<th>文档摘要</th>
				<td><textarea name="entry.summary">${entry.summary}</textarea></td>
			</tr>
			
			<tr>
				<th>上传时间(*)</th>
				<td><input type="text" name="entry.createdate" value="${entry.createdate}">(yyyy-MM-dd)</td>
			</tr>
		</table>
		<button type="submit">提交</button>
		<button>
			<a href="index">返回</a>
		</button>
		
	
	</form>
</body>
</html>