/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finaltaller;

/**
 *
 * @author chimu
 */
public class Main {

  public static void main(String[] args) {
    
    Inputs inputs = new Inputs();
    String name = inputs.set_name();
    int age = inputs.set_age();
    Person person = new Person(name, age);
    Menu menu = new Menu();
    menu.menu_return(person);

  }
}
