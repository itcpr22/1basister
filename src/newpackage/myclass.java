/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin-1
 */
public class myclass {
    
    public void addProduct (String product_name, int quant, String price) throws SQLException{
        
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String conURL = "jdbc:mysql://localhost/liadocactivity?"
            + "user=root&password=";

            Connection con = DriverManager.getConnection(conURL);
            String sql = "Insert into producttable values (null, '"+product_name+"', '"+quant+"', '"+price+"')";
            //PreparedStatement psmt = (preparedStatement) conn.preparedStatement();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(myclass.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
