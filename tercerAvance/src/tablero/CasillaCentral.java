/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tablero;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author edw_v
 */
public class CasillaCentral implements Graphic{

    private int x;
    private int y;
    
    public CasillaCentral(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void dibujar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3.0f));
        g2.setColor(Color.red);
        g2.drawRect(x, y, 50, 50);
    }

}
