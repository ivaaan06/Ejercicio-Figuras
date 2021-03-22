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
public class Rectangulo extends Figura{

   
      private double base;
      private double altura;
    
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    //
    public double calcularPerimetro(){
        double perimetro;
        perimetro = (base*2)+(altura*2);
        return perimetro;
    }
    public double calcularArea(){
        double area;
        area = (base*altura)*0.5;
        return area;
    }
    
     public void imprimir(){
            System.out.println("El area :" +calcularArea());
        System.out.println("El perimetro :"+ calcularPerimetro());
        System.out.println("");
        System.out.println("");
    }
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
