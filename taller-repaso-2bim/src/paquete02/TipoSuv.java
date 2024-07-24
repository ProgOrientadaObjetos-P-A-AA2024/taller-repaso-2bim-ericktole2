/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Comprador;
import paquete01.Vehiculo;

/**
 *
 * @author utpl
 */
public class TipoSuv extends Vehiculo {

    private double porcentajeSeguroPersonas;
    private double seguroPersonas;

    public TipoSuv(Comprador propietario, String marca, double precioBase, double porcentajeSeguroP) {
        super(propietario, marca, precioBase);
        porcentajeSeguroPersonas = porcentajeSeguroP;
        seguroPersonas = 0;
    }

    @Override
    public void calcularPrecioFinal() {
        seguroPersonas = precioBase * (porcentajeSeguroPersonas / 100);
        precioFinal = precioBase + seguroPersonas;
    }

    @Override
    public String toString() {
        String cadena = super.toString() + String.format("\nPorcentaje Seguro Personas: %.2f%%\nSeguro Personas: $%.2f\n",
                porcentajeSeguroPersonas, seguroPersonas);
        return cadena;
    }
}
