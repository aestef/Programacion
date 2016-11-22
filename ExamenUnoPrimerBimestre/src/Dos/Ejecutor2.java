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
public class Ejecutor2 {

    public static void main(String[] args) {
        MiFecha f1 = new MiFecha(2005, 30, 9);
        MiFecha f2 = new MiFecha(1999, 25);
        MiFecha f3 = new MiFecha(23);
        
        System.out.println(f1.imprimir());
        System.out.println(f2.imprimir());
        System.out.println(f3.imprimir());

    }

}
