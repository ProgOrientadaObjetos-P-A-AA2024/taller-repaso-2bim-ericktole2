/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete01.Comprador;

/**
 *
 * @author utpl
 */
public abstract class Vehiculo {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador prop, String mar, double precioB) {
        propietario = prop;
        marca = mar;
        precioBase = precioB;
        precioFinal = 0;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Comprador propietario) {
        this.propietario = propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public void establecerPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public void establecerPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public abstract void calcularPrecioFinal();

    @Override
    public String toString() {
        String cadena = String.format("Marca: %s - Precio Base: $%.2f - "
                + "Precio Final: $%.2f", marca, precioBase, precioFinal);
        return cadena;
    }
}
