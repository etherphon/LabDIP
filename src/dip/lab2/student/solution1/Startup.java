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
            TipCalculator hotel = new BaggageServiceTipCalculator(3, ServiceQuality.GOOD);
            TipCalculator airport = new BaggageServiceTipCalculator(3, ServiceQuality.FAIR);
            TipCalculator chilis = new FoodServiceTipCalculator(50.16, ServiceQuality.FAIR);
            TipCalculator ruthschris = new FoodServiceTipCalculator(184.10, ServiceQuality.GOOD);
            
            TipCalculator[] services = {hotel, airport, chilis, ruthschris };
            TipManager tMan = new TipManager();
            
            for(TipCalculator s : services) {
                
            System.out.println("Tip is " + nf.format(tMan.getTip(s)));
            
            }
            
    }
    
    
}
