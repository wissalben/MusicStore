<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>accueil2</title>
<style type="text/css">
body {background-color: powderblue;}
h3{color:black;}
</style>
</head>
<body>
<h3><%
 String nom= (String)request.getAttribute("nom");
 String prenom =(String)request.getAttribute("prenom");
out.print("Bonjour " +nom + " "+ prenom);
 
%></h3>
<p><a href="/ztest/Catalogue">Consulter le catalogue</a></p>
<p><a href="commande.jsp">Suivez vos commandes </a></p>
<p><a href="/ztest/WEB-INF/panier">visualiser vos panier </a></p>


</body>
</html>