/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.diegonunez.reservashotel;

import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class ReservasHotel {

    public static void main(String[] args) {

        Hotel menuHotel = new Hotel();
        Reserva reservacion = new Reserva();

        System.out.println("BIENVENIDO AL SISTEMA DE RESERVA");

        do {
            System.out.println("1. Ver los hoteles disponibles.");
            System.out.println("2. Reservar habitaciones.");
            System.out.println("3. Cancelar reservas.");
            System.out.println("4. Imprimir totalidad de reservas");
            System.out.println("5. Salir.");

            int opcion;
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese la opción que desea emplear. ");
            opcion = scan.nextInt();
            scan.nextLine();

            if (opcion == 1) {
                System.out.println("HOTELES DISPONIBLES: ");
                System.out.println("");
                menuHotel.hotelesDisponibles();
            } else if (opcion == 2) {
                reservacion.reservarHabitacion();
            }else if( opcion == 3){
                reservacion.cancelarReserva();
            }else if( opcion == 4){
                reservacion.mostrarInformacion( );
            }else if (opcion == 5) {
                System.out.println("Gracias por usar nuestro servicio");
                break;
            }

            System.out.println("");
            System.out.println("Presione enter para volver al menú");
            scan.nextLine();

            
        } while (true);
        


    }
}