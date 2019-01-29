/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sterling
 */
public class Threads {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Demo simple threads with start and run
        System.out.println("Showing simple thread execution:");
        
        System.out.println("Showing thread execution using runnable:");
        runnableThreads();

        System.out.println("Showing thread execution using executors:");
        executorThreads();
        
        TimeUnit.SECONDS.sleep(10); // A really unsophisticated way of exiting 
                                    // the program somewhat gracefully.
        System.exit(0);
    }
    
    private static void simpleThreads() {
        JThread thread1 = new JThread("Thread 1");
        JThread thread2 = new JThread("Thread 2");
        thread1.start();
        thread2.start();
    }  
    
    private static void runnableThreads() {
        Runnable demoTask = new RunnableExample();
        Thread thread1 = new Thread(demoTask);
        thread1.start();
    }
    
    private static void executorThreads() {
        ExecutorService demoService = Executors.newFixedThreadPool(10);
        for (int i=0; i<20; i++){
            demoService.submit(new RunnableExample());
        }
    }
}
