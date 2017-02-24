/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPestañas;


/**
 *
 * @author asosa
 */
public class CTipo_Aparatos {
    
    private int id;
    private String nombre;
   
    public CTipo_Aparatos(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        
    }

    CTipo_Aparatos(int parseInt) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
