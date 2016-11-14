<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Dice game - Configure</title>
</head>
<body>
	<h3>Configure page</h3>
	
	<form action="http://localhost:8080/youngseo/home" method="get">
		Make trap cell! <br/>
		- cell[<input type="text" name="trap1" />] go to cell[<input type="text" name="tvalue1" />] <br/>
		- cell[<input type="text" name="trap2" />] go to cell[<input type="text" name="tvalue2" />] <br/>
		- cell[<input type="text" name="trap3" />] go to cell[<input type="text" name="tvalue3" />] <br/>
		- cell[<input type="text" name="trap4" />] go to cell[<input type="text" name="tvalue4" />] <br/>
		- cell[<input type="text" name="trap5" />] go to cell[<input type="text" name="tvalue5" />] <br/>
	
		<br/>
		Make bonus cell! <br/>
		- cell[<input type="text" name="bonus1" />] go to cell[<input type="text" name="bvalue1" />] <br/>
		- cell[<input type="text" name="bonus2" />] go to cell[<input type="text" name="bvalue2" />] <br/>
		- cell[<input type="text" name="bonus3" />] go to cell[<input type="text" name="bvalue3" />] <br/>
		- cell[<input type="text" name="bonus4" />] go to cell[<input type="text" name="bvalue4" />] <br/>
		- cell[<input type="text" name="bonus5" />] go to cell[<input type="text" name="bvalue5" />] <br/>
	
		<br/>
		<input type="submit" value="OK" />
	</form>
</body>
</html>