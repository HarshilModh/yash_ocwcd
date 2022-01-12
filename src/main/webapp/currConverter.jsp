<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="currConverter">
		INR: <input type="text" name="inr" /><br> USD: <input
			type="radio" name="curr" value="usd"><br> AUD:<input
			type="radio" name="curr" value="aud"><br> POUND:<input
			type="radio" name="curr" value="pound"><br> <input
			type="submit" value="convert" /><br>


	</form>
	<br>

  <%
  int amount=0;
  	if(request.getAttribute("convertedAmount")==null){
  		out.print("Null value");
  	}
  	else{
  	amount=(Integer)request.getAttribute("convertedAmount");
  
   		
  		
  			out.print(amount);
  		

  		}%>
  Amount:><%=amount%>
</body>
</html>