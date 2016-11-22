/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Mauricio", "Mora", 350);
        Trabajador t2 = new Trabajador("Anabelle", "Castro", 400);

        System.out.println("Nombre\t\t| Apellido\t| Salario Mensual|\tSalario Anual");
        System.out.print("\n"+t1.getPrimerNombre());
        System.out.print("\t\t"+t1.getApellidos());
        System.out.print("\t\t"+t1.getSalario());
        double st1Anual = (t1.getSalario() + (t1.getSalario() * 0.15)) * 12;
        System.out.print("\t\t"+st1Anual);

        System.out.print("\n"+t2.getPrimerNombre());
        System.out.print("\t\t"+t2.getApellidos());
        System.out.print("\t\t"+t2.getSalario());
        double st2Anual = (t2.getSalario() + (t2.getSalario() * 0.15)) * 12;
        System.out.print("\t\t"+st2Anual+"\n\n");
    }

}
