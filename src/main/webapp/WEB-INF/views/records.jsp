<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${records}" var="record">
    <div>
        <span>${record.id}</span>
        <span>${record.name}</span>
        <span>${record.description}</span>
    </div>
</c:forEach>
</body>
</html>
