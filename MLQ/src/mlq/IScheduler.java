/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlq;

/**
 *
 * @author ivan_
 */
public interface IScheduler {
    void addJob(ThreadWork threadWork);

    void removeJob(ThreadWork threadWork);

    void endSlice(ThreadWork threadWork);

    void start();
}
