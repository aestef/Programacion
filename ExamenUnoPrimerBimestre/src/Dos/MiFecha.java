/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author Usuario
 */
public class MiFecha {
    private int dia;
    private int mes;
    private int anio;

    public MiFecha(int a, int d, int m) {
        setDia(d);
        setMes(m);
        setAnio(a);
    }
    
    public MiFecha(int a, int d) {
        setDia(d);
        setAnio(a);
    }
    
    public MiFecha(int di) {
        setDia(di);
       
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        dia = d;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        mes = m;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int a) {
        anio = a;
    }
            
     public String imprimir() {
        
        String cadena = String.format("La fecha ingresada es: \n Mes: %d\n Dia: %d\n Año: %d \n", getMes(), getDia(), getAnio());
        return cadena;
    }
    
    
    
}
