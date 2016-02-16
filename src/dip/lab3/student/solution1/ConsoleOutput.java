/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author etherdesign
 */
public class ConsoleOutput implements MessageOutputter {
    
    public String cOutput;
    
    @Override
    public void output(MessageInputter input) {
        System.out.println(input.getInput());
    }
    
}
