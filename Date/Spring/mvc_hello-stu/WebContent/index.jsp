<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
<%-- 		<a href="${ pageContext.request.contextPath }/hello">hello(访问服务器。转发到WebContent/jsp/target.jsp页面)</a> --%>
		
		<form action="${ pageContext.request.contextPath }/param4" method="post">
			<input type="submit" />
		</form>
	</body>
</html>