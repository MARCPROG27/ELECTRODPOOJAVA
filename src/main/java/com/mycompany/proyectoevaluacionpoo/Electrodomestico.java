/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoevaluacionpoo;

/**
 *
 * @author marco
 */
public class Electrodomestico {

    protected final String[] COLOR = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
    protected final int PESO_POR_DEFECTO = 5; // Kg
    protected final int PRECIO_POR_DEFECTO = 100;
    protected final char[] CLASIFICACION_CONSUMO = {'A', 'B', 'C', 'D', 'E', 'F'};

    private int precio; // EL FORMATO MONEDA  QUE USARÁ SERA EL DE LA TABLA :EURO
    private String color;
    private char consumoElectrico;
    private int peso; // Kg

    public Electrodomestico() {
        this.color = COLOR[0];
        this.consumoElectrico = CLASIFICACION_CONSUMO[5];
        this.precio = PRECIO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(int precio, int peso) {
        this();
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(int precio, int peso, String color, char consumoElectrico) {
        this(precio, peso);
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
    }

    public String[] getCOLOR() {
        return COLOR;
    }

    public int getPRECIO_POR_DEFECTO() {
        return PRECIO_POR_DEFECTO;
    }

    public int getPESO_POR_DEFECTO() {
        return PESO_POR_DEFECTO;
    }

    public char[] getCLASIFICACION_CONSUMO() {
        return CLASIFICACION_CONSUMO;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        //FORMATO DE IMPRESION;ALINEANDO A COLUMNAS
        return String.format("%-18s %-7s %12s %5d %d", "Electrodomestico", getColor(), getConsumoElectrico(),
                getPeso(), precioFinal());
    }

    // =========== METODOS ===========
    private char comprobarConsumoEnergetico(char letra) {
        String s = new String();
        s = letra + "";
        letra = s.toUpperCase().charAt(0);
        for (char c : CLASIFICACION_CONSUMO) {
            if (letra == c) {
                return letra;
            }
        }
        return CLASIFICACION_CONSUMO[5];//AQUI DEVUELVE CARACTER constante F de consumo energetico
    }

    private String comprobarColor(String color) {
        for (String s : COLOR) {
            if (s.equals(color.toUpperCase())) {   //AQUÍ DEVUELVE COLOR UNA VEZ QUE ESTÉ COMPROBADO
                return color;
            }
        }
        return COLOR[0];  //AQUI RETORNA COLOR POR DEFECTO EN LA POSICION 0 : COLOR BLANCO
    }

    public int precioFinal() {
        int precioConsumo = 0;
        int precioTamano = 0;

        switch (consumoElectrico) {   //CONFORME A LA CATEGORIA  DE EFICIENCIA ENERGETICA DEL ARTEFACTO
            // DEVUELVE EL PRECIO DE CONSUMO EL CUAL SE SUMA CON EL PRECIO DEL PESAJE
            case 'A':                  // DEL ARTEFACTO(CONFORME A CONDICIONES DEL PESAJE) Y EL PRECIO BASE;UNA VEZ QUE
                precioConsumo = 100;     //SALGA DEL SWITCH//

                break;
            case 'B':
                precioConsumo = 80;

                break;
            case 'C':
                precioConsumo = 60;

                break;
            case 'D':
                precioConsumo = 50;

                break;
            case 'E':
                precioConsumo = 30;

                break;
            case 'F':
                precioConsumo = 10;

                break;

        }

        if (peso >= 0 && peso <= 19) {
            precioTamano = 10;
        } else if (peso >= 20 && peso < 50) {
            precioTamano = 50;
        } else if (peso >= 50 && peso < 80) {
            precioTamano = 80;
        } else if (peso >= 80) {
            precioTamano = 100;
        }

        return precio + precioConsumo + precioTamano;
    }
}
