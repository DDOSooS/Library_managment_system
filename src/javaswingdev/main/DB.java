/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingdev.main;

/**
 *
 * @author HP
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DB {
   static final String DB_URL = "jdbc:mysql://localhost/gestion_biblio";
   static final String USER = "root";
   static final String PASS = "";
   
   public DB(){
     
   }
   
   public Connection connexion(){
         // Open a connection
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "connected", "Information", JOptionPane.INFORMATION_MESSAGE);
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
   } 
   
}
