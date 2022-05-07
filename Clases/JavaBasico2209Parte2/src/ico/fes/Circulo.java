/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author grisssg26
 */
//Java Bean , POJO es diferente a los EJB Enterprise Java Beans
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    @Override
    public float calcularArea(){
        return (this.radio * this.radio) *Figura.PI;
    }
    
    /*Principio de diseño L. P = 0 , 1 e infinito: Solo
    los valores 0,1 e infinito son validos para usarse en la codificación de algoritmos.
    El lenguaje de programación debe proporcionar un mecanismo para evitar usar literales numéricas en el programa
    */
}
