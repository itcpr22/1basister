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
public class login_class {
     conn con = new conn();
    
    String Firstname = "";
    
    public int login(String Username, String Pass){
        int y = 0;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url,con.username,con.password);
            
            String sql = "SELECT * FROM registrationtable WHERE Username = ? AND Pass= MD5(?);";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            
            pstmt.setString(1, Username);
            pstmt.setString(2, Pass);
            
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                y = 1;
                Firstname = rs.getString("firstname");
            }else{
                y = 0;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_class.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login_class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return y;
    }

    
}
