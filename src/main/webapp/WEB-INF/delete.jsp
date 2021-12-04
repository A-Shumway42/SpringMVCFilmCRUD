<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deletion Results</title>
</head>
<body>
	<c:if test="${deletedConfirm}">
		<c:choose>
			<c:when test="${isFilmDeleted}">
				<div>
					<h2>Film Deleted!</h2>
				</div>
			</c:when>
			<c:when test="${!isFilmDeleted}">
				<div>
					<h2>Film can't be deleted!</h2>
				</div>
			</c:when>
		</c:choose>
	</c:if>
</body>
</html>