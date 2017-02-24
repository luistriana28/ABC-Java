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
public class CAparatos {
    
    private int id, tipoaparato;
    private String nombre,fechacompra;
    
    public CAparatos(int id, String nombre, String fechacompra, int tipoaparato) {
        this.id = id;
        this.nombre = nombre;
        this.fechacompra = fechacompra;
        this.tipoaparato = tipoaparato;
    }

    public CAparatos() {
    }
     public int getTipoaparato() {
        return tipoaparato;
    }

    public void setTipoaparato(int tipoaparato) {
        this.tipoaparato = tipoaparato;
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

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }    
}

