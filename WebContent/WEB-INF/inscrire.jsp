<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>inscrire</title>
<style type="text/css">
body {background-color: powderblue;}
h1{color:black;}
</style>
</head>
<body>
<h1> Inscrivez-vous </br></h1>
    <form method="POST" action="Accueil2">
        <p>
            <label for="nom">nom : </label>
            <input type="text" name="nom" id="mom" />
        </p>
        <p>
            <label for="prenom">prenom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
         <p>
            <label for="add">Adresse : </label>
            <input type="text" name="add" id="add" />
        </p>
        <p>
            <label for="email"> E-mail: </label>
            <input type="text" name="email" id="email" />
        </p>
         <p>
            <label for="pass"> password: </label>
            <input type="password" name="pass" id="pass" />
        </p>
        
        <input type="submit"  value ="ok"/>
    </form>
    
    
</body>
</html>