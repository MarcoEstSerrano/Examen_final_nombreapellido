/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final_nombreapellido;

/**
 *
 * @author marco
 */
public abstract class Persona {
    private String nombreCompleto;
    private int edad;

    public Persona(String nombreCompleto, int edad) {
        if (nombreCompleto.isEmpty() || edad <= 0) {
            throw new IllegalArgumentException("Datos inválidos para la persona.");
        }
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }
}
