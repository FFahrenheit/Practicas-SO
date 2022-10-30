/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rr;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author ivan_
 */
public class ThreadWork extends Thread{
    private final int totalSteps;
    private final Scheduler scheduler;
    private final int delay;
    private final JProgressBar processGraphic;
    private final String processName; 
    private final JTextArea logger;
    
    public ThreadWork(int steps, JProgressBar processGraphic, Scheduler scheduler, String processName, JTextArea logger, int delay){
        this.totalSteps = steps;
        this.processGraphic = processGraphic;
        this.scheduler = scheduler;
        this.processGraphic.setMaximum(steps);
        this.processName = processName;
        this.logger = logger;
        this.delay = delay;
        
        synchronized(this){
            start();
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    private void addToReadyQueue(){
        scheduler.addJob(this);
        synchronized(this){
            notify();
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    private void removeFromReadyQueue(){
        scheduler.removeJob(this);
        scheduler.endSlice(this);
    }
    
    @Override
    public void run() {
        this.addToReadyQueue();
        this.log(this.processName + " ha iniciado\n");
        
        for (int i = 1; i <= totalSteps; i++) {
            processGraphic.setValue(i);
            
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             scheduler.endSlice(this);
        }
        
        this.log(this.processName + " finalizó con éxito\n");
        this.removeFromReadyQueue();
    }
    
    private void log(String message){
        this.logger.append("[" + java.time.LocalTime.now() + "] " + message);
        this.logger.setCaretPosition(this.logger.getDocument().getLength());
    }
}
