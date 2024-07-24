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
public class TipoCamioneta extends Vehiculo {

    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroAdicionalMantenimiento;

    public TipoCamioneta(Comprador prop, String mar, double precioB, double porcentajeAdicionalI) {
        super(prop, mar, precioB);
        porcentajeAdicionalImportacion = porcentajeAdicionalI;
        valorAdicionalImportacion = 0;
        seguroAdicionalMantenimiento = 0;
    }

    @Override
    public void calcularPrecioFinal() {
        valorAdicionalImportacion = precioBase * (porcentajeAdicionalImportacion / 100);
        seguroAdicionalMantenimiento = valorAdicionalImportacion * 1.5;
        precioFinal = precioBase + valorAdicionalImportacion
                + seguroAdicionalMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nPorcentaje Adicional "
                + "Importación: %.2f%%\nValor Adicional Importación: $%.2f\n"
                + "Seguro Adicional Mantenimiento: $%.2f\n",
                 porcentajeAdicionalImportacion,
                 valorAdicionalImportacion,
                 seguroAdicionalMantenimiento);
    }
}
