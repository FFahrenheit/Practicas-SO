/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayDeque;
import models.ThreadWork;

/**
 *
 * @author ivan_
 */
public class Scheduler {
    private final ArrayDeque<ThreadWork> jobsQueue = new ArrayDeque<>();
    
    public void addJob(ThreadWork job){
        jobsQueue.add(job);
    }
    
    public void run(){
        for(ThreadWork job : jobsQueue){
            try {
                new Thread((Runnable) job).start();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
