	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    Boolean isAdmin = (Boolean) session.getAttribute("isAdmin");
    String path = request.getContextPath();

    if (isAdmin != null && isAdmin) {
        response.sendRedirect(path + "/productList.do");
        return;
    }
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 확인</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	background: #fff;
	padding: 50px;
	flex-direction: column;
	transform-origin: top center;
}

.logo img {
	height: 50px;
	margin-bottom: 30px;
	width: 170px;
}

h2 {
	font-size: 25px;
	color: #5055b1;
	margin-bottom: 10px;
}

p {
	font-size: 15px;
	color: gray;
	margin-bottom: 10px;
}

a {
	font-size: 15px;
	color: gray;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="logo">
		<a href="<%=path%>/index.jsp"> <img
			src="<%=path%>/img/logo_book.svg" alt="교보문고 로고" />
		</a>
	</div>

	<script>
		alert("관리자만 접근 가능합니다.");
		location.href = "<%=path%>/index.jsp";
	</script>

</body>
</html>