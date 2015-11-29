/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Garrett
 */
public class EnrollStudent extends javax.swing.JFrame {
    
    private void Fillcombo(){
        try{
            String url = "jdbc:derby://localhost:1527/Enrollment Database [glaw on GLAW]";
            String username = "glaw";
            String password = "booboo";

            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM EMPLOYEE";
            ResultSet rs = stmt.executeQuery(Query);
            
    }
 
 


    
  
    
    }

