<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>accueil2</title>
<style type="text/css">
body {background-color: powderblue;}
h3{color:#8B008B;
   font-size:50px;
   text-align:center;
   font-family:arial;}
 p{
 color:#8B008B;
   font-size:25px;
 
   font-family:georgia,garamond,serif;
    font-style:italic;
 }
</style>
</head>
<body>
<c:if test="${ not empty clients }" >
<h3>   Bonjour <c:forEach var="cl" items="${ clients }">
            <c:out value="${ cl.prenom }" /> <c:out value="${ cl.nom }" />
      
        </c:forEach></h3>
       
<p><a href="/ztest/Catalogue">Consulter le catalogue</a></p>
<p><a href="ztest/Commande">Suivez vos commandes </a></p>
<p><a href="/ztest/Panier">visualiser vos panier </a></p>
       </c:if>
<c:if test="${ empty  clients }">
<p><a  href="/ztest/Inscrire">Inscrivez-vous</a></p>
</c:if>
</body>
</html>