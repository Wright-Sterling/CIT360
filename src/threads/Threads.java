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
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demo simple threads with start and run
        simpleThreads();
    }
    
    private static void simpleThreads() {
        JThread thread1 = new JThread("Thread 1");
        JThread thread2 = new JThread("Thread 2");
        thread1.start();
        thread2.start();
    }    
}
