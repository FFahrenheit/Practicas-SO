/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * @author ivan_
 */
public class Utils {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public static Color getRandomColor(){
        return new Color(getRandomNumber(0, 255), getRandomNumber(0, 255), getRandomNumber(0, 255));
    }
    
   public static void log(String message, JTextArea logger){
        logger.append("[" + java.time.LocalTime.now() + "] " + message + "\n");
        logger.setCaretPosition(logger.getDocument().getLength());
    }

}
