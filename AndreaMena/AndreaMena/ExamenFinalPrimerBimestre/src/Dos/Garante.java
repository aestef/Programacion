/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author SALAS
 */
public class Garante {

    private String nombre;
    private String apellido;
    private double sueldo;

    public Garante(String nombre, String apellido, double sueldo) {
        setNombre(nombre);
        setApellido(apellido);
        setSueldo(sueldo);
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public String getApellido() {
        return apellido;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }

    public double getSueldo() {
        return sueldo;
    }

}
