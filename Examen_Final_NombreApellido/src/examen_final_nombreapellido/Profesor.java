/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final_nombreapellido;

//esta clase me parece que va a ser de poca utilidad pero vamos a crearla por instruccion de la prueba,

import java.util.ArrayList;

public class Profesor extends Persona {
    private String curso;
    private int anio; // ya me acostumbre a poner anio porque año nunca se ve en consola aunque no sea este el caso.
    private static ArrayList<Profesor> listaProfesores = new ArrayList<>(); // aqui creamos el arraylist

    //ahora va el constructor:
    
    public Profesor(String nombreCompleto, int edad, String curso, int anio) {
        super(nombreCompleto, edad); // se pone super ya que asi puedo llamar al constructor de la otra clase.
        if (curso.isEmpty() || anio <= 0) { // la condicional que verifica si está en blanco.
            throw new IllegalArgumentException("Datos inválidos para el profesor.");
        }
        this.curso = curso;
        this.anio = anio;
    }

    public String getCurso() {
        return curso;
    }

    public int getAnio() {
        return anio;
    }

    public static void agregarProfesor(Profesor profesor) {
        listaProfesores.add(profesor);
    }

    public static void listarProfesores() {
            listaProfesores.forEach(profesor -> System.out.println(profesor.getNombreCompleto()));
        }

        public static void eliminarProfesor(Profesor profesor) {
            listaProfesores.remove(profesor);
        }
    }
