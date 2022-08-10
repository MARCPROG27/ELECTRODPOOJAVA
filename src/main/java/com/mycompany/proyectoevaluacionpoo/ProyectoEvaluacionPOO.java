/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoevaluacionpoo;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ProyectoEvaluacionPOO {

    static Scanner entrada = new Scanner(System.in);
    static Electrodomestico listadoArtefactos[] = new Electrodomestico[10];

    public static void main(String[] args) {
        ProyectoEvaluacionPOO.MenuPrincipal();
    }

    public static void Artefactos() {
        //SE CREAN UN ARRAY CON 10 POSICIONES Y GUARDAREMOS LOS ELECTRODOMESTICOS CON PARAMETROS//

        listadoArtefactos[0] = new Electrodomestico();
        listadoArtefactos[1] = new Lavadora();
        listadoArtefactos[2] = new Televisor();
        listadoArtefactos[3] = new Electrodomestico(190, 80);
        listadoArtefactos[4] = new Lavadora(190, 80);
        listadoArtefactos[5] = new Televisor(190, 80);
        listadoArtefactos[6] = new Electrodomestico(180, 20, "ROJO", 'B');
        listadoArtefactos[7] = new Lavadora(180, 20, "GRIS", 'A', 10);
        listadoArtefactos[8] = new Televisor(180, 20, "NEGRO", 'C', 33, true);
        listadoArtefactos[9] = new Lavadora(90, 90, "MORADO", 'G', 8);

    }

    public static void recorrerCalculartotales(Electrodomestico[] lista) {

        int sumaElectrodomesticos = 0;
        int sumaTelevisiones = 0;
        int sumaLavadoras = 0;
        // EN ESTE PUNTO RECORRERA TODOS LOS ATRIBUTOS COMUNES DE LOS ARTEFACTOS Y SUS RESPECTIVOS CALCULOS Y UNA VEZ QUE ENCUENTRE ATRIBUTOS DISTINTOS//
//            //CONTINUARA EN LAS OTRAS CLASES TRAYENDO ATRIBUTOS Y HACIENDO CALCULOS USANDO INSTANCIAS//
//            //AL FINAL TRAERA SUMATORIA PRECIO FINAL POR CADA ARTEFACTO//

        for (Electrodomestico e : lista) {

            if (e instanceof Televisor) {
                sumaTelevisiones += e.precioFinal();
            } else if (e instanceof Lavadora) {
                sumaLavadoras += e.precioFinal();
            } else if (e instanceof Electrodomestico) {
                sumaElectrodomesticos += e.precioFinal();
            }
        }

        //AQUI SE MUESTRAN LOS RESULTADOS  METODO MOSTRARSUMA//
        System.out.println("1-LA SUMA DEL PRECIO DE LAS LAVADORAS ES DE  " + sumaLavadoras + " EUROS");
        System.out.println("2-LA SUMA DEL PRECIO DE LOS TELEVISORES ES DE " + sumaTelevisiones + " EUROS");
        System.out.println("3-LA SUMA DEL PRECIO DE LOS DEMAS LECTRODOMESTICOS ES DE " + sumaElectrodomesticos + " EUROS");

    }

    public static void MenuPrincipal() {
        int opcion;

        System.out.println("****TIENDA DE ELECTRODOMESTICOS*****");
        System.out.println("    1-VER ARTEFACTOS....");
        System.out.println("    2-SALIR...............");
        System.out.println("\n");
        System.out.println("\n");

        try {

            System.out.print("------------------------INGRESE NUMERO DE MENU:");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ProyectoEvaluacionPOO.MenuEleccionArtefactos();
                    break;
                case 2:
                    System.out.println("USTED HA SALIDO DDE MENU...GRACIAS");
                    break;
                default:
                    System.out.println("DEBE INSERTAR UN NUMERO VALIDO ENTRE 1 Y 4");
                    break;
            }

        } catch (Exception e) {
            System.out.println("DEBE INSERTAR UN NUMERO VALIDO ENTRE 1 Y 2 Y NO UN CARACTER");

        }

    }

    public static void MenuEleccionArtefactos() {
        int opcion;

        System.out.println("****TIENDA DE ELECTRODOMESTICOS*****");
        System.out.println("    1- LAVADORA....");
        System.out.println("    2- TELEVISOR....");
        System.out.println("    3- OTROS ARTEFACTOS....");
        System.out.println("   4- SUMA DE ARTEFACTOS....");
        System.out.println("    5- SALIR...............");
        System.out.println("\n");
        System.out.println("\n");

        try {

            System.out.print("------------------------INGRESE NUMERO DE MENU:");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ProyectoEvaluacionPOO.Lavadoras();
                    break;
                case 2:
                    ProyectoEvaluacionPOO.Televisiones();
                    break;
                case 3:
                    ProyectoEvaluacionPOO.ElectrodomesticosEnGral();
                    break;
                case 4:
                    ProyectoEvaluacionPOO.MostrarSuma();
                    break;

                case 5:
                    System.out.println("USTED HA SALIDO DEL MENU...GRACIAS");
                    break;

                default:
                    System.out.println("DEBE INSERTAR UN NUMERO VALIDO ENTRE 1 Y 5");
                    break;
            }

        } catch (Exception e) {
            System.out.println("DEBE INSERTAR UN NUMERO VALIDO ENTRE 1 Y 5 Y NO UN CARACTER");

        }
    }

    public static void Lavadoras() {

        String opcion2;

        System.out.println("****TIENDA DE ELECTRODOMESTICOS*****");
        System.out.println("    1-  ITEM LAVADORAS....");
        ProyectoEvaluacionPOO.Artefactos();
        System.out.println(String.format("%-18s %-7s %-13s %-8s %-8s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO",
                "CARGA", "PRECIO FINAL"));
        System.out.println(listadoArtefactos[1].toString() + " EUROS");
        System.out.println(listadoArtefactos[4].toString() + " EUROS");
        System.out.println(listadoArtefactos[7].toString() + " EUROS");
        System.out.println(listadoArtefactos[9].toString() + " EUROS");
        System.out.println("\n");
        System.out.println("\n");

        try {

            System.out.print("------------------VOLVER AL MENU DE ELECCION SI(S)NO(N):");
            opcion2 = entrada.next();
            switch (opcion2) {
                case "S":
                    ProyectoEvaluacionPOO.MenuEleccionArtefactos();
                    break;
                case "N":
                    System.out.println("USTED HA SALIDO DEL MENU...GRACIAS");
                    break;
                default:
                    System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");
                    break;
            }

        } catch (Exception e) {
            System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");

        }
    }

    public static void Televisiones() {
        String opcion2;

        System.out.println("****TIENDA DE ELECTRODOMESTICOS*****");

        System.out.println("    1-  ITEM TELEVISORES....");
        ProyectoEvaluacionPOO.Artefactos();
        System.out.println("");
        System.out.println(String.format("%-18s %-7s %-13s %-6s %-11s %-6s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO",
                "RESOLUCION", "TDT", "PRECIO FINAL"));
        System.out.println(listadoArtefactos[2].toString() + " EUROS");
        System.out.println(listadoArtefactos[5].toString() + " EUROS");
        System.out.println(listadoArtefactos[8].toString() + " EUROS");
        System.out.println("\n");
        System.out.println("\n");

        try {

            System.out.print("------------------VOLVER AL MENU DE ELECCION SI(S)NO(N):");
            opcion2 = entrada.next();
            switch (opcion2) {
                case "S":
                    ProyectoEvaluacionPOO.MenuEleccionArtefactos();
                    break;
                case "N":
                    System.out.println("USTED HA SALIDO DEL MENU...GRACIAS");
                    break;
                default:
                    System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");
                    break;
            }

        } catch (Exception e) {
            System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");

        }
    }

    public static void ElectrodomesticosEnGral() {
        String opcion2;

        System.out.println("****TIENDA DE ELECTRODOMESTICOS*****");
        System.out.println("    1-  ITEM ELECTRODOMESTICOS EN GRAL....");
        ProyectoEvaluacionPOO.Artefactos();
        System.out.println(
                String.format("%-18s %-7s %-13s %-6s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO", "PRECIO FINAL"));
        System.out.println(listadoArtefactos[0].toString() + " EUROS");
        System.out.println(listadoArtefactos[3].toString() + " EUROS");
        System.out.println(listadoArtefactos[6].toString() + " EUROS");
        System.out.println("\n");
        System.out.println("\n");

        try {

            System.out.print("------------------VOLVER AL MENU DE ELECCION SI(S)NO(N):");
            opcion2 = entrada.next();
            switch (opcion2) {
                case "S":
                    ProyectoEvaluacionPOO.MenuEleccionArtefactos();
                    break;
                case "N":
                    System.out.println("USTED HA SALIDO DEL MENU...GRACIAS");
                    break;
                default:
                    System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");
                    break;
            }

        } catch (Exception e) {
            System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");

        }
    }

    public static void MostrarSuma() {
        String opcion2;

        System.out.println("****TIENDA DE ELECTRODOMESTICOS*****");
        System.out.println("    1-  ITEM SUMA DE ARTEFACTOS....");
        ProyectoEvaluacionPOO.Artefactos();
        ProyectoEvaluacionPOO.recorrerCalculartotales(listadoArtefactos);
        // ProyectoEvaluacionPOO.RecorrerListadoSumaArtefactos();
        System.out.println("\n");
        System.out.println("\n");

        try {

            System.out.print("------------------VOLVER AL MENU DE ELECCION SI(S)NO(N):");
            opcion2 = entrada.next();
            switch (opcion2) {
                case "S":
                    ProyectoEvaluacionPOO.MenuEleccionArtefactos();
                    break;
                case "N":
                    System.out.println("USTED HA SALIDO DDE MENU...GRACIAS");
                    break;
                default:
                    System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");
                    break;
            }

        } catch (Exception e) {
            System.out.println("DEBE INSERTAR S (PARA VOLVER AL MENU PRINCIPAL) O N(PARA SALIR)");

        }
    }

}
