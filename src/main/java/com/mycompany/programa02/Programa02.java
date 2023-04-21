/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa02;

import javax.swing.JOptionPane;

/**
 *
 * @author zS20006736
 */
public class Programa02 {

    public static void main(String[] args) {
        
        Usuario ins = new Usuario();
        String clave = JOptionPane.showInputDialog(null, "Clave: ");
        String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
        String dir = JOptionPane.showInputDialog(null, "Direccion: ");
        String num = JOptionPane.showInputDialog(null, "Numero: ");
        ins.insertOne(clave, nombre, dir, num);
        //System.out.println(clave + nombre + dir + num);
        
    }
}
