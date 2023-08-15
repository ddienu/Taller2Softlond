/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.diegonunez.secondhomeworksoftlond;

/**
 *
 * @author ddienu
 */
public class SecondHomeworkSoftlond {

    public static void main(String[] args) {
        
        SistemaAlumnos alumno1 = new SistemaAlumnos("Diego", 29, 2.7);
        
        SistemaAlumnos alumno2 = new SistemaAlumnos("Juan", 18, 4.1);
        
        SistemaAlumnos alumno3 = new SistemaAlumnos("Roberto", 16, 3.7);
        
        alumno1.agregarCalificaciones( 2.6 );
        alumno1.agregarCalificaciones( 3.7 );
        
        alumno2.agregarCalificaciones( 3.5 );
        alumno2.agregarCalificaciones( 3.8 );
        
        alumno2.agregarCalificaciones( 3.3 );
        alumno2.agregarCalificaciones( 3.9 );
        
        alumno1.promedioCalificaciones();
        alumno2.promedioCalificaciones();
        alumno3.promedioCalificaciones();
        
                
        alumno1.informacionAlumno();
        System.out.println(" ");
        
        alumno2.informacionAlumno();
        System.out.println("");
        
        alumno3.informacionAlumno();
        
    }
}
