/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationsms;
import java.sql.*;

/**
 *
 * @author Sameeksha Singh
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost/project";
    static final String USER = "root";
    static final String PASS = "Password@1234";
    public static Connection connectDB() throws SQLException{
        Connection conn = null;
        try{
            //class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
            catch(SQLException ex)
        {
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
}
