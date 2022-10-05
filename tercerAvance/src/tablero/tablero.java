/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablero;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author edw_v
 */
public class tablero extends JPanel{

    public void paint(Graphics g){
//        Dimension tamano = getSize();
//        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/selva.jpg"));
//        g.drawImage(imagenFondo.getImage(), 0, 0, 1000, 1000, null);
//        imagenFondo.setImageObserver(this);
//        setOpaque(false);
//        
//        super.paintComponent(g);
        
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;        

        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(430, 10, 100, 100, 90, 90, Arc2D.PIE));
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(430, 10, 100, 100, 0, 90, Arc2D.PIE));
      
        g.drawRect(430, 60, 50, 50);
        g.drawRect(480, 60, 50, 50);
        g.drawRect(430, 110, 50, 50);
        g.drawRect(480, 110, 50, 50);
        g.drawRect(430, 160, 50, 50);
        g.drawRect(480, 160, 50, 50);
        g.drawRect(430, 210, 50, 50);
        g.drawRect(480, 210, 50, 50);
        g.drawRect(430, 260, 50, 50);
        g.drawRect(480, 260, 50, 50);
        g.drawRect(430, 310, 50, 50);
        g.drawRect(480, 310, 50, 50);
        g.drawRect(430, 360, 50, 50);
        g.drawRect(480, 360, 50, 50);
        
        g2d.setStroke(new BasicStroke (6.0f));
        g2d.drawRect(430, 410, 50, 50);
        g2d.drawRect(480, 410, 50, 50);
        g2d.drawRect(430, 460, 50, 50);
        g2d.drawRect(480, 460, 50, 50);
        g2d.setStroke(new BasicStroke(3.0f));
        
        g.drawRect(430, 510, 50, 50);
        g.drawRect(480, 510, 50, 50);
        g.drawRect(430, 560, 50, 50);
        g.drawRect(480, 560, 50, 50);
        g.drawRect(430, 610, 50, 50);
        g.drawRect(480, 610, 50, 50);
        g.drawRect(430, 660, 50, 50);
        g.drawRect(480, 660, 50, 50);
        g.drawRect(430, 710, 50, 50);
        g.drawRect(480, 710, 50, 50);
        g.drawRect(430, 760, 50, 50);
        g.drawRect(480, 760, 50, 50);
        g.drawRect(430, 810, 50, 50);
        g.drawRect(480, 810, 50, 50);
        
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(430, 810, 100, 100, 270, 90, Arc2D.PIE));
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(430, 810, 100, 100, 180, 90, Arc2D.PIE));
        
        
        g.drawRect(380, 410, 50, 50);
        g.drawRect(380, 460, 50, 50);
        g.drawRect(330, 410, 50, 50);
        g.drawRect(330, 460, 50, 50);
        g.drawRect(280, 410, 50, 50);
        g.drawRect(280, 460, 50, 50);
        g.drawRect(230, 410, 50, 50);
        g.drawRect(230, 460, 50, 50);
        g.drawRect(180, 410, 50, 50);
        g.drawRect(180, 460, 50, 50);
        g.drawRect(130, 410, 50, 50);
        g.drawRect(130, 460, 50, 50);
        g.drawRect(80, 410, 50, 50);
        g.drawRect(80, 460, 50, 50);
        
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(30, 410, 100, 100, 90, 90, Arc2D.PIE));
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(30, 410, 100, 100, 180, 90, Arc2D.PIE));
        
        g.drawRect(530, 410, 50, 50);
        g.drawRect(530, 460, 50, 50);
        g.drawRect(580, 410, 50, 50);
        g.drawRect(580, 460, 50, 50);
        g.drawRect(630, 410, 50, 50);
        g.drawRect(630, 460, 50, 50);
        g.drawRect(680, 410, 50, 50);
        g.drawRect(680, 460, 50, 50);
        g.drawRect(730, 410, 50, 50);
        g.drawRect(730, 460, 50, 50);
        g.drawRect(780, 410, 50, 50);
        g.drawRect(780, 460, 50, 50);
        g.drawRect(830, 410, 50, 50);
        g.drawRect(830, 460, 50, 50);
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(830, 410, 100, 100, 270, 90, Arc2D.PIE));
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Arc2D.Double(830, 410, 100, 100, 0, 90, Arc2D.PIE));
        

        g2d.setPaint(Color.orange);
        g2d.fillOval(446, 25, 30, 30);
        
        
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tablero");
        
        tablero objeto = new tablero();
        ventana.add(objeto);
        ventana.setSize(1900, 1000);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
