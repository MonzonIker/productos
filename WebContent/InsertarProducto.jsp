<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container my-3">
    <nav aria-label="breadcrumb">
      <ol class="breadcrumb">
        <li class="breadcrumb-item active" aria-current="page">Home</li>
        <li class="breadcrumb-item "><a href="VerProductos">Productos</a></li>
        <li class="breadcrumb-item active" aria-current="page">Nuevo</li>
      </ol>
    </nav>
    
    <form action="InsertarProducto" method="GET">
    
    <table>
   <tr><td> Nombre: </td><td><input type="text" name="nombre" value=""></td></tr>
    <tr><td> Stock: </td><td><input type="text" name="stock" value=""> </td></tr>
    <tr><td> Fecha_Compra: </td><td><input type="text" name="fecha_compra" value=""></td></tr> 
    <tr><td> Color: </td><td><input type="text" name="color" value=""> </td></tr>
     <tr><td>Made_In:</td><td> <input type="text" name="made_in" value=""></td></tr> 
    <tr><td> Precio: </td><td><input type="text" name="precio" value=""> </td></tr>
    <tr><td> Descuento: </td><td><input type="text" name="descuento" value=""> </td></tr>
    
    </table>
    
    <input type="submit" value="Insertar" >
    
   
    </form>
    
    
    
    
    
    </div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>