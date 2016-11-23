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
public class PrestamoEducativo extends Prestamo {
     //Declaracion de atributos
    private String nivel_estudio;
    private String centro_educativo;
    private Garante garante2;
    private Garante garante3;
    //Constructor de la clase 
    public PrestamoEducativo(String nivel_estudio, String centro_educativo, Garante garante2, Garante garante3, String nombre_beficiario, double sueldo, double monto_prestamo, double interes, int tiempo_prestamo_anios, Garante garate1) {
        super(nombre_beficiario, sueldo, monto_prestamo, interes, tiempo_prestamo_anios, garate1);
        setNivel_estudio(nivel_estudio);
        setCentro_educativo(centro_educativo);
        setGarante2(garante2);
        setGarante3(garante3);
    }
    //Métodod set y get de atributos privados
    public void setNivel_estudio(String nivel_e) {
        nivel_estudio = nivel_e;
    }

    public void setCentro_educativo(String nom_c_es) {
        centro_educativo = nom_c_es;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public void setGarante3(Garante g3) {
        garante3 = g3;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public String getCentro_educativo() {
        return centro_educativo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public Garante getGarante3() {
        return garante3;
    }
    // Devuelve representación String de un objeto PrestamoEducativo
    @Override
    public String toString() {
        return String.format("_________________________________PRESTAMO EDUCATIVO_________________________________\n %s\nNivel Estudio: %s\nNombre centro Educativo %s\nGarante 2:\nNombre: %s\nApellido: %s\nSueldo: %.2f\n", super.toString(), getNivel_estudio(), getCentro_educativo(), getGarante2().getNombre(), getGarante2().getApellido(), getGarante2().getSueldo());
    }
}
