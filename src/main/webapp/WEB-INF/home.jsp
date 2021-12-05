<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Film Query</title>
</head>
<body>
	<h3>Search Database</h3>
	<form action="IdSearch.do" method=GET>
		Search Film ID #: <input type="number" name="filmId" /> <input
			type="submit" value="Search ID" />
	</form>
	<form action="KeySearch.do" method=GET>
		Keyword Search: <input type="text" name="keyWord" /> <input
			type="submit" value="Search Keyword" />
	</form>
	<br>
	<h3>Edit Database</h3>
	<tr>
		<form action="addFilmForm.html">
			<input type="submit" value="Add Film">
		</form>
	</tr>
	<tr>
		<form action="filmUpdate">
			<input type="submit" value="Update Film">
		</form>
	</tr>
</body>
</html>