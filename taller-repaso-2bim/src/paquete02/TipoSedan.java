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
public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan(Comprador prop, String marc, double precioB, double porcentajeD) {
        super(prop, marc, precioB);
        porcentajeDescuento = porcentajeD;
        valorDescuento = 0;
        seguroAdicionalMecanico = precioB * 0.01;
    }

    public void establecerPorcentajeDescuento(double porcentajeD) {
        porcentajeDescuento = porcentajeD;
    }

    public void establecerValorDescuento(double valorD) {
        valorDescuento = valorD;
    }

    public void establecerSeguroAdicionalMecanico(double seguroA) {
        seguroAdicionalMecanico = seguroA;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroAdicionalMecanico() {
        return seguroAdicionalMecanico;
    }

    @Override
    public void calcularPrecioFinal() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
        precioFinal = precioBase - valorDescuento + seguroAdicionalMecanico;
    }

    @Override
    public String toString() {
        String cadena = super.toString() + String.format("\nPorcentaje Descuento: %.2f%%\nValor Descuento: $%.2f\n"
                + "Seguro Adicional Mecánico: $%.2f\n", porcentajeDescuento, valorDescuento, seguroAdicionalMecanico);
        return cadena;
    }
}
