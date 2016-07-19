<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Products</title>
<link rel="stylesheet"
	href='webjars/bootstrap/3.1.0/css/bootstrap.min.css' />
</head>
<body>
	<div class="thumbnail">
		<h4>${product.name}</h4>
		<div class="caption">${product.description}</div>
	</div>
</body>
</html>