/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegonunez.secondhomeworksoftlond;

/**
 *
 * @author ddienu
 */
public class Alumno {
    private String nombre;
    private int edad;
    private double calificaciones;
    
    public Alumno(String nombre, int edad, double calificaciones){
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    
    
    
    
}
