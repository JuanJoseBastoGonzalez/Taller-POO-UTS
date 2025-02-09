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
public class Inputs {
    public String set_name() {
        String name;
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Ingrese su nombre", "GET NAME", JOptionPane.PLAIN_MESSAGE);

            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre válido", "NAME ERROR", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (!input.matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras y espacios", "NAME ERROR", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            name = input.trim(); 
            break;
        }
        return name;
    }

    public int set_age() {
        int age;
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Ingrese su edad", "GET AGE", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido", "AGE ERROR", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            try {
                age = Integer.parseInt(input);
                if (age <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese una edad válida (mayor que 0)", "AGE ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero", "AGE ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return age;
    }
    
public int Input_menu_principal() {
    int opcion;
    while (true) {
        String input = JOptionPane.showInputDialog(null, "Ingresa una opcion↓", "GET OPTION", JOptionPane.QUESTION_MESSAGE);

  
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido", "OPTION ERROR", JOptionPane.ERROR_MESSAGE);
            continue;
        }

        try {
            opcion = Integer.parseInt(input.trim()); 
            if (opcion <= 0) {
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida (mayor que 0)", "OPTION ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                return opcion; 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero", "OPTION ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
 
     public  int retur_menu_principal() {
        int opcion_return = JOptionPane.showConfirmDialog(
            null,
            "¿Desea volver al menú anterior?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION
        );

        return opcion_return; 
    }
}
