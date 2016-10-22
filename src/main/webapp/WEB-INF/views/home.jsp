<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Dice game Home</title>
</head>
<body>
	<h1>DICE GAME</h1>

	<form action="http://localhost:8080/youngseo/dicegame" method="get">
		<input type="text" name="name" /> 
		<input type="submit" value="Play" /> <br/>
		
		<input type="button" name="configure" onclick="location.href='configure'" value="Configure" />
		<input type="button" onclick="window.close();" value="Exit" />
	</form>
</body>
</html>
