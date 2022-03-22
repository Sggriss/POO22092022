/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro_Principal;

import LibroComponentes.Autor;
import LibroComponentes.Editorial;

/**
 *
 * @author grisssg26
 */
public class LibroP {
    //Atributos
    private String nombre;
    private int numPag;
    private Autor escritor;
    private Editorial editorial;

    //Método constructor
    public LibroP() {
        escritor = new Autor();
        editorial = new Editorial();
    }

    //Constructor sobrecargado
    public LibroP(String nombre, int numPag, Autor escritor, Editorial editorial) {
        this.nombre = nombre;
        this.numPag = numPag;
        this.escritor = escritor;
        this.editorial = editorial;
    }

    //Método de uso genetal
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "LibroP{" + "nombre=" + nombre + ", numPag=" + numPag + ", escritor=" + escritor + ", editorial=" + editorial + '}';
    }
    
    
    
    
}
