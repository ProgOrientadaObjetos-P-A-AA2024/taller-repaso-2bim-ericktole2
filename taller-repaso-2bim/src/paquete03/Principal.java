/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.*;
import java.util.ArrayList;
import java.util.List;
import paquete01.*;

/**
 *
 * @author utpl
 */
public class Principal {

    public static void main(String[] args) {
        // Crear compradores
        Comprador comprador1 = new Comprador("Juan Perez", "1234567890");
        Comprador comprador2 = new Comprador("Ana Gómez", "0987654321");

        // Crear vehículos
        TipoSedan sedan1 = new TipoSedan(comprador1, "Toyota", 25000, 5);
        sedan1.calcularPrecioFinal();

        TipoSedan sedan2 = new TipoSedan(comprador2, "Honda", 30000, 7);
        sedan2.calcularPrecioFinal();

        TipoSuv suv1 = new TipoSuv(comprador1, "Ford", 35000, 10);
        suv1.calcularPrecioFinal();

        TipoCamioneta camioneta1 = new TipoCamioneta(comprador2, "Chevrolet", 40000, 12);
        camioneta1.calcularPrecioFinal();

        List<Vehiculo> listadoVehiculos = new ArrayList<>();
        listadoVehiculos.add(sedan1);
        listadoVehiculos.add(sedan2);
        listadoVehiculos.add(suv1);
        listadoVehiculos.add(camioneta1);

        Concesionaria concesionaria = new Concesionaria("Concesionaria XYZ", listadoVehiculos);

        System.out.println(concesionaria);

        for (Vehiculo vehiculo : listadoVehiculos) {
            System.out.println(vehiculo);
        }
    }
}
