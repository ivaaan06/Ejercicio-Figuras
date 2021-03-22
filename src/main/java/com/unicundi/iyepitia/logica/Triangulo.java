/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

/**
 *que se encarga de calcular el perimetro y el area del Triangulo
 * @author Ivan Espitia
 * @author Caren Rodriguez
 */
public class Triangulo extends Figura{

  /**
   * Declaracion de variables 
   */
    private double base;
    private double altura;
/**
 * Constructor 
 * @param base
 * @param altura 
 */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
 /**
  * Metodo que calcula el area del triangulo 
  * @return 
  */ 
    public double calcularArea(){
        return (base*altura)/2;
    }
 /**
  * Metodo que calcula el perimetro del triangulo 
  * @return 
  */   
    public double calcularPerimetro(){
        double hipotenusa = Math.sqrt((base*base)+(altura*altura));
        return base+altura+hipotenusa;
    }
  /**
   * Metodo que imprime los resultados de área y perimetro del Triangulo 
   */  
     public void imprimir(){
            System.out.println("El area :" +calcularArea());
        System.out.println("El perimetro :"+ calcularPerimetro());
        System.out.println("");
        System.out.println("");
    }
    /**
     * Metodo set base 
     * @param base 
     */
     
     public void setBase(double base) {
        this.base = base;
    }
   /**
    * Metodo set altura 
    * @param altura 
    */
  
    public void setAltura(double altura) {
        this.altura = altura;
    } 
    
    
    
    
}
