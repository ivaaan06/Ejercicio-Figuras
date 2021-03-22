/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

/**
 * Clase que se encarga de calcular el perimetro y el area del cuadrado
 *@author  Caren Rodriguez
 * @author Ivan Espitia
 * 
 */
public class Cuadrado extends Figura {
    /**
     * Declaracion de la variable lado 
     */
   private double lado;
    /**
     * Constructor 
     * @param lado 
     */
    public Cuadrado(double lado) {
        this.lado = lado;
        
    }
    /**
     * Metodo que calcula el area del cuadrado
     * @return 
     */
    public double calcularArea(){
        double area;
        area= lado*lado;
        return area;
    }
    /**
     * Metodo que calcula el perimetro del cuadrado
     * @return 
     */
    public double calcularPerimetro(){
        double perimetro;
        perimetro = (lado+lado+lado+lado);
        return perimetro;
    }
    
   /**
     * Metodo para imprimir los resultados de area y perimetro
     */
    public void imprimir(){
            System.out.println("El area :" +calcularArea());
        System.out.println("El perimetro :"+ calcularPerimetro());
        System.out.println("");
        System.out.println("");
    }
   /**
    * Metodo Set de lado 
    * @param lado 
    */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
   
    
}
