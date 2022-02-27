/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author grisssg26
 */
public class libro {
    private String titulo; //Atributo
    private String autor; //Atributo
    private int paginas; //Atributo
    private String editorial; //Atributo
    private Color color; //Atributo

    public libro() { //Método constructor
    }

    //Método constructor sobrecargado
    public libro(String titulo, String autor, int paginas, String editorial, Color color) { 
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
        this.color = color;
    }

    //Método de uso general
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
public void abrirlibro(){
            System.out.println("El libro " + this.titulo + " está abierto");
}

public void leerlibro(){
    System.out.println("Leyendo el libro " + this.titulo);
}
    
    
    
}
