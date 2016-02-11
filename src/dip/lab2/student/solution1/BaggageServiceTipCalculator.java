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
public class BaggageServiceTipCalculator implements TipCalculator {
    
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private ServiceQuality serviceQuality;
    private double baseTipPerBag = 1.0;
    private int bagCount;

    public BaggageServiceTipCalculator(int bagCount, ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
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
    
    private double getServiceRate() {
        double tipRate;
        
        switch(serviceQuality) {
            case GOOD:
                tipRate = goodRate;
                break;
            case FAIR:
                tipRate = fairRate;
                break;
            case POOR:
                tipRate = poorRate;
                break;
            default:
                tipRate = 0.15;
        }
        return tipRate;
    }
    
    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    @Override
    public double getTip() {
            
            return baseTipPerBag * bagCount * (1 + this.getServiceRate());
             
        }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

       
}