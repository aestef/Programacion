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
public class PrestamosAutomovil extends Prestamo {
    //Declaracion de atributos

    private String tipo_vehiculo;
    private String marca_vehiculo;
    private Garante garante2;

    //Constructor de la clase 
    public PrestamosAutomovil(String nombre_debeneficiario, double sueldo, double monto_prstamo, double interes, int tiempo_prestamo, Garante garante_1, String tipo_vehiculo, String marca_vehiculo, Garante garante_2) {
        super(nombre_debeneficiario, sueldo, monto_prstamo, interes, tiempo_prestamo, garante_1);
        setTipo_vehiculo(tipo_vehiculo);
        setMarca_vehiculo(marca_vehiculo);
        setGarante2(garante_2);
    }

    //Métodod set y get de atributos privados
    public void setTipo_vehiculo(String tipo_vehi) {
        tipo_vehiculo = tipo_vehi;
    }

    public void setMarca_vehiculo(String marca_vehi) {
        marca_vehiculo = marca_vehi;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    //Devuelve representación String de un objeto PrestamoAutomovil
    @Override
    public String toString(){
        return String.format("_________________________________PRESTAMO AUTOMOVIL_________________________________%sTipo Vehiculo: %s\nMarca vehiculo: %s\nGarante 2\t\nNombre: %s\tApellido: %s\tSueldo: %.2f\n", super.toString(), getTipo_vehiculo(),getMarca_vehiculo(), getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo());
    }
}
