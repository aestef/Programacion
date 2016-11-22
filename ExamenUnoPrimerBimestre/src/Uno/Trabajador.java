/*
 * Crear una clase Trabajador, con tres variables: primer nombre, apellidos, 
    salario mensual fijo.

 */
package Uno;

/**
 *
 * @author Usuario
 */
public class Trabajador {

    private String primerNombre;
    private String apellidos;
    private double salario;

    public Trabajador(String n, String a, double s) {
       setPrimerNombre(n);
       setApellidos(a);
       setSalario(s);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
