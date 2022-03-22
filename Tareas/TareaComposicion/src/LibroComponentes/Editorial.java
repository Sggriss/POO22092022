/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibroComponentes;

/**
 *
 * @author grisssg26
 */
public class Editorial {
    private String nombre;
    private String ubicacion;

    public Editorial() {
    }

    public Editorial(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + '}';
    }
    
    public void publicacion(){
        System.out.println("La editorial " + this.nombre + " publicó una novela." );
    }
    
}
