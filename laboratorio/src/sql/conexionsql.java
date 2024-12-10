
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexionsql {
    Connection conn = null;
    String url="jdbc:postgresql://localhost/laboratorio";
    String usuario="postgres";
    String clave="Cali1217";
    
    public Connection conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(url,usuario,clave);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de conexion " +e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
        }
    
    }
    
