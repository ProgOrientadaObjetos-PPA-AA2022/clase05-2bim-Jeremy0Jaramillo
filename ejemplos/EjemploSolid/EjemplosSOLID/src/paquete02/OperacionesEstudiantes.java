/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author yo
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioCualitativoEdades;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }
    
    public void establecerPromedioEdadesCualitativo(){
        
        if (promedioEdades <= 0 && promedioEdades > 21) {
            promedioCualitativoEdades = String.format("Promedio Cualitativo"
                    + " de edades: Jovenes");
        } else {
            promedioCualitativoEdades = String.format("Promedio Cualitativo"
                    + " de edades: Adultos");
        }
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    
    public String obtenerPromedioEdadesCualitativo(){
        return promedioCualitativoEdades;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiantes:\n");

        for (Persona e : obtenerEstudiante()) {
            cadena = String.format("%sNombre: %s\n",
                    cadena,
                    e.obtenerNombre());
        }

        establecerPromedioEdades();
        cadena = String.format("%sPromedio de edades: %.2f\n",
                cadena,
                obtenerPromedioEdades());
        
        establecerPromedioEdadesCualitativo();
        
        cadena = String.format("%s%s",
                cadena,
                obtenerPromedioEdadesCualitativo());

        return cadena;
    }

}
