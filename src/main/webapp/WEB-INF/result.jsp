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
			<h1>Film Details</h1>
			<ul>
				<li>${film.title}</li>
				<li>ID - ${film.filmId}</li>
				<li>${film.description}</li>
				<li>${film.language}</li>
				<li>${film.rentalPeriod}</li>
				<li>${film.rentalRate}</li>
				<li>${film.replacementCost}</li>
				<li>${film.rating}</li>
				<h3>Cast</h3>
				<c:forEach var="f" items="${actors}">
					<li>${f.toString()}</li>
				</c:forEach>
			</ul>
			<form action="deleteFilm.do">
				<input type="submit" value="Delete Film">
			</form>
			<br>
			<form action="updateFilmForm.do">
				<input type="submit" value="Update Film"> <input
					style="display: none" name="filmId" value="${film.filmId}">
			</form>
			<br>
			<form action="home.do">
				<input type="submit" value="Back">
			</form>
		</c:when>
		<c:when test="${! empty films}">
			<ul>
				<c:forEach var="f" items="${films}">
					<br>
					<h4>${f.title}</h4>
					<li>ID - ${f.filmId}</li>
					<li>${f.description}</li>
					<li>${f.language}</li>
					<li>${f.rentalPeriod}</li>
					<li>${f.rentalRate}</li>
					<li>${f.replacementCost}</li>
					<li>${f.rating}</li>
					<h3>Cast</h3>
					<c:forEach var="x" items="${f.actors}">
						<li>${x.toString()}</li>
						<br>
					</c:forEach>
					<form action="updateFilmForm.do">
						<input type="submit" value="Update Film"> <input
							style="display: none" name="filmId" value="${f.filmId}">
					</form>
					<br>
					<form action="deleteFilm.do">
						<input type="submit" value="Delete Film"> <input
							style="display: none" name="filmId" value="${f.filmId}">
					</form>
				</c:forEach>
			</ul>
			<br>
			<form action="home.do">
				<input type="submit" value="Back">
			</form>
		</c:when>
		<c:otherwise>
			<p>No film found</p>
			<form action="home.do">
				<input type="submit" value="Back">
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>