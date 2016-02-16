/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author etherdesign
 */
public class KeyboardInput implements MessageInputter {
    
    private String kInput;
    
    public KeyboardInput() {
        this.setInput();
    }
    
    @Override
    public void setInput() {
        kInput = JOptionPane.showInputDialog(null, "Enter message here: ");
    }
    
    @Override
    public String getInput() {
        return kInput;
    }
    
}
