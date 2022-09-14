/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author ivan_
 */
public class Practica1 {
    private String nombre;
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        this.mensaje = "Hola " + nombre;
        return this.mensaje;
    }
    
    public Practica1(){
        this.mensaje = "";
        this.nombre = "";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practica1 obj = new Practica1();
                  obj.setNombre("Iván");
        
        System.out.println(obj.getMensaje());
    }
    
}
