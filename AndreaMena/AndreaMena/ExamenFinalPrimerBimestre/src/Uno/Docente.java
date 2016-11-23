/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author SALAS
 */
public class Docente {

    private String nombre;
    private String apellido;
    private String titulo;

    public Docente(String nombre, String apellido, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
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

    public void setTitulo(String t) {
        titulo = t;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n Apellido: %s\n Título: %s\n", getNombre(), getApellido(), getTitulo());

    }

}
