/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author grisssg26
 */
public class Tarealibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tarealibro");
        libro lib1 = new libro ();
            lib1.setTitulo("Boulevard");
        System.out.println("Titulo: " + lib1.getTitulo() );
        lib1.setAutor("Flor Amargo");
        System.out.println("Autor: " + lib1.getAutor() );
        lib1.setPaginas(274);
        System.out.println("Paginas: " + lib1.getPaginas() );
        lib1.setEditorial("Naranja");
        System.out.println("Editorial: " + lib1.getEditorial() );
        lib1.setColor(Color.white);
        System.out.println("Color: " + lib1.getColor() );
        lib1.abrirlibro();
        lib1.leerlibro();
        
        
        libro lib2 = new libro();
            lib2.setTitulo("¿Y si quedamos como amigos?");
            System.out.println("Titulo: " + lib2.getTitulo() );
            lib2.setAutor("Elizabeth Eulberg");
            System.out.println("Autor: " + lib2.getAutor() );
            lib2.setPaginas(292);
            System.out.println("Paginas: " + lib2.getPaginas() );
            lib2.setEditorial("Alfaguara");
            System.out.println("Editorial: " + lib2.getEditorial() );
            lib2.setColor(Color.yellow);
            System.out.println("Color: " + lib2.getColor() );
            lib2.abrirlibro();
            lib2.leerlibro();
        
    }
    
}
