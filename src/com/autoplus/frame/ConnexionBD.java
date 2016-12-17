/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoplus.frame;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public class ConnexionBD {

    
    Connection conn=null;
    
    public static Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/auto_plus","root","");
            if(conn!=null)
                System.out.println("Connexion à la base de données a été établi avec succés");
            else
                System.out.println("Problème de Connexion à la base");
            return conn;
        }catch(Exception e){
            System.out.println("-->SQLException : "+e);
        return null;    
        }      
        
    }
    
    
    
}
