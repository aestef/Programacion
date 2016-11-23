/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuatro;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Excepciones {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //MANEJO DE EXCEPCIONES
        try {   
            //Bloque de codigo cuando no hay erroes
            System.out.println("Ingrese su nombre");
            String nombre = scan.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = scan.nextLine();
            String[] calificaciones = {"10", "15", "l"};
            Persona p = new Persona(nombre, apellido, calificaciones);
            System.out.println(p);
            //Cuando se producen errores
        } catch (Exception e) {
            System.err.printf("\nExcepcion: %s\n",
                    e);
            scan.nextLine();
            System.out.println("\nError, NO es posible completar ejecucion.");

        }

    }
}
