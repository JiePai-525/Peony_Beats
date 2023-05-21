<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Peony Beats</title>
<link rel="stylesheet" href="/Peony_Beats/styles/main.css">
</head>

<body>

<div class = "wrapper">



 <nav class = "navbar">


        <ul>

        <li><a href = "customer_form.jsp">Order Form</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Tea_Serv ">Teas</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Movie_Serv">Movies</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Game_Serv ">Video Games</a></li>
		<li><a href  = "http://localhost:8080/Peony_Beats/Audio_Serv">Audio Books</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Music_Serv">Music</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Beats_Serv">Books</a></li>


	   </ul>

     </nav>



	<h1>Peony Beats</h1>

	 <img src = "images/Peony Logo.png" alt =" Peony Logo" class = "peony">


	
	<hr>


<h4>Peony Beats is a unique collection of books, video games, audio reads, music and more.</h4>

<table class = "books" border = "1">

  <thead>

<tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
         <th>Phone</th>
         <th>Email</th>
         <th>City</th>
         <th>State</th>
         <th>Zip</th>
         <th>Card Info</th>
         
        </tr>

       </thead>      
          

    <c:forEach var="qbean" items="${customers}">
       
       <tr>
            
           
           <td class= "fname">${qbean.getFName()}</td>           
           <td class= "lname">${qbean.getLName()}</td>
            <td class= "address">${qbean.getAddress()}</td>
            <td class= "phone">${qbean.getPhone()}</td>
            <td class = "email">${qbean.getEmail()}</td>
            <td class = "city">${qbean.getCity()}</td>
            <td class = "state">${qbean.getState()}</td>
            <td class = "zip">${qbean.getZip()}</td>
            <td class = "card">${qbean.getCardInfo()}</td>
            </tr>
        
    </c:forEach>
</table>


</body>





</html>


