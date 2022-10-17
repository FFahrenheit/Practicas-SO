/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author ivan_
 */
public class ThreadWork implements Runnable{
    private final int totalSteps;
    private final int delay;
    private final JProgressBar processGraphic;
    private final String processName; 
    private final JTextArea logger;
    
    public ThreadWork(int steps, JProgressBar processGraphic, String processName, JTextArea logger, int delay){
        this.totalSteps = steps;
        this.processGraphic = processGraphic;
        this.processGraphic.setMaximum(steps);
        this.processName = processName;
        this.logger = logger;
        this.delay = delay;
    }
    
    @Override
    public void run() {
        this.log(this.processName + " ha iniciado\n");
        for (int i = 1; i <= totalSteps; i++) {
            try {
                processGraphic.setValue(i);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.log(this.processName + " finalizó con éxito\n");

    }
    
    private void log(String message){
        this.logger.append("[" + java.time.LocalTime.now() + "] " + message);
        this.logger.setCaretPosition(this.logger.getDocument().getLength());
    }
}
