/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import LibroComponentes.Autor;
import LibroComponentes.Editorial;
import Libro_Principal.LibroP;
import PeliculaComponentes.Actor;
import PeliculaComponentes.Director;
import PeliculaComponentes.Productora;
import Pelicula_Principal.PeliculaP;

/**
 *
 * @author grisssg26
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroP lib = new LibroP();
        lib.setNombre("Boulevard");
        lib.setEscritor(new Autor("Flor M. Salvador",24));
        lib.setEditorial(new Editorial("Naranja","México"));
        lib.setNumPag(274);
        System.out.println(lib);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        PeliculaP pel = new PeliculaP();
        pel.setNombre("A todos los chicos de los que me enamoré");
        pel.setGenero("Romance");
        pel.setDirector(new Director("Susan Johnson",51));
        pel.setProductora(new Productora("Overbrook","Variado"));
        pel.setActor(new Actor("Noah Centineo",25));
        System.out.println(pel);
        
    }
    
}
