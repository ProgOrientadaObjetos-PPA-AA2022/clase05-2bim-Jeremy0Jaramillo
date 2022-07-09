/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteAereo {

    private String cooperativaAerea;
    public double tarifa;

    public void establecerCooperativaAerea(String n) {
        cooperativaAerea = n;
    }

    public void establecerTarifa() {
        tarifa = 100.00 + 0.20;
    }

    public String obtenerCooperativaAerea() {
        return cooperativaAerea;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
