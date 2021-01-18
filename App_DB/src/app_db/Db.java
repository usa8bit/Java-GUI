package app_db;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author usaamah
 */
public class Db {
    private static Connection conn;
      public static Connection getKoneksi( ){
               String host       = "jdbc:mysql://localhost/Karyawan",
                          user       = "gii",
                          pass       = "helloworld";
               try{
                      conn = (Connection) DriverManager.getConnection(host, user, pass);
               }catch (SQLException err){
                       JOptionPane.showMessageDialog(null, err.getMessage( ) );
               }
               return conn;
      }
}
