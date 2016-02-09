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
public abstract class ServiceCalculator {
    
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    private ServiceQuality serviceQuality;
    
    public ServiceCalculator(ServiceQuality quality) {
        this.serviceQuality = quality;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    public final double getServiceRate() {
        double tipRate = 0.0;
        
        switch(this.getServiceQuality()) {
            case GOOD:
                tipRate = GOOD_RATE;
                break;
            case FAIR:
                tipRate = FAIR_RATE;
                break;
            case POOR:
                tipRate = POOR_RATE;
                break;
            default:
                tipRate = 0.15;
        }
        return tipRate;
    }
    
    public abstract double getTip();
    
}
