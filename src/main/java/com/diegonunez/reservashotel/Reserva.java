/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.reservashotel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class Reserva {

    ArrayList<String> habitacionesReservadas = new ArrayList<>();
    ArrayList<String> nombresEmpresas = new ArrayList<>();
    ArrayList<String> nombresReservas = new ArrayList<>();
    ArrayList<Integer> cedulasReservas = new ArrayList<>();
    ArrayList<String> hotelesReserva = new ArrayList<>();



    private String nombreReserva;
    private String nombreEmpresa;
    private int cedula;
    private String habitacion;
    private String nombreHotel;
    private String prefijo;

    public Reserva() {

    }

    public void reservarHabitacion() {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("RESERVAR HABITACIONES");
        System.out.println("");
        
        System.out.println("Ingrese el nombre del hotel: ");
        nombreHotel = scan.nextLine().trim().toLowerCase();
        hotelesReserva.add( nombreHotel );
        
        System.out.println("Ingrese la habitación que desea reservar: ");
        habitacion = scan.nextLine();
        
        if( nombreHotel.equals("hotel marriot")){
            prefijo = "m";
        }else if( nombreHotel.equals("hotel tequendama")){
            prefijo = "t";
        }else{
            prefijo = "d";
        }
        
        
        
        if (!habitacionesReservadas.contains(prefijo + habitacion)) {
            System.out.println(prefijo + habitacion);
            habitacionesReservadas.add(prefijo + habitacion);
        }else{
            do{
            System.out.println("La habitación se encuentra reservada"
                    + " seleccione una diferente");
            habitacion = scan.nextLine();
            }while( habitacionesReservadas.contains(prefijo + habitacion));
            habitacionesReservadas.add(prefijo + habitacion);
        }

        System.out.println("Ingrese el nombre de la empresa que la reserva: ");
        nombreEmpresa = scan.nextLine();
        nombresEmpresas.add(nombreEmpresa);
        
        
        System.out.println("Ingrese el nombre de la persona que la reserva: ");
        nombreReserva = scan.nextLine();
        nombresReservas.add(nombreReserva);

        System.out.println("Ingrese la cedula de la persona que la reserva: ");
        cedula = scan.nextInt();
        cedulasReservas.add(cedula);
    }

    public void mostrarInformacion() {
        for (int i = 0; i < habitacionesReservadas.size(); i++) {
            System.out.println("id de reserva: " + (i+1));
            System.out.println("Hotel: " + hotelesReserva.get(i));
            System.out.println("Nombre empresa: " + nombresEmpresas.get(i));
            System.out.println("Habitación: " + habitacionesReservadas.get(i).substring(1));
            System.out.println("Nombre: " + nombresReservas.get(i));
            System.out.println("Cédula: " + cedulasReservas.get(i));
            System.out.println();
        }
    }

    public void cancelarReserva() {
        int numReservaCancelar;
        
        Scanner scan = new Scanner( System.in );
        System.out.println("CANCELAR RESERVAS");
        System.out.println("");
        
        System.out.println("Estas son las reservas hasta el momento: ");
        System.out.println("");
        mostrarInformacion();
        System.out.println("");
        System.out.println("Ingrese el id de la reserva que desea cancelar: ");
        numReservaCancelar = scan.nextInt();
        
        habitacionesReservadas.remove( numReservaCancelar - 1);
        nombresEmpresas.remove( numReservaCancelar - 1);
        nombresReservas.remove( numReservaCancelar - 1);
        cedulasReservas.remove( numReservaCancelar - 1);
        
        System.out.println("RESERVA CANCELADA CON ÉXITO");
         
    }

}
