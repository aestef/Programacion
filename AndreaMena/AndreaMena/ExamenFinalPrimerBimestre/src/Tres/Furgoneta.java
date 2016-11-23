/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author SALAS
 */
public class Furgoneta extends Vehiculo {
     //Constructor de la clase Furgoneta
    public Furgoneta(String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
    }
     //Clase abstracta para calcular el alquiler
    @Override
    public double obtener_precio_alquiler() {
        return base() + 100;
    }
    // Devuelve representación String de un objeto Vehículo
    @Override
    public String toString() {
        return String.format("_______________________\nTIPO: FURGONETA\n %s: ", super.toString());
    }
}
