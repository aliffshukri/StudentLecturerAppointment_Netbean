/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

//data base connection 

import java.sql. *;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane; //show popup

public class ConnectJ {
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/oopproject", "root", "");
            System.out.println("Connection Successful!");
            return  conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
}
