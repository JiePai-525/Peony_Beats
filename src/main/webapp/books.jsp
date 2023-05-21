<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  

 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="utf-8">
<title>Peony Beats-Books</title>
<link rel="stylesheet" href="/Peony_Beats/styles/main.css">
</head>

<body>

 <nav class = "navbar">


        <ul>

        <li><a href = "customer_form.jsp">Order Form</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Tea_Serv ">Teas</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Movie_Serv">Movies</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Game_Serv">Video Games</a></li>
		<li><a href  = "http://localhost:8080/Peony_Beats/Audio_Serv">Audio Books</a></li>
		<li><a href = "http://localhost:8080/Peony_Beats/Music_Serv">Music</a></li>
		<li><a href = "#">Books</a></li>


	   </ul>

     </nav>



	<h1>Peony Beats-Books</h1>

	  <a href = "index.jsp"><img src = "images/Peony Logo.png" alt =" Peony Logo" class = "peony"></a>

	<hr>


<table class = "books" border= "1">

<thead>
    <tr>
        
        <th>SKU</th>
        <th>Title</th>
        <th>Description</th>
        <th>Price</th>
         <th>Image</th>
        </tr>

       </thead>      
          
    <c:forEach var="qbean" items="${books}">
       
       <tr>
            
           
          <td class= "sku">${qbean.getSku()}</td>           
           <td class= "title">${qbean.getTitle()}</td>
            <td class= "desc">${qbean.getDesc()}</td>
            <td class= "price">${qbean.getPrice()}</td>
            <td><img class = "pic"src ="thumbnails/peony-thumbnail.png" ></td>
            <td><img class = "pic"src ="thumbnails/bone-thumbnail.png" ></td>
            
            
            </tr>
        
    </c:forEach>
    
    
    
   
</table>


</body>


</html>

