/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesOperaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import ClasesPestañas.CAparatos;


/**
 *
 * @author joseguadalupe
 */
public class COperacionAparatos {
    private final String tabla = "aparatos";
    public void guardar (Connection conexion, CAparatos tool)throws SQLException{
        try{
            PreparedStatement consulta;
            if(tool.getId()!=0){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                         + "(aparato_id, nombre, fechacompra,tipoaparato_id)"
                                 + "VALUES(?,?,?,?)");
                consulta.setInt(1,tool.getId());
                consulta.setString(2,tool.getNombre());
                consulta.setString(3,tool.getFechacompra());
                consulta.setInt(4,tool.getTipoaparato());
                consulta.executeUpdate();
            }
        }catch(SQLException ex){
            System.out.print("Error: "+ex.getMessage());
        }
    }
     public void Borrar (Connection conexion, int id)throws SQLException{
        try{
            PreparedStatement consultaBorrar;
            if(id!=0){
                consultaBorrar = conexion.prepareStatement("DELETE FROM " 
                        + this.tabla
                         + " WHERE aparato_id=?");
                consultaBorrar.setInt(1,id);
                consultaBorrar.executeUpdate();
            }
           
        }catch(SQLException ex){
            System.out.print("Error al borrar elemento: "+ex.getMessage());
        }
    
    }
    public void modificar (Connection conexion, int id, String nombre, String fechacompra,int tipoaparato_id)throws SQLException{
        try{
            PreparedStatement consultaupdate;
                consultaupdate = conexion.prepareStatement(
                        "UPDATE " + this.tabla+" SET nombre=?,fechacompra=?,tipoaparato_id=?"
                                + " WHERE aparato_id="+id);
                consultaupdate.setString(1, nombre);
                consultaupdate.setString(2, fechacompra);
                consultaupdate.setInt(3,tipoaparato_id);
                consultaupdate.executeUpdate();
           }
        catch(SQLException ex){
            System.out.print("Error al actualizar elemento: "+ex.getMessage());
        }
    
    }
}
