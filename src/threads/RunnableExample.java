/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jswrigh
 */
public class RunnableExample implements Runnable {
    public void run() {
        System.out.println("Starting thread " 
                + Thread.currentThread().getName() + " using runnable");
        try {
            Thread.sleep(2000); // pause the thread for a second
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ending task using runnable");
    }
}
