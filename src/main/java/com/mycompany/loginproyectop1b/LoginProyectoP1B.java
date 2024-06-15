/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginproyectop1b;

import java.util.ArrayList;

/**
 *
 * @author crcg
 */
public class LoginProyectoP1B {
    //ingreso del arrayList que contiene los profesores
     public static ArrayList<profesor> profesor = new ArrayList<>();
     //profesor seleccionado que inicio sesion toma los datos de ArrayList profesor
    public static profesor profesorLogeado = new profesor();
    //ingreso del arrayList que contiene los alumnos
    public static ArrayList<Alumno> Alumno = new ArrayList<>();
     //alumno seleccionado que inicio sesion toma los datos de ArrayList Alumno
    public static Alumno alumnoLogeado = new Alumno();
    
    public static ArrayList<Curso> cursos = new ArrayList<>();
    

    public static void main(String[] args) {
        Login l= new Login();
        l.setVisible(true);
        
    }
}
