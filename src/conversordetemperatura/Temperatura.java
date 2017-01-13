/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordetemperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas conver = new ConversorTemperaturas();
        
        float t = Float.parseFloat(JOptionPane.showInputDialog("temperatura"));

        try {
            System.out.println("Fharenheit = " + conver.centigradosAFharenheit(t));
            conver.centígradosAReamur(t);
        } catch (Exception e) {
            System.out.println("Temperatura menor que 80");
        }

    }

}
