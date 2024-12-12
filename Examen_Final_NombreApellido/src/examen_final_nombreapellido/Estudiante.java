/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final_nombreapellido;

import java.util.ArrayList;

public class Estudiante extends Persona {
    
    private String carrera;
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private int año;
    Object getaño;
    public Estudiante(String nombreCompleto, int año, String carrera) {
        super(nombreCompleto, año);
        if (carrera.isEmpty()) {
            throw new IllegalArgumentException("La carrera no puede estar vacía."); // misma formula para verificar si estan vacios los espacios
        }
        this.carrera = carrera;
    }

    public static ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public static void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        Estudiante.listaEstudiantes = listaEstudiantes;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Object getGetaño() {
        return getaño;
    }

    public void setGetaño(Object getaño) {
        this.getaño = getaño;
    }

    public static void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public static void eliminarEstudiante(Estudiante estudiante) {
        listaEstudiantes.remove(estudiante);
    }
    
    public void setAño(int año) {
        this.año = año; // para el año de curso supuestamente
    }
}