/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConexionDB.ConexionMYSQL;
import Entidades.Contactos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ClsContacto {
    ConexionMYSQL conexion = new ConexionMYSQL();
    Connection Conection = conexion.getConnecction();
    
    public ArrayList<Contactos>MostarDatosDeBD(){
    
    ArrayList<Contactos>arraylis= null;
        try {
            arraylis = new ArrayList<Contactos>();
         CallableStatement CD = Conection.prepareCall("Select * from Contactos");
      ResultSet Resultado = CD.executeQuery();
        
 
 
 while(Resultado.next()){
     Contactos contac = new Contactos();
    contac.setId(Resultado.getInt("idContactos"));
    contac.setNombre(Resultado.getString("Nombre"));
    contac.setEdad(Resultado.getInt("Edad"));
    contac.setEmail(Resultado.getString("Email"));
    contac.setNumeroDeTelefono(Resultado.getInt("NumeroDeTelefono"));
    arraylis.add(contac);

 }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        }
        return arraylis ;

    }
    
    public void Insert(Contactos contac){
    
          try {

            CallableStatement callable = Conection.prepareCall("insert into " + "Contactos "
                    + "(Nombre,Edad,Email,NumeroDeTelefono)"
                    + " values('" + contac.getNombre() + "','" + contac.getEdad() + "','" + contac.getEmail() + "','" + contac.getNumeroDeTelefono() + "')");

            callable.execute();

            JOptionPane.showMessageDialog(null, "Contacto Agregado", "Mensaje sistema", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
   
    }
    
    
    
    //_________________________________________________________________________________________________________
    //ACTUALIZAR LOS DATOS DE LA BASE DE DATOS 
public void Update(Contactos contac){
    try {
            CallableStatement callable = Conection.prepareCall("update  Contactos set Nombre='" + contac.getNombre() + "',"
                    + "Edad='" + contac.getEdad() + "',"
                            +"Email='" + contac.getEmail() + "',"
                                    + "NumeroDeTelefono='" + contac.getNumeroDeTelefono() + "' where idContactos='" + contac.getId()+ "'");
            
            callable.execute();
            
            JOptionPane.showMessageDialog(null, "Contacto Actualizado", "Mensaje sistema", 1);
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error" + ex.toString());
        }

}


//________________________________________________________________________________
//PARA ELIMINAR LOS DATOS DE LA BASE DE DATOS
public void Delete(Contactos contac){
    try {
     
       CallableStatement datos=Conection.prepareCall("delete from Contactos where idContactos='"+contac.getId()+"'");
    datos.execute();
           JOptionPane.showMessageDialog(null, "Contacto Eliminado", "Mensaje sistema", 1);
    } catch (Exception e) {
   
    JOptionPane.showMessageDialog(null,"Error"+e.toString());
    }


}












}
