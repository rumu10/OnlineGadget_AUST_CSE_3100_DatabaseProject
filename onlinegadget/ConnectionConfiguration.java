/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinegadget;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class ConnectionConfiguration {
       public static Connection setConnection(){
           Connection connect = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseName="onlinegadget";
            String url="jdbc:mysql://localhost/"+databaseName;
            String user="root";
            String password="";
            connect = DriverManager.getConnection(url,user,password);
            
            System.out.println("Successfully connected..");
        }catch(Exception e){
            System.out.println("Connection Problem..");
            e.printStackTrace();
        }
        return connect;
    }
}
