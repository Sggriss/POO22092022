/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.Fes.Automovil;
import ico.Fes.Silla;
import java.awt.Color;

/**
 *
 * @author grisssg26
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println( s1 ); //Por defecto se invoca toString()
        System.out.println(s1.toString() );
        
        
        Automovil bocho=new Automovil();
        System.out.println("El automovil es un: Bocho");
        bocho.setMarca("VW"); //Asignación del estado "VW" al atributo Marca
        System.out.println("Marca: " + bocho.getMarca() );
        bocho.setSubMarca("Sedan"); //Asignación del estado "Sedan" al atributo SubMarca
        System.out.println("SubMarca: " + bocho.getSubMarca() );
        bocho.setModelo(1970); //Asignación del estado "1970" al atributo Modelo
        System.out.println("Modelo: " + bocho.getModelo() );
        bocho.setColor(Color.BLUE); //Asignación del estado "Azul-BLUE" al atributo color
        System.out.println("Color: " + bocho.getColor() );
        
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAcura = new Automovil("Acura", "NSX", 2013, Color.gray);
        System.out.println(miAcura);
    }
    
}
