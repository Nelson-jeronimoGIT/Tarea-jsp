/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * HP
 */
public class Conexion {
    public Connection conexionBD;
    //jdbc:mysql://localhost:8080/bd_empresa
    private final String puerto= "8080";
    private final String bd= "DB_EMPRESA";
    private final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto, DB);
    private final String usuario = "usr_empresa";
    private final String contra = "Empres@123";
    private final String jdbc ="com.mysql.cj.jdbc.Driver";
    
    public void abrir_conexion(){
            try{
                Class.forName(jdbc);
                conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);               
               // System.out.println("Conexion Exitosa");
            }catch(ClassNotFoundException | SQLException ex){
                    System.out.println("Error: " + ex.getMessage());
            }
    }
    
    public void cerrar_conexion(){
        try{
            conexionBD.close();
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    
    }
}
