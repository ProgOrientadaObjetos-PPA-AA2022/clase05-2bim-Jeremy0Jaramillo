/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteAereo avion = new TransporteAereo();
        avion.establecerCooperativaAerea("Tame");
        avion.establecerTarifa();
        
        ArrayList<Transporte> ls = new ArrayList<>();
        ls.add(avion);
        ls.add(bus);
        ls.add(taxi);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(ls);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
