/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finaltaller;

/**
 *
 * @author chimu
 */
public class Menu {

    Outputs outputs = new Outputs();
    Inputs inputs = new Inputs();
  

public  void option_menu(int opcion, Person person){
    switch (opcion) {
        case 1:
            person.fun();
            break;
        case 2:
            person.rest();
            break;
        case 3:
            outputs.data_person_otput(person);
            break;
        case 4:
            break;
        default:
            throw new AssertionError();
    }

}
public void menu_return(Person person ){
    int is_active;
    do{
        outputs.Principal_menu();
       int option_menu= inputs.Input_menu_principal();
       option_menu(option_menu, person);
       is_active= inputs.retur_menu_principal();
 
       }
       while(is_active != 1);

}

}
