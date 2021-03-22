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
public class Cuadrado extends Figura {
    double lado;

    
    public Cuadrado(double lado) {
        this.lado = lado;
        
    }
 
    public double calcularArea(){
        double area;
        area= lado*lado;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro;
        perimetro = (lado+lado+lado+lado);
        return perimetro;
    }
    
}
