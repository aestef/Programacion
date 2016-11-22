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
public class Empleado {
    
    private String cedula;
    private String apellido;
    private int edad;
    private Fecha fechaContratacion;

    public Empleado(String c, String a, int e, Fecha f) {
       setCedula(c);
       setApellido(a);
       setEdad(e);
       setFechaContratacion(f);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Fecha getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Fecha fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    
    
   public String imprimir(){
        String cadena = String.format("El empleado con cedula %s, cuyo apellido es %s, tiene %d años de edad. Su fecha de contratacion fue Año-%d Mes-%d Dia %d",
                getCedula(), getApellido().toUpperCase(), getEdad(), getFechaContratacion().getAnio(), getFechaContratacion().getMes(), getFechaContratacion().getDia());
        return cadena;
    }
    
    
    
}
