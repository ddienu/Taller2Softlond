/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.diegonunez.calculator;

/**
 *
 * @author ddienu
 */
public class Calculator {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        calc.suma(5, 8);
        calc.resta(5, 8);
        calc.multiplicacion(5, 8);
        calc.division(5, 8);
    }
}
