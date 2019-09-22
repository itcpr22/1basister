/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Admin-1
 */

public class product {
    
    public void addProduct (String product_name, int quantity, String price){
        String sql = "insert into product values (null, '"+product_name+"', '"+quantity+"', '"+price+"')";
        System.out.println(sql);
}
}