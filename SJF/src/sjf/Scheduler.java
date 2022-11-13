/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjf;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author ivan_
 */
class Scheduler extends Thread{
    private final ArrayList<ThreadWork> jobsQueue = new ArrayList<>();
    private boolean newProcess = false;
    private JTextArea logger;
    
    public Scheduler(JTextArea logger){
        this.logger = logger;
    }
    
    public synchronized void addJob(ThreadWork job) {
        jobsQueue.add(job);
    }
    
    public synchronized void raiseNewFlag(){
        this.newProcess = true;
    }

    public synchronized void removeJob(ThreadWork t) {
        this.newProcess = true;
        jobsQueue.remove(t);
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
        this.newProcess = true;
        ThreadWork nextRunner = jobsQueue.get(0);
        
        while (jobsQueue.size() > 0) {
            if(newProcess){
                ThreadWork oldRunner = nextRunner;
                Utils.log("Buscando nuevo proceso...", logger);
                nextRunner = jobsQueue.get(0);
                for (ThreadWork w: jobsQueue) {
                    if (w.bcp.remainingTime < nextRunner.bcp.remainingTime){
                        nextRunner = w;
                        this.newProcess = false;
                        System.out.println("Next runner");
                    }
                }
                this.newProcess = false;
                if(oldRunner != nextRunner){
                    Utils.log("Proceso " + nextRunner.bcp.processNumber + " seleccionado" , logger);
                }else{
                    Utils.log("Se sigue ejecutando el proceso "+ nextRunner.bcp.processNumber, logger);
                }
            }
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
