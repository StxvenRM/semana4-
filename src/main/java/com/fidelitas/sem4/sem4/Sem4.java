/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fidelitas.sem4.sem4;

/**
 *
 * @author striv
 */
public class Sem4 {

    public static void main(String[] args) {

        animal perro = new golden("Oliver");
        mamifero gato = new persa("Molly");
        Ave pato = new pekin("Lucas");
        animal perro2 = new shihtzu("Titu");
        
        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
        System.out.println(perro2.hacerSonido());
        System.out.println("*****LOS PATOS*****");
        System.out.println(pato.hacerSonido());
    }
}

//hola desde royvin
//hola