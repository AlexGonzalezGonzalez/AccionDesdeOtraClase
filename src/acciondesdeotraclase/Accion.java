/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciondesdeotraclase;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author estudios
 */
public class Accion implements ActionListener {
    Ventana v= new Ventana();
  public   Accion(){
        
      v.b1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
           v.panel.setBackground(Color.BLUE);
            
       
    }

}
