<%-- 
    Document   : index
    Created on : 21/10/2024, 9:01:07 p. m.
    Author     : Laugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>JSP Page</title>
        <style>
            
            form{
                
                width: 50vw;
                margin: 0 auto;
                padding: 20px;
                text-align: center;
                justify-content: center;
            }
            
            
        </style>
    </head>
    <body>
        <h1>Ingresar datos de proyecto de norma (METODO POST)</h1>
        
        <form action="servlets" method="POST">
            <div class="mb-3"> 
                <label for="nombre" class="form-label">Digite el nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Digite el nombre del usuario" required>
            </div>
           
            <div class="mb-3"> 
                <label for="apellido" class="form-label">Digite el apellido</label>
                <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Digite el nombre del usuario" required>
            </div>
            <button type="submit" class="btn btn-primary">Enviar datos</button
        </form>
        
        <hr>
        <h1>Ingresa los datos de usuario (METODO GET)</h1>
        <form action="servlets" method="GET">
            <button type="submit" class="btn btn-primary">Mostrar datos</button>
        </form>
        
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    </body>
</html>
