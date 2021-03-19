/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

/**
 *
 * @author Ivan Espitia
 */
public class Figura {

    double area;
    double perimetro;

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    

   public double calcularPerimetro(){
       return 0;
   }
   public double calcularArea(){
       return 0;
   }
    public void imprimir(){
        System.out.println("El area :" +area);
        System.out.println("El perimetro :"+ perimetro);
        System.out.println("");
        System.out.println("");
    }
}
