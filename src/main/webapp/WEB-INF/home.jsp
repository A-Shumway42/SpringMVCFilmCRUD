<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Film Query</title>
</head>
<body>
	<h3>Search Database</h3>
	<form id="1" action="IdSearch.do" method=GET>
		Search Film ID #: <input type="number" name="filmId" /> <input id="1"
			type="submit" value="Search ID" />
	</form>
	<form id="2" action="KeySearch.do" method=GET>
		Keyword Search: <input id="2" type="text" name="keyWord" /> <input
			type="submit" value="Search Keyword" />
	</form>
	
	<form action="filmUpdateButton.do" method=GET>
		Film ID: <input type="text" name="updateFilm" /> <input
			type="submit" value="Film Update" />
	</form>
	<br>
	<h3>Edit Database</h3>
	<tr>
		<form action="addFilmForm.html">
			<input type="submit" value="Add Film">
		</form>
	</tr>

</body>
</html>