<%-- 
    Document   : index
    Created on : 29 ago. 2023, 17:34:46
    Author     : ADRIAN CASTILLO
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.mundo.Video"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rokola</title>
        
    </head>
    <body>
        <% 
            ArrayList<Video> misVideos = new ArrayList<>();
            Video vd = new Video();
            //vd.leerReporte(misVideos);          
            request.setAttribute("misVideos", misVideos);
        %>
        <h1>Sistema Reproductor de videos</h1>
        <h3> <a href="agregarVideo.jsp">Ingresar un nuevo video</a></h3>
                <h1>Listar Videos</h1>
        <% 
            if(misVideos.isEmpty()){
            out.print("la lista esta vacia");
            }else{
            
            //mostrar los dato del array
            for(Video v: misVideos){
            

        %>
        
        <p><%=v.getTitulo()%></p>
        <p><%=v.getUrl()%></p>
        <p>Autor: <%=v.getAutor()%></p>
        <p>Año: <%=v.getAnio()%></p>
        <p>Categoria: <%=v.getCategoria()%></p>
        <p>Letra: <%=v.getLetra()%></p>
        <p>Id: <%=v.getIdVideo()%></p>
        
            <%}
                }%>
        
    </body>
</html>
