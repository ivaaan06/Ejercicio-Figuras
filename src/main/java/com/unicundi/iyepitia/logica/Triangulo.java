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
public class Triangulo {

  
    //contructor
    public Triangulo() {
    }
    
    public void setBase(double base) {
        this.base = base;
    }

  
    public void setAltura(double altura) {
        this.altura = altura;
    }
    double base;
    double altura;

    
    
    public double calcularArea(){
        return (base*altura)/2;
    }
    public double calcularPerimetro(){
        double hipotenusa = Math.sqrt((base*base)+(altura*altura));
        return base+altura+hipotenusa;
    }
    
     public void imprimir(){
            System.out.println("El area :" +calcularArea());
        System.out.println("El perimetro :"+ calcularPerimetro());
        System.out.println("");
        System.out.println("");
    }
    
    
    
    
    
}
