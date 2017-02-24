/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesOperaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import ClasesPestañas.CCliente;

/**
 *
 * @author joseguadalupe
 */
public class COperacionCliente {
    private final String tabla = "clientes";
    public void guardar (Connection conexion, CCliente persona)throws SQLException{
        try{
            PreparedStatement consulta;
            if(persona.getId()!=0){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                         + "(cliente_id, nombre, apellidos, direccion,edad,tel,instructor_id,clase_id)"
                                 + "VALUES(?,?,?,?,?,?,?,?)");
                consulta.setString(1,String.valueOf(persona.getId()));
                consulta.setString(2,persona.getNombre());
                consulta.setString(3,persona.getApellidos());
                consulta.setString(4,persona.getDireccion());
                consulta.setInt(5,persona.getEdad());
                consulta.setString(6,persona.getTel());
                consulta.setInt(7,persona.getProfe_id());
                consulta.setInt(8,persona.getRoom_id());
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
                         + " WHERE cliente_id =?");
                consultaBorrar.setString(1,String.valueOf(id));
                consultaBorrar.executeUpdate();
            }
           
        }catch(SQLException ex){
            System.out.print("Error al borrar elemento: "+ex.getMessage());
        }
    
    }
    public void modificar (Connection conexion, int id, String nombre, String apellidos, String direccion,
            int edad, String tel, int instructor_id, int clase_id)throws SQLException{
        try{
            PreparedStatement consultaupdate;
                consultaupdate = conexion.prepareStatement(
                        "UPDATE " + this.tabla+" SET nombre=?,apellidos=?,direccion=?,"
                                + "edad=?,tel=?,instructor_id=?,clase_id=? "
                                + "WHERE cliente_id="+id);
                consultaupdate.setString(1, nombre);
                consultaupdate.setString(2, apellidos);
                consultaupdate.setString(3,direccion);
                consultaupdate.setInt(4,edad);
                consultaupdate.setString(5,tel);
                consultaupdate.setInt(6,instructor_id);
                consultaupdate.setInt(7,clase_id);
                consultaupdate.executeUpdate();
           }
        catch(SQLException ex){
            System.out.print("Error al actualizar elemento: "+ex.getMessage());
        }
    
    }

    void modificar(Connection obtener, int matri, String nom, String ape, int edad, String dire, int profe, int clase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
