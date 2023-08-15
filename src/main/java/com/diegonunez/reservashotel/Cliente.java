/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.reservashotel;

import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class Cliente {
    
    private String nombreEmpresa;
    private String nombreEmpleado;
    private int cedulaEmpleado;
    //private int habReservada;
    
    public Cliente(){
        
    }
    
    public void ingresarNombres(){
        Scanner scan = new Scanner ( System.in );
        
        System.out.println("Ingrese el nombre de la empresa que hace la reserva: ");
        nombreEmpresa = scan.nextLine();
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = scan.nextLine();
        
        System.out.println("Ingrese la cédula del empleado:  ");
        cedulaEmpleado = scan.nextInt();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }
    
    
}
