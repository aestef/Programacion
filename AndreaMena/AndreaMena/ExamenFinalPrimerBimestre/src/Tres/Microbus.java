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
public class Microbus extends Vehiculo {
    //Declaracion de atributos
    private int rutas_diarias;
     //Constructor de la clase Microbus
    public Microbus(int rutas_diarias, String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
        setRutas_diarias(rutas_diarias);
    }
    
    public int getRutas_diarias() {
        return rutas_diarias;
    }
    
    public void setRutas_diarias(int r_diarias) {
        rutas_diarias = r_diarias;
    }
    //Clase abstracta para calcular el alquiler
    @Override
    public double obtener_precio_alquiler() {
        return base() + (10 * getRutas_diarias());
        
    }
    // Devuelve representación String de un objeto Vehículo
    @Override
    public String toString() {
        return String.format("_______________________\nTIPO: MICROBUS\n%s Rutas diarias: %d\n ", super.toString(), getRutas_diarias());
    }
}
