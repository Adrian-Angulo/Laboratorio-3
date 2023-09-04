/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mundo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class Video {
    private int idVideo;
    private String titulo;
    private String autor;
    private String anio;
    private String categoria;
    private String url;
    private String letra;

    public Video() {
    }

    public Video(int idVideo, String titulo, String autor, String anio, String categoria, String url, String letra) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.categoria = categoria;
        this.url = url;
        this.letra = letra;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

public void obtenerRepote(ArrayList<Video> misVideos){
        
        try (PrintWriter pluma = new PrintWriter(new FileWriter("C:/Users/ADRIAN CASTILLO/Documents/NetBeansProjects/mavenproject1/src/main/java/data/data.txt", true))){
            for (Video v : misVideos) {
                
                pluma.println(
                v.getIdVideo()+","+
                v.getTitulo()+","+
                v.getAutor()+","+
                v.getAnio()+","+
                v.getCategoria()+","+
                v.getUrl()+","+
                v.getLetra()
                );
                System.out.println("Reporte creado con exito");
            }
 
        }catch (IOException ex) {
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
}
