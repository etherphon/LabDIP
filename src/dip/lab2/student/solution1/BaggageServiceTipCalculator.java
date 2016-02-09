/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author etherdesign
 */
public class BaggageServiceTipCalculator extends ServiceCalculator {
    
    private double baseTipPerBag = 1.0;
    private int bagCount;

    public BaggageServiceTipCalculator(int bagCount, ServiceQuality quality) {
        super(quality);
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }
    
    @Override
    public double getTip() {
            
            return baseTipPerBag * bagCount * (1 + this.getServiceRate());
             
        }

       
}