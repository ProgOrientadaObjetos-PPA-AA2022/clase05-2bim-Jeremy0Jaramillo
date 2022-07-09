/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;


/**
 *
 * @author SALA I
 */
public class TransporteAereo extends Transporte{

    private String cooperativaAerea;

    public void establecerCooperativaAerea(String n) {
        cooperativaAerea = n;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 100.00 + 0.20;
    }

    public String obtenerCooperativaAerea() {
        return cooperativaAerea;
    }


}
