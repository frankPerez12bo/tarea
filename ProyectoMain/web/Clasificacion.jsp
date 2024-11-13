<%-- 
    Document   : Clasificacion
    Created on : 12 nov. 2024, 10:47:31 a. m.
    Author     : Usuario
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Clasificacion"%>
<%@page import="conexion.ConexionDB"%>
<%@page import="java.util.List"%>
<%@page import="DAO.ClasificacionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clasificación</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css"/>
        <!-- DataTables CSS -->
        <link rel="stylesheet" href="https://cdn.datatables.net/2.1.8/css/dataTables.bootstrap5.min.css"/>
    </head>
    <body>
        <div class="container">
            <h1>Listado de Clasificaciones</h1>
            <table id="example" class="table table-striped" style="width:100%">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Código</th>
                        <th>Nombre</th> <!-- Corrección en etiqueta de cierre -->
                        <th>Estado</th>
                        <th>Acción</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        ClasificacionDAO dao = new ClasificacionDAO();
                        List<Clasificacion> list = dao.listarclasificacion();
                        Iterator<Clasificacion> iter = list.iterator();
                        Clasificacion per = null;
                        
                        while (iter.hasNext()) {
                            per = iter.next();
                    %>
                    <tr>
                        <td><%= per.getId() %></td>
                        <td><%= per.getNCodigo() %></td>
                        <td><%= per.getNombre() %></td>
                        <td><%= per.getEstado() %></td>
                        <td>
                            <!-- Aquí puedes agregar botones de acciones (editar/eliminar) -->
                            <button class="btn btn-primary btn-sm">Editar</button>
                            <button class="btn btn-danger btn-sm">Eliminar</button>
                        </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
    </body>
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <!-- Bootstrap Bundle with Popper -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
    <!-- DataTables JS -->
    <script src="https://cdn.datatables.net/2.1.8/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/2.1.8/js/dataTables.bootstrap5.min.js"></script>
    <script>
        // Inicialización de DataTable
        $(document).ready(function(){
            $('#example').DataTable();
        });
    </script>
</html>
