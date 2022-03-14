<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Correcto login</title>
<link rel="stylesheet" href="CSS/estilos.css">
</head>
<body>
	
	<div class="myDiv_0">
        <div class="caja_0">
            <div class="caja_0_1">
                <img src="CSS/Imagenes/marca_andres.png " width= 100% height= 100%;>
            </div>
            <div class="caja_0_2">
                <p class="nombre_andres">FLAVIO ANDR&Eacute;S CUICHAN FLORES</p>
            </div>
        </div>
    </div>
    
    <div class="myDiv_1">
    </div>
    
    <div class="myDiv_2">
        <div class="caja_2_1">
            <h1 class="titulo_binevenidos"> BIENVENIDO  <br> ${param.Usuario} </h1> 
        </div>
        <div class="caja_2_2">
            <a href="Pagina_web/web.html" target="_blank"><h1 class="paginas" > P&aacute;gina Web </h1></a>
            <h1 class="barra"> | </h1>
            <a href="Pagina_CV/pagina_cv.html" target="_blank"><h1 class="paginas" > P&aacute;gina CV </h1></a>
        </div>
        <a href="https://github.com/andrescuichan" target="_blank">
            <div class="caja_2_3">
                <h1 class="GitHub"> GitHub </h1> 
            </div>
        </a>
    </div>
    
    <footer class="myDiv_3">
        <div class="caja_3_1">
            <p> Todos los derechos reservados copyright. 2022 &copy; Company Cuichan S.L </p>
        </div>
    </footer>
    
    
	
	
	<!--  <h2>${m1}</h2>
	<h2>${param.peso}</h2>
	<h2>${param.peso}</h2>
	<h2>${param.Usuario}</h2>-->
	
</body>
</html>