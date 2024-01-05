/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationsms;

/**
 *
 * @author Sameeksha Singh
 */
import java.sql.*;
//this is for practice for company
public class NewClass{
    public static void main(String args[])
    {
        try
        {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //jdbc protocol,subprotocol mysql(database),ip address(localhost for same system,port no,project database name
            //username - database username
            //dp password   
            String url = "jdbc:mysql://localhost:3306/project";
            String username = "root";
            String password = "Password@1234";
            
            Connection con = DriverManager.getConnection(url,username,password);
            
            if(con.isClosed())
            {
                System.out.println("Connection is closed");
            }
            else
            {
                System.out.println("created");
            }
            //create a query
            //String q = "create table t1(id int);";
            //create a statement
            
            //Statement s = con.createStatement();
            
            //s.executeUpdate(q);
            
            //System.out.println("table created");
            
            //for parameterized or dynamic query we use prepared statement
//            String q = "insert into student(name,age) values(?,?);";
//            PreparedStatement s = con.prepareStatement(q);
//            //in first column set value
//            s.setString(1, "rahul");
//            s.setInt(2, 5);
            
            //we can also take input to this values  
            
           // s.executeUpdate();// query should not be passed as it is already passed
            //System.out.println("inserted");
            
            String q = "select * from student;";
            
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(q);
            
            while(r.next())
            {
                int id = r.getInt(1);
                String name = r.getString(2);
                System.out.println(id+" "+name);
            }
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
