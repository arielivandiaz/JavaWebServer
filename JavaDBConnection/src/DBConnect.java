
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flash
 */
public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st= con.createStatement();
            
            
        }catch (Exception ex){
            System.out.println("Error "+ex);
        }
    }
    
    public void getData(){
        try{
            
            String query = "select * from persons";
            rs= st.executeQuery(query);
            System.out.println("Recors from DATABASe:");
            while(rs.next()){
                String name = rs.getString("name");
                String id = rs.getString("id");
                String age = rs.getString("age");
                System.out.println("Name : "+name+" Edad: "+age+" Id: "+id);
            }
            
        }catch (Exception ex){
            System.out.println("Error gettint data  "+ex);
        }
    }
}
