/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import java.text.NumberFormat;
/**
 *
 * @author etherdesign
 */
public class Startup {
 
    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000,0);
        
        Employee[] employees = {emp1, emp2, emp3};
        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        System.out.println("Employee 1 annual compensation: " +
            nf.format(hr.getEmployeeAnnualWages(emp1)));
        System.out.println("Employee 2 annual compensation: " +
            nf.format(hr.getEmployeeAnnualWages(emp2)));
        System.out.println("Employee 3 annual compensation: " +
            nf.format(hr.getEmployeeAnnualWages(emp3)));
        
        for (Employee e : employees) {
            System.out.println(nf.format(hr.getEmployeeAnnualWages(e)));
        }
        
        
    }

    
    
}
