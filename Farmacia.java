/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareagrupo;

/**
 *
 * @author Jorge Elvir
 */
public class Farmacia extends Hospital{
    private String medicamentos;
    public Farmacia(String color, String dimensiones, String pisos, String medicamentos){
    super(color, dimensiones, pisos);
    this.medicamentos = medicamentos;
    
        
    }
    public void mostrarDatos(){
        
        System.out.println("El color del edificio es: " + obColor()+
                "/ La dimension del edificio es: " + obDim()+
                "/ Los pisos del edificio son: " + obPisos()+
                "/ La farmacia vende:"+ medicamentos);        
     }   
   @Override
    public String obtenerInfo() {
        return "La informacion de la farmacia es:";
    }
    
}
 