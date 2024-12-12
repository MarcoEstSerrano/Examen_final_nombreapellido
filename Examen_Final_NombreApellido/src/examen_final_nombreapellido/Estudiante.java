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
    public Estudiante(String nombreCompleto, int edad, String carrera) {
        super(nombreCompleto, edad);
        if (carrera.isEmpty()) {
            throw new IllegalArgumentException("La carrera no puede estar vacía.");
        }
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public static void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public static void listarEstudiantes() {
        listaEstudiantes.forEach(estudiante -> System.out.println(estudiante.getNombreCompleto()));
    }

    public static void eliminarEstudiante(Estudiante estudiante) {
        listaEstudiantes.remove(estudiante);
    }
    
    public void setAño(int año) {
        this.año = año; // Establece el año de curso
    }

    Object getAño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}