/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoevaluacionpoo;

/**
 *
 * @author marco
 */
public class Televisor extends Electrodomestico {

    // ========== CONSTANTES ==========
    protected final int RESOLUCION_POR_DEFECTO = 20; // pulgadas
    protected final boolean SINTONIZADOR_POR_DEFECTO = false;//SIGNIFICA QUE EL TV NO TIENE INTEGRADO EL DECODIF.
    private int resolucionTV; // pulgadas
    private boolean sintonizadorTDTHD; // Si incluye TDT: Televisión Digital Terrestre HD

    public Televisor() {
        super();
        this.resolucionTV = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDTHD = SINTONIZADOR_POR_DEFECTO;
    }

    public Televisor(int precio, int peso) {
        super(precio, peso);
        this.resolucionTV = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDTHD = SINTONIZADOR_POR_DEFECTO;
    }

    public Televisor(int precio, int peso, String color, char consumoElectrico, int resolucionTV,
            boolean sintonizadorTDTHD) {
        super(precio, peso, color, consumoElectrico);
        this.resolucionTV = resolucionTV;
        this.sintonizadorTDTHD = sintonizadorTDTHD;
    }

    public int getResolucion() {
        return resolucionTV;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDTHD;
    }

    @Override
    public String toString() {
        //FORMATO DE IMPRESION;ALINEANDO A COLUMNAS
        return String.format("%-18s %-7s %12s %5dkg %9d'' %6b %d", "Televisor", getColor(), getConsumoElectrico(),
                getPeso(), getResolucion(), isSintonizadorTDT(), precioFinal());

    }

    @Override
    public int precioFinal() {

        if (sintonizadorTDTHD) {
            if (resolucionTV > 40) {
                return Math.round((super.precioFinal() * 1.30f)) + 50;
            } else {
                return super.precioFinal() + 50;
            }
        } else {
            if (resolucionTV > 40) {
                return Math.round((super.precioFinal() * 1.30f));
            } else {
                return super.precioFinal();
            }

        }
    }

}
