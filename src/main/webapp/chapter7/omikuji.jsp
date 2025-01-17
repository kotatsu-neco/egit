<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
    <title>おみくじ</title>
</head>
<body>
    <h1>おみくじ結果</h1>
    <%
    // おみくじの選択肢
    String[] omikuji = { "大吉", "中吉", "小吉", "吉", "末吉", "凶" };

    // ランダムでおみくじを引く
    int index = (int) (Math.random() * omikuji.length);
    String result = omikuji[index];
    %>
    <p>
        あなたの運勢は「<strong><%=result%></strong>」です！
    </p>

    <form action="omikuji.jsp" method="post">
        <button type="submit">もう一度引く</button>
    </form>
</body>
</html>
