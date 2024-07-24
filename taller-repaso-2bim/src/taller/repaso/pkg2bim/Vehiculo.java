/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.repaso.pkg2bim;

/**
 *
 * @author utpl
 */
public abstract class Vehiculo {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador propietario, String marca, double precioBase) {
        this.propietario = propietario;
        this.marca = marca;
        this.precioBase = precioBase;
        this.precioFinal = 0;
    }

    public abstract void calcularPrecioFinal();

    @Override
    public String toString() {
        String cadena = String.format("%s - %s - Precio Final: $%.2f\nPropietario: %s\nPrecio Base: $%.2f",
                getClass().getSimpleName(), marca, precioFinal, propietario, precioBase);
        return cadena ;
    }
}
