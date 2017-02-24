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
public class CInstructores {
    
    private int id;
    private String nombre,apellidos,tel;
    
    public CInstructores(int id, String nombre, String apellidos, String tel) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tel = tel;
    }
    public CInstructores() {
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
}
