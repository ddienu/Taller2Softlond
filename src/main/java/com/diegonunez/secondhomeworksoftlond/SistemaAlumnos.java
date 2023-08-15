/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.secondhomeworksoftlond;

import java.util.ArrayList;

/**
 *
 * @author ddienu
 */
public class SistemaAlumnos extends Alumno {
    
    ArrayList<Double> listaCalificaciones = new ArrayList<Double>();
    
    public SistemaAlumnos(String nombre, int edad, double calificaciones ){
        super(nombre, edad, calificaciones);
        listaCalificaciones.add( calificaciones );
    }
    
    public void agregarCalificaciones( double calificaciones ){
        listaCalificaciones.add( calificaciones );
    };
    
    public double promedioCalificaciones(){
        double sum = 0;
        double prom = 0;
        for ( int i = 0; i < listaCalificaciones.size(); i++){
            sum += listaCalificaciones.get(i);
        }
        
        prom = sum / listaCalificaciones.size();
        
        System.out.println("El promedio de calificaciones es: " + prom);
        
        return prom;
    }
    
    public void informacionAlumno(){
        System.out.println("El nombre del alumno es: " + getNombre());
        System.out.println("La edad del alumno es: " + getEdad() + " años");
        promedioCalificaciones();   
    }
}
