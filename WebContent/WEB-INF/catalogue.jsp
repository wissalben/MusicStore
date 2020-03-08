<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>catalogue</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
   border: 1px solid ;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}


body {background-color: powderblue;}
h3{color:#8B008B;
   font-size:50px;
   text-align:center;
   font-family:arial;
 
}
</style>
</head>
<body>

<h3>Catalogue</h3>

<table class="table">
  <thead class="thead-dark">
    <tr style="color:#ff33f9;
   font-size:25px;
   text-align:center;
   font-family:italic;">
      <th scope="col">Reference</th>
      <th scope="col">Titre</th>
      <th scope="col">Auteur</th>
      <th scope="col">Photo </th>
      <th scope="col">Prix</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"><a href="ztest/Chanteur1">J1234</a></th>
      <td>Carmen</td>
      <td>LanaDelRey</td>
    <td>  <figure class="figure">
  <img src="/home/profil.jpg" class="figure-img img-fluid rounded" alt="...">
    <figcaption class="figure-caption">A caption for the above image.</figcaption>
  </figure></td>
       <td>million</td>
       
    </tr>
    <tr>
       <th scope="row"><a href="ztest/Chanteur1">J5678</a></th>
      <td>Carmen</td>
      <td>LanaDelRey</td>
    <td>  <figure class="figure">
  <img src="/home/profil.jpg" class="figure-img img-fluid rounded" alt="...">
    <figcaption class="figure-caption">A caption for the above image.</figcaption>
  </figure></td>
       <td>million</td>
    </tr>
    <tr>
       <th scope="row"><a href="ztest/chanteur1">J9123</a></th>
      <td>Carmen</td>
      <td>LanaDelRey</td>
    <td>  <figure class="figure">
  <img src="/home/profil.jpg" class="figure-img img-fluid rounded" alt="...">
    <figcaption class="figure-caption">A caption for the above image.</figcaption>
  </figure></td>
       <td>million</td>
    </tr>
  </tbody>
</table>



</body>
</html>