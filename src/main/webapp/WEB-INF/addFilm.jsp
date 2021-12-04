<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Film</title>
</head>
<body>
	<h1>Add New Film to Database</h1>
	<h3>Provide film details below</h3>
	<form action="AddFilm.do" method=POST>
		<label for="title">Title:</label> <input type="text" name="title" />
		<label for="releaseYear">Release Year:</label> <input type="text"
			name="releaseYear" /> 
		<br>
		<label for="description">Description:</label> <input type="text"
			name="description" />
		<br>
		<label for="language">Language:</label> <input type="text"
			name="language" /> 
			<br>
		<label for="rentalPeriod">Rental Period:</label> <input type="text"
			name="rentalPeriod" /> 
		<label for="rentalRate">Rental Rate:</label> <input type="text"
			name="rentalRate" /> 
		<label for="length">Length:</label> <input type="text"
			name="length" /> 
		<label for="replacementCost">Replacement Cost:</label> <input type="text"
			name="replacemetnCost" /> 
		<label for="rating">Rating:</label> <input type="text"
			name="rating" /> 
		<label for="specialFeatures">Special Features:</label> <input type="text"
			name="specialFeatures" /> 
		
		<input type="submit" value="Add Film" />
	</form>
</body>
</html>