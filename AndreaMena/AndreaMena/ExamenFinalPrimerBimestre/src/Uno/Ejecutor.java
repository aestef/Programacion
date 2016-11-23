/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        //Declaracion de variables
        boolean ingresar = true;
        String nombre;
        String apellido;
        String titulo;
        String n_docente;
        String a_docente;
        //Objetos de tipo Alumno, y Docente
        Alumno alum;
        Docente docente_pro;
        Docente docente_base;
        
        //Inicio - Ciclo while
        while (ingresar) {
            //Datos del Alumnos y profesores ingresados por teclado
            System.out.println("\n\t\tDATOS ALUMNO\n Ingrese nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese Apellido: ");
            apellido = entrada.nextLine();

            System.out.println("\n\tInformacion de docente Progrmacion\n Ingrese nombre: ");
            n_docente = entrada.nextLine();
            System.out.println("Ingrese Apellido: ");
            a_docente = entrada.nextLine();
            System.out.println("Ingrese el Titulo: ");
            titulo = entrada.nextLine();
           
            System.out.println("\n\tInformacion de Docente Base datos\n Ingrese nombre: ");
            n_docente = entrada.nextLine();
            System.out.println("Ingrese Apellido: ");
            a_docente = entrada.nextLine();
            System.out.println("Ingrese el Titulo: ");
            titulo = entrada.nextLine();
            
            //Instancias de objetos con los ingresados por teclado
            docente_pro = new Docente(n_docente, a_docente, titulo);    //Instancia del objeto Docente
            docente_base = new Docente(n_docente, a_docente, titulo); //Instancia del objeto Docente
            alum = new Alumno(nombre, apellido, docente_pro, docente_base); //Instancia del objeto Alumno
            
            //Presenatacion de datos Alumno-Docentes
            System.out.println("\n\t___________________ALUMNO INGRESADO___________________\n\n");
            System.out.println(alum.toString());
                        
            System.out.println("***********************\nDesea seguir ingresando: [1]SI\t [2]NO\n");
            int continuar = 1;
                   continuar = entrada.nextInt();
            if (continuar != 1) {   //Condicional segurir ingresando
                ingresar = true;
            } else {
                continuar = continuar + 1;

            }

        }

    }

}
