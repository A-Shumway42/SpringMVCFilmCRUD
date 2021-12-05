<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<c:if test="${deletedConfirm}">
		<c:choose>
			<c:when test="${isFilmDeleted}">
				<div>
					<h2>Film Deleted!</h2>
					<form action="home.do">
						<input type="submit" value="Home">
					</form>
				</div>
			</c:when>
			<c:when test="${!isFilmDeleted}">
				<div>
					<h2>Film can't be deleted!</h2>
					<form action="home.do">
						<input type="submit" value="Home">
					</form>
				</div>
			</c:when>
		</c:choose>
	</c:if>

	<c:if test="${updateConfirm}">
		<c:choose>
			<c:when test="${isFilmUpdated}">
				<div>
					<h2>Film Updated!</h2>
					<form action="home.do">
						<input type="submit" value="Home">
					</form>
				</div>
			</c:when>
			<c:when test="${!isFilmUpdated}">
				<div>
					<h2>Film can't be updated!</h2>
					<form action="home.do">
						<input type="submit" value="Home">
					</form>
				</div>
			</c:when>
		</c:choose>
	</c:if>
</body>
</html>