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
public class Prestamo {

    private String nombre_beficiario;
    private double sueldo;
    private double monto_prestamo;
    private double interes;
    private int tiempo_prestamo_anios;
    private Garante garate1;

    public Prestamo(String nombre_beficiario, double sueldo, double monto_prestamo, double interes, int tiempo_prestamo_anios, Garante garante1) {
        setNombre_beficiario(nombre_beficiario);
        setSueldo(sueldo);
        setMonto_prestamo(monto_prestamo);
        setInteres(interes);
        setTiempo_prestamo_anios(tiempo_prestamo_anios);
        setGarate1(garante1);
    }

    public String getNombre_beficiario() {
        return nombre_beficiario;
    }

    public void setNombre_beficiario(String n_beficiario) {
        nombre_beficiario = n_beficiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }

    public double getMonto_prestamo() {
        return monto_prestamo;
    }

    public void setMonto_prestamo(double m_prestamo) {
        monto_prestamo = m_prestamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double i) {
        interes = i;
    }

    public int getTiempo_prestamo_anios() {
        return tiempo_prestamo_anios;
    }

    public void setTiempo_prestamo_anios(int t_prestamo_anios) {
        tiempo_prestamo_anios = t_prestamo_anios;
    }

    public Garante getGarate1() {
        return garate1;
    }

    public void setGarate1(Garante g1) {
        garate1 = g1;
    }

    public double Valor_total_con_interes(double monto, double t_interes) {
        
        return (monto*t_interes)+ monto;

    }

    @Override
    public String toString() {
      
        return String.format("\n\t\t\t\tDATOS DEL PRÉSTAMO\nNombre Beneficiario: %s\tSueldo:%.2f\nMonto del Prestamo: %.2f\tInteres: %.2f\tTiempo Prestamo en años: %d\nGarante 1:\tNombre: %s\tApellido: %s\tSueldo: %f\nVALOR FINAL PRESTAMO: %.2f\n", getNombre_beficiario(), getSueldo(), getMonto_prestamo(), getInteres(), getTiempo_prestamo_anios(), getGarate1().getNombre(), getGarate1().getApellido(), getGarate1().getSueldo(),Valor_total_con_interes(monto_prestamo, interes));
    }
}
