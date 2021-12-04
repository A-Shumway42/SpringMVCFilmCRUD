<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Film</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty film}">
			<ul>
				<li>${film.filmId}</li>
				<li>${film.title}</li>
				<li>${film.description}</li>
				<li>${film.languageId}</li>
				<li>${film.rentalPeriod}</li>
				<li>${film.rentalRate}</li>
				<li>${film.replacementCost}</li>
			</ul>
		</c:when>
		<c:otherwise>
			<p>No film found</p>
		</c:otherwise>
	</c:choose>
	<a href="deleteFilm">Delete Film</a>
</body>
</html>