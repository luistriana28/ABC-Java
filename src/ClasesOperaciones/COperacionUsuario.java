/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesOperaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import ClasesPestañas.CUsuario;


/**
 *
 * @author joseguadalupe
 */
public class COperacionUsuario {
    private final String tabla = "usuarios";
    public void guardar (Connection conexion, CUsuario user)throws SQLException{
        try{
            PreparedStatement consulta;
            if(user.getId()!=0){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla
                         + "(usuario_id, username, password)"
                         + "VALUES(?,?,?)");
                consulta.setString(1,String.valueOf(user.getId()));
                consulta.setString(2,user.getUsuario());
                consulta.setString(3,user.getPassword());
                
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
                         + " WHERE usuario_id =?");
                consultaBorrar.setInt(1,id);
                consultaBorrar.executeUpdate();
            }
           
        }catch(SQLException ex){
            System.out.print("Error al borrar elemento: "+ex.getMessage());
        }
    
    }
//    public void modificar (Connection conexion, int id, String nombre, String apellidos, String direccion,
//            int edad, String tel, int instructor_id, int clase_id)throws SQLException{
//        try{
//            PreparedStatement consultaupdate;
//                consultaupdate = conexion.prepareStatement(
//                        "UPDATE " + this.tabla+" SET nombre=?,apellidos=?,direccion=?,"
//                                + "edad=?,tel=?,instructor_id=?,clase_id=? "
//                                + "WHERE cliente_id="+id);
//                consultaupdate.setString(1, nombre);
//                consultaupdate.setString(2, apellidos);
//                consultaupdate.setString(3,direccion);
//                consultaupdate.setInt(4,edad);
//                consultaupdate.setString(5,tel);
//                consultaupdate.setInt(6,instructor_id);
//                consultaupdate.setInt(7,clase_id);
//                consultaupdate.executeUpdate();
//           }
//        catch(SQLException ex){
//            System.out.print("Error al actualizar elemento: "+ex.getMessage());
//        }
//    
//    }

}
