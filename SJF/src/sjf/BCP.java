/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjf;

/**
 *
 * @author ivan_
 */
public class BCP {
    private int STEP_SIZE = 250;
    public int totalSteps;
    public int remainingTime;
    public int runTime;
    public int totalTime;
    public int processNumber;
    
    public BCP(int steps, int processNumber){
        this.processNumber = processNumber;
        this.totalSteps = steps;
        this.totalTime = this.totalSteps * this.STEP_SIZE;
        this.remainingTime = this.totalTime;
        this.runTime = 0;
    }
    
    public void setStepSize(int stepSize){
        this.STEP_SIZE = stepSize;                
        this.totalTime = this.totalSteps * this.STEP_SIZE;

    }
    
    public void nextCycle(){
        this.remainingTime -= this.STEP_SIZE;
        this.runTime += this.STEP_SIZE;
    }
    
    public int getStepSize(){
        return this.STEP_SIZE;
    }

    @Override
    public String toString() {
        return "BCP{" + "STEP_SIZE=" + STEP_SIZE + ", totalSteps=" + totalSteps + ", remainingTime=" + remainingTime + ", runTime=" + runTime + ", totalTime=" + totalTime + ", processNumber=" + processNumber + '}';
    }
    
    
}