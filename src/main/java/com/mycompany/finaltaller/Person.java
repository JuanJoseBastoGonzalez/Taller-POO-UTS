/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finaltaller;

import javax.swing.JOptionPane;

/**
 *
 * @author chimu
 */
public class Person {
       private String name;
    private int age;
    private int fatigue;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.fatigue = 0;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public int get_age() {
        return age;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public int get_fatigue() {
        return fatigue;
    }

    public void fun() {
        if (fatigue < 100) {
            fatigue++;
            String  message = name + " ha corrido.\n fatiga actual: " + fatigue;
            JOptionPane.showMessageDialog(null,message , "CORRIENDO...",JOptionPane.PLAIN_MESSAGE);
        } else {
            String message = name + " está demasiado fatigado para correr.";
            JOptionPane.showMessageDialog(null, message, "OH NO. ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void rest() {
        if (fatigue > 0) {
            fatigue--;
            String message = name + " ha descansado. fatiga actual:" + fatigue;
            JOptionPane.showMessageDialog(null, message, "CORRIENDO...", JOptionPane.PLAIN_MESSAGE);
        } else {
            String message = name + " no necesita descansar, la fatigua ya es 0.";
            JOptionPane.showMessageDialog(null, message, "OH NO.", JOptionPane.ERROR_MESSAGE);
        }
    }
}
