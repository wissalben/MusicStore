<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>identifier</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style type="text/css">
body {background-color: powderblue;}
h1{color:#ff33f9;
   font-size:50px;
   text-align:center;
   font-family:arial;}
</style>
</head>
<body>
<h1> Identifiez-vous </br></h1>
    <form method="POST" action="Identifier">
        <div class="col-md-4 mb-3">
      <label for="validationTooltip01">E-mail</label>
      <input type="email" class="form-control" id="validationTooltip01" placeholder="E-mail" name="email" id="email" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
    
     <div class="col-md-4 mb-3">
      <label for="validationTooltip01">mot de passe:</label>
      <input type="password" class="form-control" id="validationTooltip01" placeholder="mot de passe" name="pass" id="pass" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
    

  
    
  
  <button class="btn btn-primary" type="submit">Submit form</button>
    </form>
    
    
</body>
</html>