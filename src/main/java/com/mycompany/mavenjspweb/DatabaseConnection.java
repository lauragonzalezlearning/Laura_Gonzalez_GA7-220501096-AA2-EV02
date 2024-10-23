
package com.mycompany.mavenjspweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    
    protected static Connection initializeConnection()
            throws SQLException, ClassNotFoundException
    {
        String dbDriver ="com.mysql.cj.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "mavenjspweb";
        String dbUsername = "root";
        String dbPassword = "root";
        
        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                                                       dbUsername,            
                                                       dbPassword);
        return con;
    }
    
}
