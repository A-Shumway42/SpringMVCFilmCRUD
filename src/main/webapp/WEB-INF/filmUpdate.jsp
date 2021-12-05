<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Film Update</title>
</head>
<body>

	<h1>Update:</h1>
	<form action="updateFilm.do" method=GET>
		<label for="filmID">Film ID:</label> <input type="text" name="filmID" value="${film.filmId}" required /> <br> 
			
		<label for="title">Title:</label> <input type="text" name="title" value="${film.title}" required /> <br>
		
		<label for="description">Description:</label> <input type="text" name="description" value="${film.description}"  /> <br>
		
		<label for="releaseYear">Release Year:</label> <input type="text" name="releaseYear" value="${film.releaseYear}"  /> 
		
		<label for="languageId">Language ID#:</label> <input type="text" name="languageId" value="${film.languageId}" required />
		<ol>
			<li>English</li>
			<li>Italian</li>
			<li>Japanese</li>
			<li>Mandarin</li>
			<li>French</li>
			<li>German</li>
		</ol>
		
		<label for="rentalPeriod">Rental Duration:</label> <input type="text" name="rentalPeriod" value="${film.rentalPeriod}" required /> <br>
		
		<label for="rentalRate">Rental Rate:</label> <input type="text" name="rentalRate" value="${film.rentalRate}" required /> <br>
		
		<label for="length">Length:</label> <input type="text" name="length" value="${film.length}"  /> <br>
		
		<label for="replacementCost">Replacement Cost:</label> <input type="text" name="replacementCost" value="${film.replacementCost}" required /> <br>
		
		<label for="rating">Rating:</label> <input type="text" name="rating" value="${film.rating}"  /> <br>
		
		<label for="specialFeatures">"Special Features":</label> <input type="text" name="specialFeatures" value="${film.specialFeatures}"  />	<br> 
		
		<form action="updateFilm.do">
			<input type="submit" value="Update Film" />
		</form>
	</form>
	<br> 
	
	<!-- Homepage link -->
	<form action="home.do">
		<input type="submit" value="Back">
	</form>

</body>
</html>