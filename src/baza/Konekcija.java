/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;
import java.lang.System.Logger;
import java.sql.*;
import java.util.logging.Level;

/**
 *
 * @author user
 */
public class Konekcija {
    
    private static Konekcija instance;
    private Connection connection;
    
    private Konekcija(){
        try {
            String url = "jdbc:mysql://localhost:3306/PS_vanja_1";
            connection = DriverManager.getConnection(url, "root", "");
            connection.setAutoCommit(false);
            System.out.println("Uspesna konekcija sa bazom");
        
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        
    }

    public static Konekcija getInstance() {
        if(instance == null){
            instance = new Konekcija();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }


    
    
    
}
