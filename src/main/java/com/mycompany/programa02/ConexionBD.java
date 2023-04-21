/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zS20006736
 */
public class ConexionBD {

    private static Connection conexion;

    private ConexionBD() {
        String url = "jdbc:postgresql://localhost:5433/ejemplo";
        String usuario = "postgres";
        String contra = "123456789";
        
        try {
            conexion  = DriverManager.getConnection(url, usuario, contra);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.INFO, "Se conecto la BD");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getInstance() {
        if (conexion == null) {
            new ConexionBD();
        }
        return conexion;
    }

    
}
