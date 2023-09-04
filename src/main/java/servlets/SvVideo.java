
package servlets;

import com.mycompany.mundo.Video;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvVideo", urlPatterns = {"/SvVideo"})
public class SvVideo extends HttpServlet {
    ArrayList<Video> misVideos = new ArrayList<>();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // aqui vienen los datos por POST
        int idVideo = Integer.parseInt(request.getParameter("idVideo"));
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String anio = request.getParameter("anio");
        String categoria = request.getParameter("categoria");
        String url = request.getParameter("url");
        String letra = request.getParameter("letra");
        
//        System.out.println(idVideo);
//        System.out.println(titulo);
//        System.out.println(autor);
//        System.out.println(anio);
//        System.out.println(categoria);
//        System.out.println(url);
//        System.out.println(letra);
            
//       Ingresar los dato al objecto
            Video miVideo = new Video(idVideo, titulo, autor, anio, categoria, url, letra);
            misVideos.add(miVideo);
            
            new Video().obtenerRepote(misVideos);
            
            //Agregar el arraysList al objecto de solicitud como atributo
            request.setAttribute("misVideos", misVideos);
            
            //redirecionar a la paguina web destino
            request.getRequestDispatcher("index.jsp").forward(request, response);


            
//            for (Video v : misVideos) {
//                System.out.println("idVideo: "+v.getIdVideo());
//                System.out.println("Titulo: "+ v.getTitulo());
//                System.out.println("Autor: "+ v.getAutor());
//                System.out.println("Año: "+ v.getAnio());
//                System.out.println("Categoria: "+v.getCategoria());
//                System.out.println("url"+v.getUrl());
//                System.out.println("letra: "+v.getLetra());
//                System.out.println("----------------------------------");
//            }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
