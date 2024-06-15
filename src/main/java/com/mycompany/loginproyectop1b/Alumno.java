/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginproyectop1b;

import java.util.ArrayList;

/**
 *
 * @author crcg
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String Carne;
    private String password;
    public String nota;
    public String genero;
    public ArrayList<Curso> cursos = new ArrayList<>();
    public ArrayList<Notas> notas = new ArrayList<>(); 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the Carne
     */
    public String getCarne() {
        return Carne;
    }

    /**
     * @param Carne the Carne to set
     */
    public void setCarne(String Carne) {
        this.Carne = Carne;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
