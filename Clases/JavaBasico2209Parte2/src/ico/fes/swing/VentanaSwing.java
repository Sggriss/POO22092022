/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author grisssg26
 */
public class VentanaSwing extends JFrame{
    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    
    
    public VentanaSwing() throws HeadlessException{
        setTitle("Conversión de °C a °F");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "/src/ico/fes/swing/carrito.png");
        
        boton = new JButton(icono);
        boton.setBackground(Color.GREEN);
        boton.setOpaque(true);
        boton.setToolTipText("Click para convertir en °F");
        resultado = new JLabel("°F");
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit=0.0f;
                float celsius=0.0f;
                try{
                    celsius = Float.parseFloat(cuadro.getText());
                    gradosFarenheit = (celsius * (9.0f/5.0f)) + 32.0f;
                    resultado.setText(gradosFarenheit + "°F");
                } catch (NumberFormatException ex) {
                    e.toString();
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introfuce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
    }
    
}
