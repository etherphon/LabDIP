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
public class FoodServiceTipCalculator extends ServiceCalculator {
    
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double bill;
    
    public FoodServiceTipCalculator(double bill, ServiceQuality quality) {
        super(quality);
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    
    @Override
    public double getTip() {
        return bill * this.getServiceRate();
    }
    
    
}
