/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author etherdesign
 */
public class Startup {
    
    public static void main(String[] args) {
            
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            ServiceCalculator hotel = new BaggageServiceTipCalculator(3, ServiceQuality.GOOD);
            ServiceCalculator airport = new BaggageServiceTipCalculator(3, ServiceQuality.FAIR);
            ServiceCalculator chilis = new FoodServiceTipCalculator(50.16, ServiceQuality.FAIR);
            ServiceCalculator ruthschris = new FoodServiceTipCalculator(184.10, ServiceQuality.GOOD);
            
            ServiceCalculator[] services = {hotel, airport, chilis, ruthschris };
            
            for(ServiceCalculator s : services) {
                
            System.out.println("Tip is " + nf.format(s.getTip()));
            
            }
            
    }
    
    
}
