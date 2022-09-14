/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_so;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ivan_
 */
public class Practica1_SO extends JFrame implements ActionListener{

    JTextField txtNumero1, txtNumero2, txtResultado;
    JLabel lblNumero1, lblNumero2, lblResultado;
    JButton btnSuma, btnResta, btnMultiplicacion, btnDivision;
    
    public Practica1_SO(){
        this.setBounds(0, 0, 325, 200);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.lblNumero1 = new JLabel();
        this.lblNumero1.setBounds(10, 10, 150, 20);
        this.lblNumero1.setName("lblNumero1");
        this.lblNumero1.setText("Ingrese numero 1:");
        this.lblNumero1.setVisible(true);
        this.add(this.lblNumero1);
        
        this.txtNumero1 = new JTextField();
        this.txtNumero1.setBounds(150, 10, 150, 20);
        this.txtNumero1.setName("txtNumero1");
        this.txtNumero1.setText("");
        this.txtNumero1.setVisible(true);
        this.add(this.txtNumero1);
        
        this.lblNumero2 = new JLabel();
        this.lblNumero2.setBounds(10, 40, 150, 20);
        this.lblNumero2.setName("lblNumero2");
        this.lblNumero2.setText("Ingrese numero 2:");
        this.lblNumero2.setVisible(true);
        this.add(this.lblNumero2);
        
        this.txtNumero2 = new JTextField();
        this.txtNumero2.setBounds(150, 40, 150, 20);
        this.txtNumero2.setName("txtNumero2");
        this.txtNumero2.setText("");
        this.txtNumero2.setVisible(true);
        this.add(this.txtNumero2);
        
        this.lblResultado = new JLabel();
        this.lblResultado.setBounds(10, 70, 150, 20);
        this.lblResultado.setName("lblResultado");
        this.lblResultado.setText("Resultado:");
        this.lblResultado.setVisible(true);
        this.add(this.lblResultado);
        
        this.txtResultado = new JTextField();
        this.txtResultado.setBounds(150, 70, 150, 20);
        this.txtResultado.setName("txtResultado");
        this.txtResultado.setText("");
        this.txtResultado.setVisible(true);
        this.txtResultado.setEditable(false);
        this.add(this.txtResultado);
        
        this.btnSuma = new JButton();
        this.btnSuma.setBounds(10, 120, 70, 20);
        this.btnSuma.setName("btnSuma");
        this.btnSuma.setText("+");
        this.btnSuma.setVisible(true);
        this.btnSuma.addActionListener(this);
        this.add(this.btnSuma);
        
        this.btnResta = new JButton();
        this.btnResta.setBounds(80, 120, 70, 20);
        this.btnResta.setName("btnResta");
        this.btnResta.setText("-");
        this.btnResta.setVisible(true);
        this.btnResta.addActionListener(this);
        this.add(this.btnResta);
        
        this.btnMultiplicacion = new JButton();
        this.btnMultiplicacion.setBounds(150, 120, 70, 20);
        this.btnMultiplicacion.setName("btnMultiplicacion");
        this.btnMultiplicacion.setText("*");
        this.btnMultiplicacion.setVisible(true);
        this.btnMultiplicacion.addActionListener(this);
        this.add(this.btnMultiplicacion);
        
                
        this.btnDivision = new JButton();
        this.btnDivision.setBounds(220, 120, 70, 20);
        this.btnDivision.setName("btnDivision");
        this.btnDivision.setText("/");
        this.btnDivision.setVisible(true);
        this.btnDivision.addActionListener(this);
        this.add(this.btnDivision);
    }
    
    public static void main(String[] args) {
        Practica1_SO ob = new Practica1_SO();
        ob.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Double numero1 = Double.parseDouble(this.txtNumero1.getText());
        Double numero2 = Double.parseDouble(this.txtNumero2.getText());
        Double resultado;
        
        if(e.getSource() == this.btnSuma){
            resultado = numero1 + numero2;
        }else if(e.getSource() == this.btnResta){
            resultado = numero1 - numero2;
        }else if(e.getSource() == this.btnMultiplicacion){
            resultado = numero1 * numero2;
        }else if(e.getSource() == this.btnDivision){
            resultado = numero1 / numero2;
        }else{
            return;
        }
        this.txtResultado.setText("" + resultado);
    }
    
}
