<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addSave" method="post">
		<input type="hidden" name="entry.category.id" value="${param.categoryId}">
		<table>
			<tr>
				<td colspan="2"><h1>增加电子文档</h1></td>
			</tr>
			<tr>
				<th>文档名称(*)</th>
				<td><input type="text" name="entry.title"></td>
			</tr>
			<tr>
				<th>文档摘要</th>
				<td><textarea   name="entry.summary"></textarea></td>
			</tr>
			<tr>
				<th>上传人</th>
				<td><input type="text" name="entry.uploaduser"></td>
			</tr>
			<tr>
				<th>上传时间(*)</th>
				<td><input type="text" name="entry.createdate">(yyyy-MM-dd)</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">提交</button>
					<button>
						<a href="index">返回</a>
					</button>
				</td>
			</tr>

		</table>
	</form>
</body>
</html>