<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  

 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="utf-8">
<title>Peony Beats-Music</title>
<link rel="stylesheet" href="/Peony_Beats/styles/main.css">
</head>

<body>

 <nav class = "navbar">


        <ul>
        <li><a href = "customer_form.jsp" ">Order Form</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Tea_Serv ">Teas</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Movie_Serv">Movies</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Game_Serv">Video Games</a></li>
		<li><a href  = "http://localhost:8080/Peony_Beats/Audio_Serv">Audio Books</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Music_Serv">Music</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Beats_Serv">Books</a></li>


	   </ul>

     </nav>



	<h1>Peony Beats-Music</h1>

	  <a href = "index.jsp"><img src = "http://www.meemostail.xyz/PB-Images/logos/Peony Logo.png" alt =" Peony Logo" class = "peony"></a>

	<hr>


<table id = "music" border= "1">

<thead>
    <tr>
       
        <th>SKU</th>
        <th>Title</th>
        <th>Description</th>
        <th>Price</th>
        <th>Image</th>
        </tr>

       </thead>      
          
    <c:forEach var="qbean" items="${music}">
       
       <tr>
            
           
          <td class= "sku"><c:out value = "${qbean.getSku()}"/></td>           
           <td class= "title"><c:out value = "${qbean.getTitle()}"/></td>
            <td class= "desc"><c:out value = "${qbean.getDesc()}"/></td>
            <td class= "price"><c:out value = "${qbean.getPrice()}"/></td>
            <td><img id = "tunes" src = <c:out value = "${qbean.getImage()}"/>></td>
           
            
            
            </tr>
    </c:forEach>
    
  
</table>

<script src ="js/music.js"></script>
</body>


</html>


