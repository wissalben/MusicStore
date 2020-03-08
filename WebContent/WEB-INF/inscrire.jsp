<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>inscrire</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<style type="text/css">
body {background-color: powderblue;}
h1{color:#ff33f9;
   font-size:50px;
   text-align:center;
   font-family:arial;
}
</style>
</head>
<body>
<!-- TODO validation and change action to stay in inscrire --> 
<h1> Inscrivez-vous </br></h1>
    <form method="POST" action="Inscrire"  > 
     
    
      
      <div class="col-md-4 mb-3">
      <label for="validationTooltip01">Nom</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="nom" name="nom" id="nom" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
   
 
       <div class="col-md-4 mb-3">
      <label for="validationTooltip01">prenom</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="prenom" name="prenom"  id ="prenom" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
      
      
 
       <div class="col-md-4 mb-3">
      <label for="validationTooltip01">Adresse</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="adresse" name="add"  id ="add" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
    
    
    
     <div class="col-md-4 mb-3">
      <label for="validationTooltip01">E=mail</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="nom" name="email" id="email" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
    
     <div class="col-md-4 mb-3">
      <label for="validationTooltip01">password</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="nom" name="pass" id="pass" required>
      <div class="valid-tooltip">
        Looks good!
      </div>
      </div>
    

  
    
  
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>
  
    
    
</body>
</html>