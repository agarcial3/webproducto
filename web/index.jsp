<%-- 
    Document   : index
    Created on : 23/09/2020, 09:14:01 PM
    Author     : gamag
--%>
<%@page import="modelo.Productos" %>
<%@page import="java.util.HashMap" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AG_Productos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous"
    </head>
    <body>
        <h1>Formulario de Producto</h1>
        
         <div class ="container">
            <form action ="sr_producto" method="post" class="form-group">
                <label for="lbl_id"><b>Id_producto:</b></label>
                <input type="text" name="txt_idproducto" id="txt_idproducto" class ="form-control" placeholder="Ejemplo: PR001">
                <label for="lbl_producto"><b>Producto:</b></label>
                <input type="text" name="txt_producto" id="txt_producto" class ="form-control" placeholder="Ejemplo: cerial">
                <br>
                <label for="lbl_Id_marca"><b>Id_Marca:</b></label>
                <input type="text" name="txt_idmarca" id="txt_idmarca" class ="form-control" placeholder="Mac01">
                <label for="lbl_descripcion"><b>Descripcion:</b></label>
                <input type="text" name="txt_Descripcion" id="txt_descripcion" class ="form-control" placeholder="Ejemplo: abarrotes"
                <label for="lbl_precio_costo">Precio_Costo:</label>
                <input type="decimal" name="txt_precio_costo" id="txt_precio_costo" class ="form-control" placeholder="Ejemplo: 0.00">
                <label for="lbl_precio_venta">Precio_Venta:</label>
                <input type="decimal" name="txt_precio_venta" id="txt_precio_venta" class ="form-control" placeholder="Ejemplo: 0.00">
                <label for="lbl_existencia">Existencia:</label>
                <input type="number" name="txt_existencia" id="txt_existencia" class ="form-control" placeholder="Ejemplo: 1">
                <br>
                <button  name="btn_agregar" id="btn_agregar" value="agregar" class="btn btn-success">Agregar</button>
            </form>
            
            
        </div>
        
        
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7
    </body>
</html>
