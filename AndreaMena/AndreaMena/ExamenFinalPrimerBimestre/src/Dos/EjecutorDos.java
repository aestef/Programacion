/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author Usuario
 */
public class EjecutorDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia y declaracion de los elementos tipo Garante
        Garante g1 = new Garante("Pablo", "Saritama", 1200);
        Garante g2 = new Garante("Anabel", "Moncayo", 1600);
        Garante g3 = new Garante("David", "Andrade", 990);
        
        // Instancia y declaracion de los elementos tipo PrestamosAutomovil
        PrestamosAutomovil presA1 = new PrestamosAutomovil("Mauricio", 1500, 10000, 0.06, 4, g1, "Auto", "Ford", g2);
        PrestamosAutomovil presA2 = new PrestamosAutomovil("Pamela ", 900, 5000, 0.05, 3, g1, "Camioneta", "Toyota", g2);
        
        // Instancia y declaracion de los elementos tipo PrestamoEducativo
        PrestamoEducativo presE1 = new PrestamoEducativo("Tercer Nivel", "UTPL", g2, g3, "Miguel Costa", 400, 3000, 0.07, 2, g1);
        PrestamoEducativo presE2 = new PrestamoEducativo("Tercer Nivel", "CASTELLANA", g2, g3, "Valeria Vega", 370, 3500, 0.05, 3, g1);
        PrestamoEducativo presE3 = new PrestamoEducativo("Tercer Nivel", "UDLA", g2, g3, "Pablo Ontaneda", 500, 4000, 0.06, 4, g1);
        //Impresion de objetos
        System.out.println("\t\t\t\t\t\t==================DETALLE DE PRESTAMOS==================");
        System.out.println(presA1);
        System.out.println(presA2);
        System.out.println(presE1);
        System.out.println(presE2);
        System.out.println(presE3);

    }

}
