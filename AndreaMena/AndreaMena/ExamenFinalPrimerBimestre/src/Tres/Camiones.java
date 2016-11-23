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
public class Camiones extends Vehiculo {
    //Declaracion de atributos
    private int toneladas;
     //Constructor de la clase Camiones
    public Camiones(int toneladas, String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
        setToneladas(toneladas);
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int t) {
        toneladas = t;
    }
    //Clase abstracta para calcular el alquiler
    @Override
    public double obtener_precio_alquiler() {
        return base() + (20 * getToneladas());
    }
    // Devuelve representación String de un objeto Vehículo
    @Override
    public String toString() {
        return String.format("_______________________\nTIPO: CAMIÓN\n %s Toneladas: %d \n", super.toString(), getToneladas());
    }

}
