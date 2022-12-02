
package coneccionBD;

 import java.sql.*;

        
public class Conexion {
    //nombre del controlador y la url de la base de datos 
    static final String Controlador = "com.mysql.jbdc.Driver";
    static final String url_bd = "jdbc:mysql://localhost/libros";
    public static void main(String[] args) {
        Connection conexion = null;// controla la coneccion 
        Statement instrucion = null;//
        ResultSet conjuntoresultados = null;
        try {
            Class.forName(Controlador);
            
            
        } catch (Exception e) {
        }
    }
}
