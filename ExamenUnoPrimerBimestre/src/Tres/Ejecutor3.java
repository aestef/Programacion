/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author Usuario
 */
public class Ejecutor3 {
    
     public static void main(String[] args){

    Fecha f1 = new Fecha(2005, 12, 8);
    Fecha f2 = new Fecha(2010, 1, 1);

    Empleado t1 = new Empleado("1104718612", "Mora", 35, f1);
    Empleado t2 = new Empleado("1105114889", "Calva", 29, f2);

    System.out.println(t1.imprimir());


     }

}
