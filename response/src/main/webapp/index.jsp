<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<%--这里提交的路径，需要寻找到项目的路径--%>
<%--${pageContext.request.contextPath}代表当前项目--%>
<form action="<%=request.getContextPath()%>/login" method="get">
    用户名:<input type="text" name="username"> <br>
    密码:<input type="password" name="password"> <br>
    <input type="submit">
</form>
</body>
</html>
