/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa02;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zS20006736
 */
public class Usuario {

    private String nombre;
    private String clave;
    private String direccion;
    private String numero;

    public Usuario(String clave, String nombre, String direccion, String numero) {
        this.clave = clave;
        this.direccion = direccion;
        this.nombre = nombre;
        this.numero = numero;
    }

    Usuario() {
    }

    public void insertOne(String cv, String nom, String dirr, String num){
        
        String sql = "insert into usuarios(clave,nombre,direccion,telefono) values('"+cv+"','"+nom+"','"+dirr+"','"+num+"');";
        
        try {
            Connection conn = ConexionBD.getInstance();
            java.sql.Statement st = conn.createStatement();
            st.execute(sql);
            st.close();
            conn.close();
            Logger.getLogger(Usuario.class.getName()).log(Level.INFO, "se guardo");
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.INFO, "No se guardo");
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
