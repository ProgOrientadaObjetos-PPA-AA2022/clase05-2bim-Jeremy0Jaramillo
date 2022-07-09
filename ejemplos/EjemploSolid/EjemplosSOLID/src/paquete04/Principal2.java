/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int tipo;
        String nombre;
        ArrayList<Transporte> ls = new ArrayList<>();
        String cadena = "";
        boolean bandera = true;

        System.out.println("Ingrese (1)-Bus, (2)-Taxi,"
                + " (3)-Aereo, (4)-Maritimo");
        tipo = entry.nextInt();
        entry.nextLine();

        while (bandera) {
            switch (tipo) {
                case 1:

                    TransporteBus bus = new TransporteBus();
                    System.out.println("Ingrese el nombre de la"
                            + " cooperativa de Buses:");
                    nombre = entry.nextLine();
                    bus.establecerCooperativaBus(nombre);
                    bus.establecerTarifa();
                    ls.add(bus);
                    cadena = String.format("%sTarifa Bus: $%.2f\n",
                            cadena,
                            bus.obtenerTarifa());

                    break;
                case 2:

                    TransporteTaxi taxi = new TransporteTaxi();
                    System.out.println("Ingrese el nombre de la"
                            + " cooperativa de Taxis:");
                    nombre = entry.nextLine();
                    taxi.establecerCooperativaTaxi(nombre);
                    taxi.establecerTarifa();
                    ls.add(taxi);
                    cadena = String.format("%sTarifa Taxi: $%.2f\n",
                            cadena,
                            taxi.obtenerTarifa());

                    break;
                case 3:

                    TransporteAereo avion = new TransporteAereo();
                    System.out.println("Ingrese el nombre de la"
                            + " cooperativa Aerea:");
                    nombre = entry.nextLine();
                    avion.establecerCooperativaAerea(nombre);
                    avion.establecerTarifa();
                    ls.add(avion);
                    cadena = String.format("%sTarifa Aerea: $%.2f\n",
                            cadena,
                            avion.obtenerTarifa());

                    break;
                case 4:

                    TransporteMaritimo barco = new TransporteMaritimo();
                    System.out.println("Ingrese el nombre de la"
                            + " cooperativa Marítima:");
                    nombre = entry.nextLine();
                    barco.establecerCooperativaAerea(nombre);
                    barco.establecerTarifa();
                    ls.add(barco);
                    cadena = String.format("%sTarifa Marítima: $%.2f\n",
                            cadena,
                            barco.obtenerTarifa());

                    break;

                default:

                    System.out.println("Porfavor ingrese una de las opciones"
                            + " disponibles.");
                    System.out.println("Ingrese (1)-Bus, (2)-Taxi,"
                            + " (3)-Aereo, (4)-Maritimo");
                    tipo = entry.nextInt();
                    entry.nextLine();

                    break;
            }

            System.out.println("Si desea seguir dejar de ingresando"
                    + " transportes ingrese 'S' :");
            if (entry.nextLine().equals("S")) {
                bandera = false;
            } else {
                System.out.println("Ingrese (1)-Bus, (2)-Taxi,"
                        + " (3)-Aereo, (4)-Maritimo");
                tipo = entry.nextInt();
                entry.nextLine();
            }
        }

        System.out.println("\nReporte de Tarifas de Transportes:");

        System.out.println(cadena);

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(ls);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de tarifas: %.2f\n",
                tipos.obtenerPromedioTarifas());

    }
}
