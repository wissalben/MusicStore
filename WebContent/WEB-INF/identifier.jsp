<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>identifier</title>
<style type="text/css">
body {background-color: powderblue;}
h1{color:black;}
</style>
</head>
<body>
<h1> Identifiez-vous </br></h1>
    <form method="POST" action="Identifier">
        <p>
            <label for="login">E-mail : </label>
            <input type="text" name="login" id="login" />
        </p>
        <p>
            <label for="pass">password : </label>
            <input type="text" name="pass" id="pass" />
        </p>
        
        <input type="submit" />
    </form>
    
    
</body>
</html>