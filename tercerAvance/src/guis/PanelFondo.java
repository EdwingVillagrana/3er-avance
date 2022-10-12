/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author edw_v
 */
public class PanelFondo extends javax.swing.JPanel {

    public PanelFondo() {
        this.setSize(900, 850);
    }
    

    public void paintComponent(Graphics g){
        Dimension tamano = getSize();
       ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/piramide.jpg"));
        g.drawImage(imagenFondo.getImage(), 0, 0, (int)this.getWidth(), this.getHeight(), null);
        imagenFondo.setImageObserver(this);
        setOpaque(false);
        
        super.paintComponent(g);
    }
    
    
}
