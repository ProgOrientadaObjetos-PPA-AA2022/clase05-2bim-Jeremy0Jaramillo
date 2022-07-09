/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    private TransporteAereo ttavion;
    /*
    private TransporteTransvia transvia;
    private TransporteMaritimo maritimo;
    */
    
    public void establecerTransporteTaxi(TransporteTaxi taxi){
        ttaxi = taxi;
    }
    
    public void establecerTransporteBus(TransporteBus bus){
        ttbus = bus;
    }
    
    public void establecerTransporteAereo(TransporteAereo av){
        ttavion = av;
    }
    
    public TransporteTaxi obtenerTransporteTaxi(){
        return ttaxi;
    }
    
    public TransporteBus obtenerTransporteBus(){
        return ttbus;
    }
    
    public TransporteAereo obtenerTransporteAereo(){
        return ttavion;
    }
    
    public void establecerPromedioTarifas(){
        promedioTarifas = (obtenerTransporteBus().obtenerTarifa() + 
                obtenerTransporteTaxi().obtenerTarifa()) +
                obtenerTransporteAereo().obtenerTarifa()/2;
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    
}
