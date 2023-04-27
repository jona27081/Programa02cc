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
        
        Singleton singleton = Singleton.getInstance();
        singleton.test();
        
    }
}
