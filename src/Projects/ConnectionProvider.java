/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;
import java.sql.*;
import java.util.*;
/**
 *
 * @author kratika tugnawat
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
            
            try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/hostel","root","kunal2425");
        return con;
    }
    catch(Exception e){
       return null;
}
}
}
