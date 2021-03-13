/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.superclasehospital;

/**
 *
 * @author Jorge Elvir
 */
public abstract class Hospital {
    
    private String color;
    private String dimensiones;
    private String pisos;
    
    public Hospital(String color, String dimensiones, String pisos){           
        
        this.color = color;
        this.dimensiones = dimensiones; 
        this.pisos = pisos; 
    }
    
    public void estColor(String color){
        this.color = color;
        
           
    }
    public void estDim(String dimensiones){
        
        this.dimensiones = dimensiones; 
           
    }
    public void estPisos(String pisos){
        
        this.pisos = pisos;
           
    }
    
    public String obColor(){
        
       return color ;
           
    }
     public String obDim(){
        
       return dimensiones;
           
    }
      public String obPisos(){
        
       return pisos ;
           
    }
     
     
     abstract String obtenerInfo();
     
    
}