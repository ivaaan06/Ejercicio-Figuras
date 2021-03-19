/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.principal;

import com.unicundi.iyepitia.logica.Circulo;
import com.unicundi.iyepitia.logica.Cuadrado;
import com.unicundi.iyepitia.logica.Rectangulo;
import com.unicundi.iyepitia.logica.Triangulo;
import com.unicundi.iyepitia.logica.Utilitarios;
import java.util.Scanner;

/**
 *
 * @author Ivan Espitia
 */
public class Principal {
    
    
    public static void main(String[] args){
        
        Utilitarios util = new Utilitarios();
        Scanner scan = new Scanner(System.in);
        String respuesta = "s";
        int opc =0;
        do{
            System.out.println("--figuras geometricas--");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Circulo");
            System.out.println("Seleccione la figura para calcular area y perimetro");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Cuadrado");
                    System.out.println("Ingrese el valor del lado");
                    Cuadrado cua1 = new Cuadrado(scan.nextDouble());
                    
                    util.imprimir(cua1.calcularArea(), cua1.calcularPerimetro());
                    break;
                case 2:
                    Triangulo tri = new Triangulo();
                    System.out.print("Triangulo");
                    System.err.println("ingrese la altura");
                    tri.setAltura(scan.nextDouble());
                    System.err.println("Ingrese la base");
                    tri.setBase(scan.nextDouble());
                    util.imprimir(tri.calcularArea(), tri.calcularPerimetro());
                            
                    break;
                case 3:
                    Rectangulo rec1 = new Rectangulo(0, 0);
                    System.out.println("Rectangulo");
                    System.out.println("Ingrese la altura");
                    rec1.setAltura(scan.nextDouble());
                    System.out.println("Ingrese la base");
                    rec1.setBase(scan.nextDouble());
                    util.imprimir(rec1.calcularArea(), rec1.calcularPerimetro());
                    break;
                case 4:
                    Circulo cir1 = new Circulo(0);
                    System.out.println("Circulo");
                    System.out.println("Ingrese el radio");
                    cir1.setRadio(scan.nextDouble());
                    util.imprimir(cir1.calcularArea(), cir1.calcularPerimetro());
                    break;
                default:
                    
            }
            System.out.println("Desea ingresar una nueva figura S/N"); 
            respuesta=scan.next();
            
        }while(respuesta != "S" || respuesta != "s");  
    }
     
    
   

}

