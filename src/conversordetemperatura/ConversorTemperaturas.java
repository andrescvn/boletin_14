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

    final float t = 80;

    public double centigradosAFharenheit(float t) throws Exception {
        if (t < 80) {
            throw new Exception();
        } else {
            return (9.0 / 5.0 * t + 32.4);
        }
    }

    public void centígradosAReamur(float t) {
        System.out.println("Reamur =" + 4.0 / 5.0 * t);
    }
}
