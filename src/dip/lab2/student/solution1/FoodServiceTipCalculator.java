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
public class FoodServiceTipCalculator implements TipCalculator {
    
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private ServiceQuality serviceQuality;
    private double minBill = 0.00;
    private String billEntryErr =
            "Error: bill must be greater than or equal to " + minBill;
    private double bill;

    public FoodServiceTipCalculator(double bill, ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
        this.bill = bill;
    }
    
    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
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
    public double getTip() {
        return bill * this.getServiceRate();
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
