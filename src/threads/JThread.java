/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author sterling
 */
public class JThread extends Thread {
    public JThread(String tName) {
        super(tName);
    }
    
    public void run() {
        System.out.println(getName() + " running.");
    }
}