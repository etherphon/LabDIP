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

        Inputter input1 = new KeyboardInput();
        Inputter input2 = new ArrayInput();
        Outputter output1 = new ConsoleOutput();
        Outputter output2 = new GUIOutput();

        Inputter[] inputArray = {input1, input2};
        Outputter[] outputArray = {output1, output2};

        for (Outputter o : outputArray) {
            o.output(input1);
            o.output(input2);
        }
    }

}
