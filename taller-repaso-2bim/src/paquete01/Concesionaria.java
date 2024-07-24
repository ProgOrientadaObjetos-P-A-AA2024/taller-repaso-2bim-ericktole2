/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.List;

public class Concesionaria {

    private String nombre;
    private List<Vehiculo> listadoVehiculos;
    private double ventasTotales;
    private double costoMasCaro;
    private double costoMasBarato;

    public Concesionaria(String nombre, List<Vehiculo> listadoVehiculos) {
        this.nombre = nombre;
        this.listadoVehiculos = listadoVehiculos;
        calcularDatosConcesionaria();
    }

    private void inicializarValoresIniciales() {
        ventasTotales = 0;
        costoMasCaro = 0;
        costoMasBarato = obtenerPrimerPrecioFinal();
    }

    private double obtenerPrimerPrecioFinal() {
        if (listadoVehiculos.isEmpty()) {
            return 0;
        }

        Vehiculo primerVehiculo = listadoVehiculos.obtener(0);
        return primerVehiculo.obtenerPrecioFinal();
    }

    private void calcularDatosConcesionaria() {
        inicializarValoresIniciales();

        for (Vehiculo vehiculo : listadoVehiculos) {
            double precioFinalVehiculo = vehiculo.obtenerPrecioFinal();

            ventasTotales += precioFinalVehiculo;

            if (precioFinalVehiculo > costoMasCaro) {
                costoMasCaro = precioFinalVehiculo;
            }

            if (precioFinalVehiculo < costoMasBarato) {
                costoMasBarato = precioFinalVehiculo;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Concesionaria: %s\nVentas Totales: $%.2f\nCosto Vehículo Más Caro: $%.2f\nCosto Vehículo Más Barato: $%.2f\n",
                nombre, ventasTotales, costoMasCaro, costoMasBarato);
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerCostoMasCaro() {
        return costoMasCaro;
    }

    public double obtenerCostoMasBarato() {
        return costoMasBarato;
    }
}