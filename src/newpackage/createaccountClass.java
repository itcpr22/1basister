/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin-1
 */
public class createaccountClass {
     conn con = new conn();
    
    public int register(String Firstname, String Lastname, String Username, String Pass){
    
    int x = 0;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        String sql = "insert into registrationtable  values(null,?,?,?,md5(?),0)";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
       
        pstmt.setString(1, Firstname);
        pstmt.setString(2, Lastname);
         pstmt.setString(3, Username);
        pstmt.setString(4, Pass);
        x = pstmt.executeUpdate();
        
        //System.out.println(x);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(createaccountClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(createaccountClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x;
    }
    
    public int confirmPass(String password, String confirmpassword){
        int x = 0;
        
        if(password.equals(confirmpassword)){
            x = 1;
        }else{
            x = 0;
        }
        return x;
    }
    
    public int checkUser(String Username){
        int x = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);
        
            String sql = "SELECT Username FROM registrationtable WHERE Username = ?;";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        
            pstmt.setString(1, Username);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                x = 1;
            }else{
                x = 0;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(createaccountClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(createaccountClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
    }
    
}
