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
public class GUIOutput implements MessageOutputter {
    
    public String gOutput;
    
    @Override
    public void output(MessageInputter input) {
        JOptionPane.showMessageDialog(null,input.getInput());
    }
    
}
