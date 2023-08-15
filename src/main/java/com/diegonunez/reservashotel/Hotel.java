/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.reservashotel;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class Hotel {
    
    private int opcion;
    private String nombreHotel;

    public Hotel() {
    }

    public void hotelesDisponibles() {
        System.out.println("Hotel Dann Carlton");
        System.out.println("Hotel Marriot");
        System.out.println("Hotel Tequendama");
    }
    
    public int getOpcion() {
        return opcion;
    }
    
    public String getNombreHotel(){
        return nombreHotel;
    } 
    
}
