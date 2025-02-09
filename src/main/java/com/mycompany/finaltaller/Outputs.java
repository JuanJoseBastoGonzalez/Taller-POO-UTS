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
public class Outputs {
      String message;
    public void Principal_menu(){
     message ="Lista de opciones \n\n"
             + "1. Correr \n"
             + "2. Descansar \n"
             + "3. Mostrar informacaion \n"
             + "4. Salir";
        JOptionPane.showMessageDialog(null, message,"MENU PRINCIPAL",JOptionPane.INFORMATION_MESSAGE );
    }
        public  void data_person_otput(Person person){
        String data_person=
                "Nombre :" + person.get_name()
                +"\n Edad :"+person.get_age()
                +"\n Fatiga :"+person.get_fatigue();
        JOptionPane.showMessageDialog(null, data_person,"Datos de "+ person.get_name(),JOptionPane.PLAIN_MESSAGE);
    }
    
}
