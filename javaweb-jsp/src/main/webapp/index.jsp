<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<hr>
<%= new java.util.Date()%>
<hr>
<%
int num = 0;
    for (int i = 0; i <= 100; i++) {
        num = num+i;
    }
    out.write("Num="+num);
%>
</body>
</html>
