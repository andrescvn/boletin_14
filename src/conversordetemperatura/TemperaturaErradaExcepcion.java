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
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("Temperatura inferior a 80");

    }

    public TemperaturaErradaExcepcion(String s) {
        super(s);
    }
}
