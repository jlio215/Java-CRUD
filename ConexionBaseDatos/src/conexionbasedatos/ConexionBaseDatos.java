package conexionbasedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConexionBaseDatos {

    public static void Insertar(Connection conn) throws SQLException{
        String sql = "INSERT INTO libro (libId ,libNombre ,libPub ,ediId ,autId , libPrecio ) VALUES (? ,? , ? , ? , ? , ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt (1 , 1012);
        statement.setString (2 , "El secreto");
        statement.setInt (3 , 1955);
        statement.setInt (4 , 1);
        statement.setInt (5 , 1);
        statement.setDouble (6 , 800000.0);
        int rowsInserted = statement.executeUpdate();
        if ( rowsInserted > 0) {
            System . out . println ("Insercion exitosa !");
        }
    }
    
    public static void main(String[] args) {
        String dbURL =
        "jdbc:mysql://localhost:3306/ecodosruedas";
        String username = "root";
        String password = "root";
        // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password );
            if ( conn != null ) {
                System.out.println("Conectado");
            }
            
            //Insertar(conn);
            
        }catch ( SQLException ex ) {
            ex . printStackTrace ();
        }
    }
    
}
