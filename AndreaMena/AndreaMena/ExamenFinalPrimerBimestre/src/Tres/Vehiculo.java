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
public  abstract class Vehiculo {
    //Declaracion de atributos
    private String matricula;
    private String color;
    private String marca;
    private int dias_alquiler;
    
    //Constructor de la clase Vehículo
    public Vehiculo(String matricula, String color, String marca, int dias_alquiler) {
        setMatricula(matricula);
        setColor(color);
        setMarca(marca);
        setDias_alquiler(dias_alquiler);
    }
    //Métodod set y get de atributos privados
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String mat) {
        matricula = mat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(int d_alquiler) {
        dias_alquiler = d_alquiler;
    }
    //Cálculo de precio base
    public double base(){
        return 50 * dias_alquiler;
    }
    //Clase abstracta para calcular el alquiler
    public abstract double obtener_precio_alquiler();
    
    
    @Override
    public String toString() {
        return String.format("_______________________ \n Matrícula: %s\n Color: %s\n Marca: %s\n Días de Alquiler: %d\n", getMatricula(), getColor(), getMarca(), getDias_alquiler());
    }
    
}
