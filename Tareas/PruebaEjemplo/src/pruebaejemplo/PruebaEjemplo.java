/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author garce
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------Cuentahabientes------");
        CuentaHabiente[] listado = new CuentaHabiente[5];
        listado[0] = new CuentaHabiente(67543, "Grisselle Garces", 40000.0f);
        listado[1] = new CuentaHabiente(63490, "Yael Jiménez", 2000000.0f);
        listado[2] = new CuentaHabiente(54378, "Serch Santa María", 1000000.0f);
        listado[3] = new CuentaHabiente(32145, "Luis Vazquez", 60000000.0f);
        listado[4] = new CuentaHabiente(47890, "Pamela García", 1000.0f);
        
        for (CuentaHabiente cuentaHabiente : listado) {
            System.out.println(cuentaHabiente.evaluarNivelCliente()); 
        }
        
        System.out.println("------Retirar dinero------");
        listado[0].retirarDinero(200.0f);
        System.out.println("Su saldo nuevo es de:$" + listado[0].getBalance() + " pesos.");
        listado[1].retirarDinero(10000.0f);
        System.out.println("Su saldo nuevo es de:$" + listado[1].getBalance() + " pesos.");
        listado[2].retirarDinero(20000.0f);
        System.out.println("Su saldo nuevo es de:$" + listado[2].getBalance() + " pesos.");
        listado[3].retirarDinero(30000.0f);
        System.out.println("Su saldo nuevo es de:$" + listado[3].getBalance() + " pesos.");
        listado[4].retirarDinero(100.0f);
        System.out.println("Su saldo nuevo es de:$" + listado[4].getBalance() + " pesos.");
        
        
    }
    
}
