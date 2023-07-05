<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Customer Form</title>
<link rel="stylesheet" href="/Peony_Beats/styles/main.css">
</head>


<body>

<nav class = "navbar">


        <ul>
        <li><a href = "# ">Order Form</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Tea_Serv ">Teas</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Movie_Serv">Movies</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Game_Serv">Video Games</a></li>
		<li><a href  = " http://localhost:8080/Peony_Beats/Audio_Serv">Audio Books</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Music_Serv">Music</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Beats_Serv">Books</a></li>


	   </ul>

     </nav>


<h1>Peony Beats-Order Form</h1>

	  <a href = "index.jsp"><img src = "http://www.meemostail.xyz/PB-Images/logos/Peony Logo.png" alt =" Peony Logo" class = "peony"></a>

	<hr>

<h3>Please Enter The Following Information</h3>
 
<form action="Cust_Serv" method="POST">



<fieldset>

<legend>Customer Information</legend>



<label id ="fname">First Name:</label>
<input type="text" name="f_name" id ="f_name" autofocus required size="25">

<label id="lname">Last Name:</label>
<input type="text" name="l_name"id ="l_name"  autofocus required size="25"><br>

<label id ="address">Address:</label>
<input type="text" name="address" id ="address"  autofocus required size="25">

<label id ="phones">Phone:</label>
<input type="text" name="phone" id ="phone" placeholder="put in 9999" required size="25"><br>

<label id ="emails">Email:</label>
<input type="text" name="email" id="email" autofocus required size="25">

<label id ="cities">City:</label>
<input type="text" name="city" id="city" autofocus required size="25"><br>

<label id ="states">State:</label>
<input type="text" name="state" id="state" autofocus required size="25">

<label id="zips">Zip:</label>
<input type="text" name="zip" id="zip" autofocus required size="25"><br>

<label id="card_infos">CC:</label>
<input type="text" name="card_info" id="card_info" autofocus required size="25"><br>

<input type="submit" name="submission"  id= "submission" value="Submit" width="100" height="42">

</fieldset>

</form>

</body>
</html>