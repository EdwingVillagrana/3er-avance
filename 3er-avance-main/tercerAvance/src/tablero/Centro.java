/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tablero;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author edw_v
 */
public class Centro implements Graphic{
    
    private List<Graphic> casillasCentrales;
    
    public void paint(Graphics g){
        dibujar(g);
    }

    @Override
    public void dibujar(Graphics g) {
        casillasCentrales = new ArrayList<Graphic>();
        casillasCentrales.add(new CasillaCentral(430, 460));
        casillasCentrales.add(new CasillaCentral(430, 410));
        casillasCentrales.add(new CasillaCentral(480, 460));
        casillasCentrales.add(new CasillaCentral(480, 410));
        
        for (Graphic casilla : casillasCentrales) {
            casilla.dibujar(g);
        }
    }

}
