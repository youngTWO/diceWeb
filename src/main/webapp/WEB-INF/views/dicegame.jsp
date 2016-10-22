<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Dice game</title>
</head>
<body>
<h2>DICE VIEW</h2>

	<!-- 
	<script type="text/javascript">
		function rollButtonClicked() {
			
			var face1 = parseInt(Math.random()*6+1);
			var face2 = parseInt(Math.random()*6+1);

			document.getElementById("faceValue1").value = face1.toString();
			document.getElementById("faceValue2").value = face2.toString();	
		}
	</script>
	 -->
	 
	 
	<form action="http://localhost:8080/youngseo/dicegame" method="get">
		<table>
			<tr>
				<td>${diceService.getPlayerName()}:</td>
				<td>${diceService.getCurCellPos1()} </td>
				<td>${diceService.getPlayerName()}-face value :</td>
				<td>${diceService.getFaceValue1()}</td>
				<td>AlphaDice-face value :</td>
				<td>${diceService.getFaceValue2()}</td>
			</tr>
			<tr>
				<td>AlphaDice:</td>
				<td>${diceService.getCurCellPos2()}</td>
			</tr>
		</table>

		<input type="submit" name="roll" value="Roll" />
		<input type="button" onclick="window.close()" value="Exit" />
	</form>

</body>
</html>