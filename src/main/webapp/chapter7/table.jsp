<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>動的なテーブルの生成</h1>
	<table border="1">
		<thead>
			<tr>
				<th>#</th>
				<th>値</th>
			</tr>
		</thead>
		<tbody>
			<%
			// テーブルの行数を指定
			int rows = 5;

			// for文でテーブル行を生成
			for (int i = 1; i <= rows; i++) {
			%>
			<tr>
				<td><%=i%></td>
				<!-- 行番号を出力 -->
				<td>値 <%=i%></td>
				<!-- 値を出力 -->
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>