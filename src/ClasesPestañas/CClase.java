/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPestañas;

/**
 *
 * @author joseguadalupe
 */
public class CClase {

     private int id,profe_id,room_id;
     private String nombre;

    public int getProfe_id() {
        return profe_id;
    }

    public void setProfe_id(int profe_id) {
        this.profe_id = profe_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
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
