/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;

/**
 *
 * @author grisssg26
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    private ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {

    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
    
    }
    
    public void consultarBaseDatos(){
        //simular una consulta a una BD
        PersonaDAO pdao=new PersonaDAO();
        
        try{
            datos=pdao.obtenerTodo();
        } catch (SQLiteException ex){
            ex.printStackTrace();
        }
        //datos = new ArrayList<Persona>();
        //Conextiarn a BD
        //Consulta SQL
        //datos.add(new Persona("José",19));
        //datos.add(new Persona("María",21));
        //datos.add(new Persona("Jesús",33));
        //datos.add(new Persona("Diana",22));
    }
    
    public void agregarPersona(Persona p){
        //insert a BD...
        PersonaDAO pdao=new PersonaDAO();
        datos.add(p);
        try{
            pdao.insertar(p);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
    }
}
