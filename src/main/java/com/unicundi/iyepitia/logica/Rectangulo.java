/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

/**
 *Clase que se encarga de calcular el area y el perimetro del Rectangulo 
 * @author Ivan Espitia
 * @author Caren Rodriguez
 */
public class Rectangulo extends Figura{

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
      
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    /**
     * Metodo que calcula el perimetro del rectangulo
     * @return 
     */
    public double calcularPerimetro(){
        double perimetro;
        perimetro = (base*2)+(altura*2);
        return perimetro;
    }
    /**
     * Metodo que calcula el area del rectangulo 
     * @return 
     */
    public double calcularArea(){
        double area;
        area = (base*altura)*0.5;
        return area;
    }
    /**
     * Metodo que imprime los resultados de area y perimetro del rectangulo 
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
