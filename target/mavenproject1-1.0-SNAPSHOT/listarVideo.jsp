<%-- 
    Document   : ListarVideos
    Created on : 30 ago. 2023, 17:14:54
    Author     : ADRIAN CASTILLO
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.mundo.Video"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar Videos</h1>
        <% 
            //obtener el arraylilst de la solicitud
            ArrayList<Video> misVideos = (ArrayList<Video>)request.getAttribute("misVideos");
            
            //mostrar los dato del array
            for(Video v: misVideos){
                out.println("idVideo: "+v.getIdVideo());
                out.println("Titulo: "+v.getTitulo());
            }
        %>
    </body>
</html>
