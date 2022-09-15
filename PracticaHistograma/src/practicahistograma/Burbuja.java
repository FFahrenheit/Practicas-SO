/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahistograma;

/**
 *
 * @author ivan_
 */
public class Burbuja {
    private int[] conjunto;
    
    public Burbuja(int[] conjunto){
        this.conjunto = conjunto;
    }
    
    public int[] getConjunto(){
        return this.conjunto;
    }
    
    public void sort(){
        for(int i = 0; i < conjunto.length - 1; i++){
            for(int j = 0; j < conjunto.length - i - 1 ; j++){
                if(conjunto[j] > conjunto[j+1]){
                    int temp = conjunto[j];
                    conjunto[j] = conjunto[j+1];
                    conjunto[j+1] = temp;
                }
            }
        }
    }
}
