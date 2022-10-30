/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author ivan_
 */
public class ThreadWork extends Thread {
    public BCP bcp;
    private final JProgressBar progressGraphic;
    private final Scheduler scheduler;
    private final JTextArea logger;
    
    public ThreadWork(BCP bcp, JProgressBar progressGraphic, Scheduler scheduler, JTextArea logger){
        this.bcp = bcp;
        this.progressGraphic = progressGraphic;
        this.progressGraphic.setMaximum(this.bcp.totalSteps);
        this.progressGraphic.setMinimum(0);
        this.scheduler = scheduler;
        this.logger = logger;
        this.updateBar(0);
        this.log("Proceso " + bcp.processNumber + " ha llegado");
        synchronized (this) {
            start();
            try {
                wait(); // for process to be ready
            } catch (InterruptedException ignored) {
            }
        }
    }
    
    private void addToReadyQueue() {
        scheduler.addJob(this);
        synchronized (this) {
            notify(); // so constructor completes
            try {
                wait(); // so process is waiting when scheduler starts
            } catch (InterruptedException ignored) {
            }
        }
    }
    
    private void updateBar(int i){
        this.progressGraphic.setValue(i);
        String text = "Proceso %d: %d / %d (%d)";
        this.progressGraphic.setString(String.format(text, this.bcp.processNumber, this.bcp.runTime, this.bcp.totalTime, this.bcp.runTime));
        this.progressGraphic.repaint();
    }

    private void removeFromReadyQueue() {
        scheduler.removeJob(this);
        scheduler.endSlice(this); // want something else to run!
    }

    @Override
    public void run() {
        addToReadyQueue();
        System.out.println(this.bcp);
        for(int i=1; i<= this.bcp.totalSteps; i++){
            this.bcp.nextCycle();
            this.updateBar(i);
            try{
                Thread.sleep(this.bcp.getStepSize());
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            scheduler.endSlice(this);
        }
        this.log("Proceso " + this.bcp.processNumber + " ha finalizado");
        removeFromReadyQueue();
    }
    
    private void log(String message){
        this.logger.append("[" + java.time.LocalTime.now() + "] " + message + "\n");
        this.logger.setCaretPosition(this.logger.getDocument().getLength());
    }
}
