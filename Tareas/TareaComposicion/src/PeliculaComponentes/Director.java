/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeliculaComponentes;

/**
 *
 * @author grisssg26
 */
public class Director {
    private String nombre;
    private int edad;

    public Director() {
    }

    public Director(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void dirigir(){
        System.out.println("El director " + this.nombre + " está dirigiendo una película.");
    }
}
