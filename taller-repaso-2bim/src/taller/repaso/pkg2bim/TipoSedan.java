/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.repaso.pkg2bim;

/**
 *
 * @author utpl
 */
public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan(Comprador propietario, String marca, double precioBase, double porcentajeDescuento) {
        super(propietario, marca, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
        this.valorDescuento = 0;
        this.seguroAdicionalMecanico = precioBase * 0.01; // 1% del precio base
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
