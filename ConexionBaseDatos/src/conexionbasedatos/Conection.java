/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 57321
 */
public class Conection {
    public static Connection conectarDB(){
        String dbURL =
        "jdbc:mysql://localhost:3306/ecodosruedas";
        String username = "root";
        String password = "root";
        Connection conn;
        // conectar
        try {
            conn = DriverManager.getConnection(dbURL, username, password );
            if ( conn != null ) {
                System.out.println("Conectado");
            }
            
            return conn;
            
        }catch ( SQLException ex ) {
            ex . printStackTrace ();
        }
        
        return null;
    }
}
