/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesOperaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import ClasesPestañas.CClase;

/**
 *
 * @author joseguadalupe
 */
public class COperacionClase {
    private final String tabla = "clase";
    public void guardar (Connection conexion, CClase clase)throws SQLException{
        try{
            PreparedStatement consulta;
            if(clase.getId()!=0){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                         + "(clase_id, nombre,salon_id,instructor_id)"
                                 + "VALUES(?,?,?,?)");
                consulta.setString(1,String.valueOf(clase.getId()));
                consulta.setString(2,clase.getNombre());
                consulta.setInt(3,clase.getProfe_id());
                consulta.setInt(4,clase.getRoom_id());
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
                         + " WHERE clase_id =?");
                consultaBorrar.setString(1,String.valueOf(id));
                consultaBorrar.executeUpdate();
            }
           
        }catch(SQLException ex){
            System.out.print("Error al borrar elemento: "+ex.getMessage());
        }
    
    }
    public void modificar (Connection conexion, int id, String nombre,
            int instructor_id, int salon_id)throws SQLException{
        try{
            PreparedStatement consultaupdate;
                consultaupdate = conexion.prepareStatement(
                        "UPDATE " + this.tabla+" SET nombre=?,"
                                + "clase_id=?,instructor_id=? "
                                + "WHERE clase_id="+id);
                consultaupdate.setString(1, nombre);
                consultaupdate.setInt(2,salon_id);
                consultaupdate.setInt(3,instructor_id);
                consultaupdate.executeUpdate();
           }
        catch(SQLException ex){
            System.out.print("Error al actualizar elemento: "+ex.getMessage());
        }
    
    }
}
