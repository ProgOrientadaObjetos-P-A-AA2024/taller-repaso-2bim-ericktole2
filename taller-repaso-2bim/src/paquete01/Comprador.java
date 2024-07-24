/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author utpl
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String nom, String ced) {
        nombres = nom;
        cedula = ced;
    }

    public void establecerNombres(String nom) {
        nombres = nom;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Comprador: " + nombres + " (Cédula: " + cedula + ")");
        return cadena;
    }
}
