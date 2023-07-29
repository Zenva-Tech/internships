/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class db {
    public static Connection mycon(){
        Connection con;
        con = null;
        
        try{
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login", "root", "");
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        
        return con;
    }
    
}
