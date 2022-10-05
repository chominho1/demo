<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text.html; charset=EUC-KR">
    <title>롤 프로게이머</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>이름</th>
                <th>닉네임</th>
                <th>포지션</th>
            </tr>
        </thead>
        <a href="login">연습 페이지로 이동하기</a>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td>${member.id}</td>
                    <td>${member.name}</td>
                    <td>${member.value}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>


