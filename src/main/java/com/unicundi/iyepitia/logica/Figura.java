/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

/**
 *Clase Abstracta, contiene los metodos que van a usar las demas clases 
 * @author Ivan Espitia
 * @author Caren Rodriguez
 */

/**
 * Clase padre 
 */
public abstract class Figura {
/**
 * Declaracion de Variables 
 */
  private  double area;
  private  double perimetro;
    
  /**
   * Constructor 
   */
  
    public Figura() {
        
    }
/**
 * metodo de tipo publico para calcular el perimetro 
 * @return 
 */
   public double calcularPerimetro(){
       return 0;
   }
   /**
 * metodo de tipo publico para calcular el área 
 * @return 
 */
   public double calcularArea(){
       return 0;
   }
   
 /**
 * metodo de tipo publico para imprimir los resultados 
 */  
    public void imprimir(){

    }
}
