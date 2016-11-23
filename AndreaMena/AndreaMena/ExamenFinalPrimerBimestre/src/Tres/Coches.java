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
public class Coches extends Vehiculo {
    //Declaracion de atributos
    private int n_pasajeros;
     //Constructor de la clase Coches
    public Coches(int n_pasajeros, String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
        setN_pasajeros(n_pasajeros);
    }

    public int getN_pasajeros() {
        return n_pasajeros;
    }

    public void setN_pasajeros(int pasajeros) {
        n_pasajeros = pasajeros;
    }
    //Clase abstracta para calcular el alquiler
    @Override
    public double obtener_precio_alquiler() {
        return (base() + (5 * getN_pasajeros()));
    }
    // Devuelve representación String de un objeto Vehículo
    @Override
    public String toString() {
        return String.format("_______________________\nTIPO: COCHE\n%s Pasajeros: %d\n", super.toString(), getN_pasajeros());
    }
}
