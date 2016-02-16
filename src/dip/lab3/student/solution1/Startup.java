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
public class Startup {

    public static void main(String[] args) {

        // add high level messageservice
        // add message to interfaces
        MessageService thisMessage = new MessageService();
        MessageInputter input1 = new KeyboardInput();
        MessageInputter input2 = new ArrayInput();
        MessageOutputter output1 = new ConsoleOutput();
        MessageOutputter output2 = new GUIOutput();

        MessageInputter[] inputArray = {input1, input2};
        MessageOutputter[] outputArray = {output1, output2};

        for (int i = 0; i < inputArray.length; i++) {
            thisMessage.getMessage(inputArray[i], outputArray[i]);
        }
    }

}
