/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ConexionMYSQL {
     private static Connection ConnectionDB = null;
    public Connection getConnecction(){
    
        try {
      
        String url="jdbc:mysql://localhost:3306/lab";
        String user ="alex";
        String password="root";
        
        
        ConnectionDB=DriverManager.getConnection(url,user,password);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        

    }
         return ConnectionDB;
}
}
