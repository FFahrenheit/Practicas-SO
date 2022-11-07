/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlq;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author ivan_
 */
public class RRScheduler extends Thread implements IScheduler{
    private final ArrayList<ThreadWork> jobsQueue = new ArrayList<>();
    private JTextArea logger;
    
    public RRScheduler(JTextArea logger){
        this.logger = logger;
    }
    
    public synchronized void addJob(ThreadWork job){
        jobsQueue.add(job);
    }
    
    public synchronized void removeJob(ThreadWork job){
        jobsQueue.remove(job);
    }
    
    public void endSlice(ThreadWork t) {
        synchronized(t) {
            synchronized (this) {
                notify();
            }
            try {
                t.wait();
            } catch (Exception e) {
                System.out.println("Unexpected interrupt in endSlice " + e);
            }
        }
    }
    
    public synchronized void run() {
        int count = 0;
        while (jobsQueue.size() > 0) {
            if(count >= jobsQueue.size()){
                count = 0;
            }
            
            ThreadWork nextRunner = jobsQueue.get(count);
            Utils.log("RR: Proceso " + nextRunner.bcp.processNumber + " ha empezado a ejecutarse", logger);
            count++;
            
            synchronized (nextRunner) {
                nextRunner.notify();
            }
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Unexpected interrupt in run " + e);
            }
        }
    }
}
