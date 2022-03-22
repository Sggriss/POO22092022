/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeliculaComponentes;

/**
 *
 * @author grisssg26
 */
public class Productora {
    private String nombre;
    private String genero;

    public Productora() {
    }

    public Productora(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
    public void producir(){
        System.out.println(this.nombre + " está produciendo una película.");
    }
}
