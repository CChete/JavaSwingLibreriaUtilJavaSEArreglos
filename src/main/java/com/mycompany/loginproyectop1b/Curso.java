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
public class Curso {
   private int Id;
   private String Nombre;
   private String seccion;
   private String Fechainicio;
   private String FechaFin;
   private String HoraInicio;
   private String HoraFin;
   public String Profesor;
   public ArrayList<Alumno> alumnos = new ArrayList<>();
   public ArrayList<profesor> profesor = new ArrayList<>();
 

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    /**
     * @return the Fechainicio
     */
    public String getFechainicio() {
        return Fechainicio;
    }

    /**
     * @param Fechainicio the Fechainicio to set
     */
    public void setFechainicio(String Fechainicio) {
        this.Fechainicio = Fechainicio;
    }

    /**
     * @return the FechaFin
     */
    public String getFechaFin() {
        return FechaFin;
    }

    /**
     * @param FechaFin the FechaFin to set
     */
    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    /**
     * @return the HoraInicio
     */
    public String getHoraInicio() {
        return HoraInicio;
    }

    /**
     * @param HoraInicio the HoraInicio to set
     */
    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    /**
     * @return the HoraFin
     */
    public String getHoraFin() {
        return HoraFin;
    }

    /**
     * @param HoraFin the HoraFin to set
     */
    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /**
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

   

  
   
   

   
    
}
