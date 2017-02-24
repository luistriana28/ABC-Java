/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesOperaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import ClasesPestañas.CSalon;

/**
 *
 * @author joseguadalupe
 */
public class COperacionSalon {
    private final String tabla = "salon";
    public void guardar (Connection conexion, CSalon salon)throws SQLException{
        try{
            PreparedStatement consulta;
            if(salon.getId()!=0){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                         + "(salon_id, nombre, instructor_id)"
                                 + "VALUES(?,?,?)");
                consulta.setInt(1,salon.getId());
                consulta.setString(2,salon.getNombre());
                consulta.setInt(3,salon.getInstructor_id());
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
                         + " WHERE salon_id =?");
                consultaBorrar.setInt(1,id);
                consultaBorrar.executeUpdate();
            }
           
        }catch(SQLException ex){
            System.out.print("Error al borrar elemento: "+ex.getMessage());
        }
    
    }
    public void modificar (Connection conexion, int id, String nombre,int instructor_id)throws SQLException{
        try{
            PreparedStatement consultaupdate;
                consultaupdate = conexion.prepareStatement(
                        "UPDATE " + this.tabla+" SET nombre=?,"
                                + "instructor_id=? "
                                + "WHERE salon_id="+id);
                consultaupdate.setString(1, nombre);
                consultaupdate.setInt(2,instructor_id);
                consultaupdate.executeUpdate();
           }
        catch(SQLException ex){
            System.out.print("Error al actualizar elemento: "+ex.getMessage());
        }
    
    }
}
