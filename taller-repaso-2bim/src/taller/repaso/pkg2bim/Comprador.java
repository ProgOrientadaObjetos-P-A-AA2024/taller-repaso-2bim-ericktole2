/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.repaso.pkg2bim;

/**
 *
 * @author utpl
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String nombres, String cedula) {
        this.nombres = nombres;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Comprador: " + nombres + " (Cédula: " + cedula + ")");
        return cadena;
    }
}
