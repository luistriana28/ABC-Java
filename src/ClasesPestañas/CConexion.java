/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPestañas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author asosa
 */
public class CConexion {
    private static Connection cnx = null;
   public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/starsteam_gym", "root", "");
         } catch (SQLException ex) {
            System.out.print("Error a la conexion con DriverManager.getConnection "+ex.getMessage());
         } catch (ClassNotFoundException ex) {
             System.out.print("Error a la conexion con DriverManager.getConnection "+ex.getMessage());
            //throw new ClassCastException(ex.getMessage());
            System.out.print("Error a la conexion con DriverManager.getConnection "+ex.getMessage());
         }
      }
      return cnx;
   }
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
}
