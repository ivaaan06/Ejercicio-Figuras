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
public class Circulo extends Figura {

    private double radio;
    public Circulo(double radio) {
        this.radio=radio;
    }    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 2*(Math.PI*radio);
        return 0;
    }
    public double calcularArea(){
        double area;
        area = Math.PI*(radio*radio);
        return area;
    }
    
     public void imprimir(){
            System.out.println("El area :" +calcularArea());
        System.out.println("El perimetro :"+ calcularPerimetro());
        System.out.println("");
        System.out.println("");
    }
    
    
    
    
    
}
