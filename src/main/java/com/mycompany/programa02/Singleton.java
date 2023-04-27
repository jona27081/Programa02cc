/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zS20006736
 */
public class Singleton {

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }

    public void test() {
        Logger.getLogger(Singleton.class.getName()).log(Level.INFO, "Conecto");
    }

}
