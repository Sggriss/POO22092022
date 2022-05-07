/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author grisssg26
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Excepciones
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("-----------------------");
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        
        String elNombre="";
        try {
            seleccion = teclado.nextInt();
           elNombre = nombres.get(seleccion);
        }catch(InputMismatchException ie){
            System.out.println("Debes teclear valores numéricos");
        } catch(IndexOutOfBoundsException ioe){
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Genérica");
            elNombre = nombres.get(1);
        } finally {
            System.out.println(elNombre);
            //elNombre=null;
            //Limpieza
        }
        
        System.out.println(nombres.get(seleccion));
        
        System.out.println("Continua el programa ...");
        
        Aritmetica cal = new Aritmetica(2, 4);
        System.out.println(cal.getA() + "+" + cal.getB() + "=" + cal.sumar());
        
        try{
        System.out.println(cal.getA() + "/" + cal.getB() + "=" + cal.dividir());
        } catch(Exception e){
            System.out.println("Error de aritmetica");
        }
        
        System.out.println("Fin del programa");  //Regla de oro: Evitar que un programa termine de forma abrupta
        
        System.out.println("--------------------Hasta aquí--------------------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("Área del cuadrado es: " + cuad.calcularArea());
        System.out.println("Área del círculo es: " + circ.calcularArea());
        
        System.out.println("----------------------------------------------------------");
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Griss");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("Futbol");
        eda.setGeneroArtistico("Fotografía, body paint, dibujo");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);
        
    }
    
}
