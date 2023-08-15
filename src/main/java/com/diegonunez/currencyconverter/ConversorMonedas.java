/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.currencyconverter;

import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class ConversorMonedas {

    private final double quantity;

    public ConversorMonedas( double quantity){
        this.quantity = quantity;
    }
    
    public void copToUsd( double quantity ){
        double usd = quantity * 0.00025;
        
        System.out.println(quantity + " pesos colombianos en dólares es: " + "$" +
                usd );
    }
    
    public void usdToEuro(double quantity ){
        double euros = quantity * 0.91;
        
        System.out.println("$" + quantity + " dólares en euros es: " + "€" +
                euros );
    }
    
    public void copToEuro(double quantity ){
        double euros = quantity * 0.00023;
        
        System.out.println(quantity + " pesos colombianos en euros es: " + "€" +
                euros );
    }    
}
