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
public class ArrayInput implements MessageInputter {
    
    String[] aInput = {"One", "Two", "Three", "Four"};
    
    @Override
    public void setInput() {
    }
    
    @Override
    public String getInput() {
        return aInput[1];
    }
    
}
