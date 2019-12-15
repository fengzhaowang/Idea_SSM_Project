<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生年月</th>
            <th>课程号</th>
            <th>系别</th>
            <th>专业</th>
            <th>家庭住址</th>
        </tr>
        <c:forEach items="${student}" var="c">
            <tr>
                <td>${c.sno}</td>
                <td>${c.sname}</td>
                <td>${c.ssex}</td>
                <td>${c.sbirthday}</td>
                <td>${c.classno}</td>
                <td>${c.sdept}</td>
                <td>${c.speciality}</td>
                <td>${c.sadress}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
