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
public class EjecutorTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia y declaracion de los elementos segun cada vehículo
        Coches co = new Coches(10, "123M", "Rojo", "Mazda", 5);
        Microbus m = new Microbus(20, "1145M", "Verde", "Mercedez", 10);
        Furgoneta f = new Furgoneta("456M", "Amarrilla", "Toyota", 15);
        Camiones ca = new Camiones(3, "852M", "Blanco", "Chevrolet", 12);

        // Instancia del ArrayList tipo Vehículo
        Vehiculo listaVehiculos[] = new Vehiculo[4];
        
        // Asignacion de cada vehículo
        listaVehiculos[0] = co;
        listaVehiculos[1] = m;
        listaVehiculos[2] = f;
        listaVehiculos[3] = ca;
        //Impressión de cada elemento del ArrayList vehículos
        for (Vehiculo algun : listaVehiculos) {
            System.out.printf("%s \n Valor de Alquler: %.2f\n\n", algun, algun.obtener_precio_alquiler());
        }

    }

}
