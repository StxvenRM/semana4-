/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.sem4.sem4;

/**
 *
 * @author striv
 */
public class golden extends perro{
    
    public golden(String nombre) {
        super(nombre);
    }
    
      @Override
    public String hacerSonido() {
        return super.hacerSonido() + " (De Golden Retriever) ";
    }
    
}
