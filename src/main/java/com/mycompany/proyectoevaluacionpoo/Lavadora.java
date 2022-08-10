/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoevaluacionpoo;

/**
 *
 * @author marco
 */
public class Lavadora extends Electrodomestico {

    protected final int CARGA_POR_DEFECTO = 5; // kg

    private int carga; // kg

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
//FORMATO DE IMPRESION;ALINEANDO A COLUMNAS
        return String.format("%-18s %-7s %12s %5dkg %6dkg %d", "Lavadora", getColor(), getConsumoElectrico(), getPeso(),
                getCarga(), precioFinal());
    }

    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
        this.carga = CARGA_POR_DEFECTO;
    }

    public Lavadora(int precio, int peso, String color, char consumoElectrico, int carga) {
        super(precio, peso, color, consumoElectrico);
        this.carga = carga;
    }

    @Override
    public int precioFinal() {

        if (carga > 30) {
            return super.precioFinal() + 50;
        } else {
            return super.precioFinal();

        }
    }

}
