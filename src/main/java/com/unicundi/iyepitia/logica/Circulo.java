/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

/**
 * Clase que se encarga de calcular el perimetro y el area del circulo
 *@author  Caren Rodriguez
 * @author Ivan Espitia
 * 
 */
public class Circulo extends Figura {
/**
     * Declaracion de variables 
     */
    private double radio;
    /**
     * Constructor
     * @param radio 
     */
    public Circulo(double radio) {
        this.radio=radio;
    }    
    /**
     * Metodo que calcula el perimetro del circulo 
     * @return 
     */

    public double calcularPerimetro(){
        double perimetro;
        perimetro = 2*(Math.PI*radio);
        return 0;
    }
    /**
     * Metodo calcular area 
     * @return 
     */
    public double calcularArea(){
        double area;
        area = Math.PI*(radio*radio);
        return area;
    }
    /**
     * Metodo que imprime los resultados de area y perimetro del circulo  
     */
    
     public void imprimir(){
            System.out.println("El area :" +calcularArea());
        System.out.println("El perimetro :"+ calcularPerimetro());
        System.out.println("");
        System.out.println("");
    }
    
     /**
      * Metodo set Radio 
      * @param radio 
      */
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
