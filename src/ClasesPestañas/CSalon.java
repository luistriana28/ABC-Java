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
public class CSalon {
    
    private int id, instructor_id;
    private String nombre;
    
    public CSalon(int id, String nombre, int instructor_id) {
        this.id = id;
        this.nombre = nombre;
        this.instructor_id = instructor_id;  
    }

    public CSalon() {
        
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
    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }
}
