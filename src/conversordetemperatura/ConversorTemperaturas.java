/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordetemperatura;

/**
 *
 * @author acomesanavila
 */
public class ConversorTemperaturas {

    private final float t = 80;

    public double centigradosAFharenheit(float temp) throws TemperaturaErradaExcepcion {
        if (temp < t) {
            throw new TemperaturaErradaExcepcion();
        }
        
            return (9.0 / 5.0 * t + 32.4);
        
    }

    public void centígradosAReamur(float temp) throws TemperaturaErradaExcepcion {
         if (temp < t) {
            throw new TemperaturaErradaExcepcion();
         }
        System.out.println("Areamur =" + 4.0 / 5.0 * temp);
    }
}
