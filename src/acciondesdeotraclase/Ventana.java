/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciondesdeotraclase;

import javax.swing.*;

/**
 *
 * @author estudios
 */
public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton b1;
    
    Ventana(){
        marco= new JFrame();
        panel=new JPanel();
        b1= new JButton("Azul");
        
        marco.setLocation(540, 260);
        marco.setSize(600, 400);
        
        
        panel.add(b1);
        marco.add(panel);
        marco.setDefaultCloseOperation(3);
        marco.setVisible(true);
    }

    
    
    
}
