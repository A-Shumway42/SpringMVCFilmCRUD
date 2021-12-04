<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Film Query</title>
</head>
<body>
	<h3>Search Database</h3>
	<form action="IdSearch.do" method=GET>
		Search Film ID #: <input type="text" name="filmId" /> <input
			type="submit" value="Search ID" />
	</form>
	<form action="KeySearch.do" method=GET>
		Keyword Search: <input type="text" name="filmId" /> <input
			type="submit" value="Search Keyword" />
	</form>
	<br>
	<h3>Edit Database</h3>
	<tr>
		<a href="addFilm">Add Film</a>
		<a href="deleteFilm">Delete Film</a>
		<a href="searchFilmID">Search Film by ID</a>
</body>
</html>