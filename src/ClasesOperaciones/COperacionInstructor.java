/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesOperaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import ClasesPestañas.CInstructores;

/**
 *
 * @author joseguadalupe
 */
public class COperacionInstructor {
    private final String tabla = "instructor";
    public void guardar (Connection conexion, CInstructores persona)throws SQLException{
        try{
            PreparedStatement consulta;
            if(persona.getId()!=0){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                         + "(instructor_id, nombre, apellidos,tel)"
                                 + "VALUES(?,?,?,?)");
                consulta.setString(1,String.valueOf(persona.getId()));
                consulta.setString(2,persona.getNombre());
                consulta.setString(3,persona.getApellidos());
                consulta.setString(4,persona.getTel());
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
                         + " WHERE instructor_id =?");
                consultaBorrar.setString(1,String.valueOf(id));
                consultaBorrar.executeUpdate();
            }
           
        }catch(SQLException ex){
            System.out.print("Error al borrar elemento: "+ex.getMessage());
        }
    
    }
    public void modificar (Connection conexion, int id, String nombre, String apellidos,
            String tel)throws SQLException{
        try{
            PreparedStatement consultaupdate;
                consultaupdate = conexion.prepareStatement(
                        "UPDATE " + this.tabla+" SET nombre=?,apellidos=?,"
                                + "tel=? "
                                + "WHERE instructor_id="+id);
                consultaupdate.setString(1, nombre);
                consultaupdate.setString(2, apellidos);
                consultaupdate.setString(3,tel);
                consultaupdate.executeUpdate();
           }
        catch(SQLException ex){
            System.out.print("Error al actualizar elemento: "+ex.getMessage());
        }
    
    }
}
