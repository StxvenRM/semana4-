/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.sem4.sem4;

/**
 *
 * @author striv
 */
public class animal {
    
    private String nombre;

    public animal(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String hacerSonido(){
        return "Mi sonido es: ";
    }

    @Override
    public String toString() {
        return "animal{" + "nombre=" + nombre + '}';
    }
    
    
    
}
