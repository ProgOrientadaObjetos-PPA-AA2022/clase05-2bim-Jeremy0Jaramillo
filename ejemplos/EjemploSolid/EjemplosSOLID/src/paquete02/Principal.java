/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Persona e1 = new Persona("Pedro", 32);
        Persona e2 = new Persona("Juan", 21);
        Persona e3 = new Persona("Hola", 26);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        
        ArrayList<Persona> ola = new ArrayList<>();
        
        ola.add(e1);
        ola.add(e2);
        ola.add(e3);
        
        op.establecerEstudiante(ola);
        op.establecerPromedioEdades();
        
        System.out.println(op);
        
        
    }
}
