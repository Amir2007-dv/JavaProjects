/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordando;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author Usuario
 */
public class conexion {
    private Connection con;
    public Connection conectar(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/tutorial","root","");
    System.out.print("Conexion Exitosa");
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,"Error de conexion razon:"+e.getMessage());
    }
    return this.con;
    }
}
