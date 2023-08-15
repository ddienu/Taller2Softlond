/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.diegonunez.currencyconverter;

/**
 *
 * @author ddienu
 */
public class CurrencyConverter {

    public static void main(String[] args) {
        
        ConversorMonedas currency = new ConversorMonedas( 350000 );
        
        currency.copToUsd( 350000 );
        
        currency.usdToEuro( 250 );
        
        currency.copToEuro( 350000 );
               
    }
}
