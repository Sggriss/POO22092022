/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author grisssg26
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue() );
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        
        //Convertir Strings a entero
        String cadena= "99";
        int altura = Integer.parseInt(cadena); //Método miembro o método de clase
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println(".-.-.-..-.-..-.-..-.-.-..-.-.");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        Arbol.generarOxigeno();
        
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aquí va el titulo", JOptionPane.INFORMATION_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        
        //Código sin operador ternario
        int edad3 = 15;
        String resultado = "";
        if (edad3 < 18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad";
        }
        System.out.println(resultado);
        
        //Código con operador ternario
        
        int edad4=15;
        String res = "";
        res = edad4 < 18? "Menor de edad" : "Mayor de edad";
        System.out.println(res);
        
        //Versión mínima
        int edad5 = 15;
        System.out.println(edad5 < 18? "Menor de edad" :"Ya!, el tequila");
        
        
        //---------------
        int val1 = 1;
        int val2 = 1;
        //Haremos una comparación or a nivel de bits es decir
        /*
        val1 = 0000...0001;
        val2 = 0000...0010;
        */
        
        System.out.println(val1 & val2 );
        
        
        int val3 = 1;
        //int val4 <<= val3;
        //System.out.println(val3 <<= );
        
        int val4 = 0;
        val4 = val3 << 2;
        System.out.println(val4);
        
        System.out.println("----------ARREGLOS----------");
        int[] edades ; //primero se declara que será un arreglo
        //el segundo paso es reservarlo, de un tamaño específico 
        edades = new int[5];
        System.out.println(edades);
        edades[0] = 10;
        System.out.println("La primer edad es: " + edades[0]);
        
        //Declarar e inicializar en una sola linea
        
        int [] estaturas = new int[5];
        //Al igual que en c y c++, se pueden asignar valores
        int [] pesos = { 86,99,56,76,77}; //en kilos
        System.out.println(pesos[0] ); //86
        System.out.println(pesos[1] ); //99
        System.out.println(pesos[2] ); //56
        System.out.println(pesos[3] ); //76
        System.out.println(pesos[4] ); //77
        //Lo mismo pero con menos líneas de código
        System.out.println("----------CON FOR----------");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println(pesos[i] );
        }
        //Inverso
        System.out.println("-----inverso-----");
        for (int i=pesos.length-1;i>=0; i--){
            System.out.println(pesos[i]);
        }
        
        System.out.println("Arreglo de alumnos");
        Alumno[] lista = new Alumno[5]; //5 alimnos
        lista[0] = new Alumno("99999", 2, 9.0f);
        lista[2] = new Alumno("77777", 2, 7.0f);
        lista[3] = new Alumno("44444", 2, 7.0f);
        lista[4] = new Alumno("00000", 2, 8.0f);
        lista[5] = new Alumno("22222", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        
        /* For each es un FOR especia, introducido 
           en la versión 2 de java, esa versión fue la que 
           sufrió cambios muy grandes java
           EL FOR EACH fuen introducido para simplificar los
           FOR con arreglos
           fore+tab
           */
        System.out.println("Con for each...");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());  
        }
    }
    
}
