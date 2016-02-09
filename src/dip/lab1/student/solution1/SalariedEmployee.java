/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author etherdesign
 */
public class SalariedEmployee implements Employee {
    
    private double totalHrsForYear;
    private double annualSalary;
    private double annualBonus;
    
    public SalariedEmployee(double annualSalary, double totalHrsForYear) {
        this.annualSalary = annualSalary;
        this.totalHrsForYear = totalHrsForYear;
        annualBonus = 0.0;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }
    
    
}
