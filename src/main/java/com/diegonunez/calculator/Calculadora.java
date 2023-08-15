/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.calculator;

/**
 *
 * @author ddienu
 */
public class Calculadora {
    
    public void suma( double num1, double num2){
        double suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " + " + num2 + " = " 
                + suma);
    }
    public void resta( double num1, double num2){
        double resta = num1 - num2;
        
        System.out.println("La suma de " + num1 + " - " + num2 + " = " 
                + resta);
    }
    public void multiplicacion( double num1, double num2){
        double multiplicacion = num1 * num2;
        
        System.out.println("La suma de " + num1 + " * " + num2 + " = " 
                + multiplicacion);
    }
    public void division( double num1, double num2){
        double division = num1 / num2;
        
        System.out.println("La suma de " + num1 + " / " + num2 + " = "
                + division);
    }
}
