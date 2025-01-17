<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<form action="search3" method="post">
<p>下記から選択してください。</p>
<select name="name" required>
<option value="" selected disabled>選択してください</option>
<option value="赤貝">赤貝</option>
<option value="あなご">あなご</option>
<option value="アボガド巻">アボガド巻</option>
<option value="いか">いか</option>
<option value="いくら">いくら</option>
<option value="うに">うに</option>
<option value="えび">えび</option>
<option value="えんがわ">えんがわ</option>
<option value="サーモン">サーモン</option>
<option value="サラダ軍艦">サラダ軍艦</option>
<option value="たまご">たまご</option>
<option value="つぶ貝">つぶ貝</option>
<option value="トロ">トロ</option>
<option value="ねぎとろ巻">ねぎとろ巻</option>
<option value="ねぎとろ軍艦">ねぎとろ軍艦</option>
<option value="ほたて">ほたて</option>
<option value="まぐろ">まぐろ</option>
</select>
<input type="submit" value="検索">
</form>

<%@include file="../footer.html" %>
