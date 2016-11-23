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
public class Alumno {

    private String nombre;
    private String apellido;
    private Docente docente_programacion;
    private Docente docente_base_datos;

    public Alumno(String nombre, String apellido, Docente docente_programacion, Docente docente_base_datos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.docente_programacion = docente_programacion;
        this.docente_base_datos = docente_base_datos;
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

    public void setDocente_programacion(Docente d_programacion) {
        docente_programacion = d_programacion;
    }

    public Docente getDocente_programacion() {
        return docente_programacion;
    }

    public void setDocente_base_datos(Docente d_base_datos) {
        docente_base_datos = d_base_datos;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }
     @Override
    public String toString(){
        return String.format("Nombre: %s\n Apellido: %s\n Docente programacion: %s - %s \n Docente base datos:  %s- %s\n", getNombre(), getApellido(), getDocente_programacion().getNombre(),getDocente_programacion().getApellido(),getDocente_base_datos().getNombre(), getDocente_base_datos().getApellido());
        
    }
    
}
